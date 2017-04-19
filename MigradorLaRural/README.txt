MigradorLaRural: Aqui se encuentran los migradores

Cada migrador tiene los siguientes parametros:
        short secc = 201; o secc = {401,403} en caso q sean varias secciones
        short ejercicio = 2017;
        short anexo = 0;
        short estado = 1;
        short tipoOperacion = 1;

- primero se deben desactivar los triggers de generacion de id's de las tablas 
donde seran persistidos los datos.
    

- despues se deben migrar los datos que son de tablas maestras, haciendo correr los siguientes archivos:
    -LrRenovMigrador
    -MigradorLrPersonaTC
    -MigradorLrPersonaParaVida
    -MigradorLrPersonaFisParaVida

- despues se continua con los demas migradores, luego de migrar las tablas maestras 
cada migrador es independiente y no depende de otro, se puede ejecutar en el orden q se desee.

Persistence.xml: En este archivo estan las configuraciones a las bases de datos.
    -MigradorLaRuralPU: es el nombre de la conexion a la base de datos de destino, actualmente hace referencia a 
    192.168.2.242:1521:LRGX2DS, se debe cambiar por la base de datos en la que se desea migrar los datos, 
    (la estructura de la base de datos elegida como destino final de datos debe ser la misma 
    a la estructura con la que se realizaron estos migradores)

    -MigradorLaRuralOrigenPU: es el nombre de la conexion a la base de datos de origen, actualmente hace referencia a 
    192.168.2.242:1521:SEGUSOFT

    -LRGXPROD: es el nombre de la conexion a la base de datos de origen, actualmente hace referencia a 
    192.168.2.10:1521:LRGX


    
OBS: En caso que se hayan eliminado campos y/o referencias entre tablas los migradores no podran ser ejecutados.


MigradorLaRuralEntidades: Aqui se encuentran las entidades 