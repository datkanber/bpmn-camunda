package com.opeva.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("fetchDataService")
public class FetchDataService implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("FetchDataService: Araç ve talep bilgileri aliniyor...");
        
        execution.setVariable("dataFetched", true);
    }
}
