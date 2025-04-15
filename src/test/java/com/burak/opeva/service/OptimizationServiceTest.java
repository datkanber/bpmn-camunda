package com.burak.opeva.service;

import com.opeva.service.OptimizationService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

class OptimizationServiceTest {

    private OptimizationService optimizationService;
    private DelegateExecution execution;

    @BeforeEach
    void setUp() {
        optimizationService = new OptimizationService();
        execution = Mockito.mock(DelegateExecution.class);
    }

    @Test
    void shouldSetRouteFoundVariable() throws Exception {
        // When
        optimizationService.execute(execution);

        // Then
        verify(execution, times(1)).setVariable("routeFound", true);
    }
}
