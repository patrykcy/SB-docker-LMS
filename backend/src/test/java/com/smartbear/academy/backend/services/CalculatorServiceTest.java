package com.smartbear.academy.backend.services;

import com.smartbear.academy.backend.models.AddRequest;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void addNumbers_WhenGiven2Plus3_ShouldReturnResultOf5() {
        // Given
        AddRequest request = new AddRequest();
        request.setFirstNum(2);
        request.setSecondNum(3);

        // When
        var result = calculatorService.addNumbers(request);

        // Then

        assertThat(result.getResult()).isEqualTo(5);
    }
}
