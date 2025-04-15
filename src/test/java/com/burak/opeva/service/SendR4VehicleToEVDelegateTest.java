package com.burak.opeva.service;

import com.opeva.service.SendR4VehicleToEVDelegate;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class SendR4VehicleToEVDelegateTest {

    private SendR4VehicleToEVDelegate delegate;
    private DelegateExecution execution;

    @BeforeEach
    void setUp() {
        delegate = new SendR4VehicleToEVDelegate();
        execution = mock(DelegateExecution.class);
    }

    @Test
    void shouldLogR4VehicleData() throws Exception {
        // Given
        when(execution.getVariable("r4Vehicle")).thenReturn("{ \"id\": \"EV001\", \"route\": [1,2,3] }");

        // When
        delegate.execute(execution);

        // Then
        verify(execution, times(1)).getVariable("r4Vehicle");
    }
}
