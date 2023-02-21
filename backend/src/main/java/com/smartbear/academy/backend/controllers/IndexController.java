package com.smartbear.academy.backend.controllers;

import com.smartbear.academy.backend.models.AddRequest;
import com.smartbear.academy.backend.models.AddResult;
import com.smartbear.academy.backend.models.TimeStamp;
import com.smartbear.academy.backend.services.CalculatorService;
import com.smartbear.academy.backend.services.TimeService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RequestMapping("/api")
@RestController
public class IndexController {

    private final CalculatorService calculatorService;

    private final TimeService timeService;

    public IndexController(CalculatorService calculatorService, TimeService timeService) {
        this.calculatorService = calculatorService;
        this.timeService = timeService;
    }

    @GetMapping("/")
    public String index() {
        return "Hello world!";
    }

    @GetMapping(value = "/time", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TimeStamp> time() {
        TimeStamp timeStamp = timeService.getCurrentTime();
        return ResponseEntity.ok(timeStamp);
    }

    @PostMapping(
            value = "/add",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<AddResult> addNumbers(@RequestBody AddRequest requestBody) {
        AddResult result = calculatorService.addNumbers(requestBody);
        return ResponseEntity.ok(result);
    }
}