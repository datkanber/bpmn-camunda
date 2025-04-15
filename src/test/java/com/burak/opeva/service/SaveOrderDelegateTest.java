package com.burak.opeva.service;

import com.opeva.service.SaveOrderDelegate;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class SaveOrderDelegateTest {

    private SaveOrderDelegate saveOrderDelegate;
    private DelegateExecution execution;

    @BeforeEach
    void setUp() {
        saveOrderDelegate = new SaveOrderDelegate();
        execution = mock(DelegateExecution.class);
    }

    @Test
    void shouldLogOrderDetails() throws Exception {
        // Given
        when(execution.getVariable("orderId")).thenReturn("ORD123");
        when(execution.getVariable("customerName")).thenReturn("Ahmet Yılmaz");

        // When
        saveOrderDelegate.execute(execution);

        // Then
        verify(execution, times(1)).getVariable("orderId");
        verify(execution, times(1)).getVariable("customerName");
    }
}
