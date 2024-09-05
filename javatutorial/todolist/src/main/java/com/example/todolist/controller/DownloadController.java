package com.example.todolist.controller;

import java.io.ByteArrayInputStream;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/download")
public class DownloadController {

    @GetMapping("/custom")
    public ResponseEntity<InputStreamResource> downloadTextFile(@RequestParam(required = false) String data){
        String info;
        if(data != null){
            info = data;
        }else{
            info = "empty data";
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(info.getBytes());
        InputStreamResource inputStreamResource = new InputStreamResource(byteArrayInputStream);
        return ResponseEntity.ok()
        .header("Content-Disposition","attachment; filename=\"test.txt\"")
        .contentType(MediaType.TEXT_PLAIN)
        .body(inputStreamResource);
    }
}
