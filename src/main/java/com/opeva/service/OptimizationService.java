package com.opeva.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class OptimizationService implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("OptimizationService: Rota optimizasyonu çalışıyor...");
        execution.setVariable("routeFound", true);
    }
}
