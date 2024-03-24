package com.zero.demo.empty.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HealthCheckController {
    private final Logger logger = LoggerFactory.getLogger(HealthCheckController.class);

    @RequestMapping(path = {"/health_check", "healthCheck"}, method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<?> healthCheck(HttpServletRequest request) {
        logger.info("Get health check request from: {}:{}", request.getRemoteHost(), request.getRemotePort());
        return ResponseEntity.ok("ok");
    }
}
