package com.opeva.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("service_task_send_r4v_to_ev")
public class SendR4VehicleToEVDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        // R4Vehicle verisini al
        String r4Vehicle = (String) execution.getVariable("r4Vehicle");

        // Örnek: EV sistemine gönderim (yalnızca log)
        System.out.println("[SendR4VehicleToEVDelegate] EV'ye gönderilen R4Vehicle verisi: " + r4Vehicle);
    }
}