package com.opeva.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("service_task_send_routingml_to_cloud")
public class SendRoutingMLToCloudDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        // RoutingML verisini al
        String routingML = (String) execution.getVariable("routingML");

        // Örnek: Cloud servisine gönderim (yalnızca loglama)
        System.out.println("[SendRoutingMLToCloudDelegate] RoutingML verisi gönderildi: " + routingML);

        // Gerçek senaryoda: HTTP POST vs. yapılabilir
    }
}