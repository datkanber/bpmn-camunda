package com.opeva.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class LoadParametersService implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("LoadParametersService: Parametreler yükleniyor...");
        execution.setVariable("paramsLoaded", true);
    }
}
