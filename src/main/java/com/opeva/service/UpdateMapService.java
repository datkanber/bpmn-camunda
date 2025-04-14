package com.opeva.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class UpdateMapService implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("UpdateMapService: Rota kaydediliyor ve haritada gösteriliyor...");
    }
}
