package com.burak.opeva.service;

import com.opeva.service.SendR4SimulationToSumoDelegate;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class SendR4SimulationToSumoDelegateTest {

    private SendR4SimulationToSumoDelegate delegate;
    private DelegateExecution execution;

    @BeforeEach
    void setUp() {
        delegate = new SendR4SimulationToSumoDelegate();
        execution = mock(DelegateExecution.class);
    }

    @Test
    void shouldLogR4SimulationData() throws Exception {
        // Given
        when(execution.getVariable("r4Simulation")).thenReturn("{ \"vehicle\": \"car1\", \"route\": [1,2,3] }");

        // When
        delegate.execute(execution);

        // Then
        verify(execution, times(1)).getVariable("r4Simulation");
    }
}
