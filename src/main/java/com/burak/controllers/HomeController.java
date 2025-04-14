package com.burak.controllers;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "Route Optimization BPMN Demo";
    }

    @GetMapping("/execute")
    public String executeProcess() {
        ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
        ProcessInstantiationBuilder instance = engine.getRuntimeService()
                .createProcessInstanceByKey("Process_0rizdzc");

        instance.setVariable("vehicleCount", 15);
        instance.setVariable("selectedAlgorithm", "Genetic");
        instance.setVariable("operationManager", "burak");
        instance.businessKey("route-optimization-run");
        instance.executeWithVariablesInReturn();

        return "Route optimization process started! Ayca";
    }
}