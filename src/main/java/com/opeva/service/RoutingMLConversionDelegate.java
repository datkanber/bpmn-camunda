package com.opeva.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("service_task_routingml_conversion")
public class RoutingMLConversionDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        // Örnek: Girdi verisini al
        String inputGeoJson = (String) execution.getVariable("geojsonData");

        // RoutingML dönüşüm işlemi (örnek)
        String routingML = "<routingML>" + inputGeoJson + "</routingML>";

        // Sonucu kaydet
        execution.setVariable("routingML", routingML);
        System.out.println("[RoutingMLConversionDelegate] RoutingML oluşturuldu.");
    }
}