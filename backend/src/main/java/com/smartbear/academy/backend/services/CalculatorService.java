package com.smartbear.academy.backend.services;

import com.smartbear.academy.backend.models.AddRequest;
import com.smartbear.academy.backend.models.AddResult;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public AddResult addNumbers(AddRequest addRequest) {
        AddResult addResult = new AddResult();
        addResult.setResult(addRequest.getFirstNum() + addRequest.getSecondNum());
        return addResult;
    }
}
