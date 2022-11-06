package com.task.api.taskapi.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/task")
public class HomeController {

    @ApiOperation(value = "Test")
    @GetMapping("/get")
    public ResponseEntity get() {
        return new ResponseEntity<String>("fuck",HttpStatus.ACCEPTED);
    }

}
