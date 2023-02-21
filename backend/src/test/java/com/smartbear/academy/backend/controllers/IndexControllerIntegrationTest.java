package com.smartbear.academy.backend.controllers;

import com.smartbear.academy.backend.BackendApplication;
import com.smartbear.academy.backend.models.AddRequest;
import com.smartbear.academy.backend.models.AddResult;
import com.smartbear.academy.backend.models.TimeStamp;
import com.smartbear.academy.backend.services.CalculatorService;
import com.smartbear.academy.backend.services.TimeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(IndexController.class)
public class IndexControllerIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private CalculatorService calculatorService;

    @MockBean
    private TimeService timeService;

    @BeforeEach
    void setup() {
        when(timeService.getCurrentTime()).thenReturn(new TimeStamp("12:00:59"));
        when(calculatorService.addNumbers(any())).thenReturn(new AddResult(5));
    }

    @Test
    public void getTime_WhenCalled_ShouldReturnStatus200() throws Exception {
        mockMvc.perform(get("/api/time"))
                .andExpect(status().isOk());
    }

    @Test
    public void getTime_WhenCalled_ShouldReturnTimeStamp() throws Exception {
        mockMvc.perform(get("/api/time"))
                .andExpect(content().json("{\"timestamp\": \"12:00:59\"}"));
    }

    @Test
    public void addNumbers_WhenCalledWith2And3_ShouldReturn5() throws Exception {
        mockMvc.perform(post("/api/add")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content("{\"firstNum\":2,\"secondNum\":3}")
                )
                .andExpect(status().isOk())
                .andExpect(content().json("{\"result\": 5}"));
    }
}
