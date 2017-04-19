package com.py.larural.migrador;

import larural.PrcInsCotizacionPlanRenWSExecute;
import larural.PrcInsCotizacionPlanRenWSExecuteResponse;

/**
 *
 * @author victoro
 */
public class MigradorTablasDesdeWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        larural.PrcInsCotizacionPlanRenWSExecute parameters = new PrcInsCotizacionPlanRenWSExecute();
        parameters.setLrcotizacionnro(60058);
        parameters.setLrcotizacionversion(1);
        execute(parameters);

    }

    private static PrcInsCotizacionPlanRenWSExecuteResponse execute(larural.PrcInsCotizacionPlanRenWSExecute parameters) {
        larural.PrcInsCotizacionPlanRenWS service = new larural.PrcInsCotizacionPlanRenWS();
        larural.PrcInsCotizacionPlanRenWSSoapPort port = service.getPrcInsCotizacionPlanRenWSSoapPort();
        return port.execute(parameters);
    }

}
