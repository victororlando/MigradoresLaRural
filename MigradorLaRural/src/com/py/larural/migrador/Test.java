package com.py.larural.migrador;

/**
 *
 * @author victoro
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Objeto o = new Objeto();
        SumaObject so = new SumaObject();
        
        so.setValorSuma(0d);
        o.setD(so.getValorSuma());
        
        so.setValorSuma(10d);
        
        System.out.println(o.getD());

    }

    public static class Objeto {

        double d;

        public double getD() {
            return d;
        }

        public void setD(double d) {
            this.d = d;
        }

    }
    
    public static class SumaObject{
        double valorSuma;

        public double getValorSuma() {
            return valorSuma;
        }

        public void setValorSuma(double valorSuma) {
            this.valorSuma = valorSuma;
        }
        
    }

}
