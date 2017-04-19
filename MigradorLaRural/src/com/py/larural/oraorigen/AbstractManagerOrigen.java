/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oraorigen;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author chiq
 */
public class AbstractManagerOrigen<T> {

    private final Class<T> entityClass;
    protected final String persitenceUnitName;
    @PersistenceContext(unitName = "MigradorLaRuralOrigenPU")
    protected EntityManager em;


    public AbstractManagerOrigen(Class<T> entityClass, String persitenceUnitName) {
        this.entityClass = entityClass;
        this.persitenceUnitName = persitenceUnitName;
        if (persitenceUnitName != null && !persitenceUnitName.equals("")) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory(this.persitenceUnitName);
            em = emf.createEntityManager();
        }
    }

    public EntityManager getEntityManager() {
        return em;
    }

    public void create(T entity) {
        getEntityManager().persist(entity);
    }


    public void edit(T entity) {
        getEntityManager().merge(entity);
    }

    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    public List<T> findAll() {
        return getEntityManager().createNamedQuery(entityClass.getSimpleName() + ".findAll").getResultList();
    }

    public List<T> findActual() {
        return getEntityManager().createNamedQuery(entityClass.getSimpleName() + ".findByActual").getResultList();
    }

    public List<T> findAllActivo() {
        return getEntityManager().createNamedQuery(entityClass.getSimpleName() + ".findAllActivo").getResultList();
    }

    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0]);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }






}
