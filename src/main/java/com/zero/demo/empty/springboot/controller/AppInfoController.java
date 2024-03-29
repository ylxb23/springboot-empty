package com.zero.demo.empty.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping(path = {"/info"})
@RestController
public class AppInfoController {
    @Value("${application.name}")
    private String name;

    @RequestMapping(path = {"/address"}, method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<?> applicationLocalAddress(HttpServletRequest request) {
        String address = String.format("%s:%d", request.getLocalAddr(), request.getLocalPort());
        return ResponseEntity.ok(address);
    }

    @RequestMapping(path = {"/name"}, method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<?> applicationName(HttpServletRequest request) {
        return ResponseEntity.ok(name);
    }
}
