package com.opeva.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("service_task_send_r4s_to_sumo")
public class SendR4SimulationToSumoDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        // R4Simulation verisini al
        String r4Simulation = (String) execution.getVariable("r4Simulation");

        // Örnek: SUMO'ya gönderim (yalnızca log)
        System.out.println("[SendR4SimulationToSumoDelegate] SUMO'ya gönderilen R4Simulation verisi: " + r4Simulation);
    }
}