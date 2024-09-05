package com.example.todolist.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todolist.model.Test;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @PostMapping("/json")
    public ResponseEntity<Test> setJsonTest(
        @RequestBody Test inputTest,
        @RequestHeader("x-headertest") String headerTest
    ){

        Test newTest = new Test();
        if("invalid".equals(inputTest.getTestString())){
            return ResponseEntity.badRequest().build();
        }
        if("hackerman".equals(headerTest)){
            return ResponseEntity.status(401).build();
        }
        newTest.setTestInt(inputTest.getTestInt()+1000);
        newTest.setTestString(inputTest.getTestString()+" yeahh");
        return ResponseEntity.ok(newTest);
    }

    @GetMapping("/otherheader")
    public String otherHeaderTest(
        @RequestHeader Map<String, String> header
    ){
        return header.get("x-otherheader".toLowerCase());
    }
}
