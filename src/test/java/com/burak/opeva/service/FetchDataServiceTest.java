package com.burak.opeva.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.opeva.service.FetchDataService;

import static org.mockito.Mockito.*;

class FetchDataServiceTest {

    private FetchDataService fetchDataService;
    private DelegateExecution execution;

    @BeforeEach
    void setUp() {
        fetchDataService = new FetchDataService();
        execution = Mockito.mock(DelegateExecution.class);
    }

    @Test
    void shouldSetDataFetchedVariable() throws Exception {
        // When
        fetchDataService.execute(execution);

        // Then
        verify(execution, times(1)).setVariable("dataFetched", true);
    }
}
