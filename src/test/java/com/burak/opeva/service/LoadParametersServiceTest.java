package com.burak.opeva.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.opeva.service.LoadParametersService;

import static org.mockito.Mockito.*;

class LoadParametersServiceTest {

    private LoadParametersService service;
    private DelegateExecution execution;

    @BeforeEach
    void setUp() {
        service = new LoadParametersService();
        execution = Mockito.mock(DelegateExecution.class);
    }

    @Test
    void testExecuteSetsParamsLoaded() {
        service.execute(execution);
        verify(execution, times(1)).setVariable("paramsLoaded", true);
    }
}
