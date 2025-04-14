package com.opeva.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("service_task_save_order")
public class SaveOrderDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        // Örnek: Sipariş verisini al
        String orderId = (String) execution.getVariable("orderId");
        String customer = (String) execution.getVariable("customerName");

        // Veriyi logla (veya veri tabanına kaydet)
        System.out.println("[SaveOrderDelegate] Sipariş Kaydedildi - ID: " + orderId + ", Müşteri: " + customer);

        // Gerekirse başka işlemler yap (ör. veritabanı kaydı, servis çağrısı vs.)
    }
} 
