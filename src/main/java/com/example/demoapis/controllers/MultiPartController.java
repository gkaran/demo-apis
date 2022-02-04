package com.example.demoapis.controllers;

import com.example.demoapis.dtos.ComplexMultiPartFormDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.validation.Valid;

@RestController
@RequestMapping("/multipart")
public class MultiPartController {

    private final Logger logger = LoggerFactory.getLogger(MultiPartController.class);

    @PostMapping(value = "/complex", consumes = "multipart/form-data")
    public void receiveComplexMultipart(@RequestPart("form") @Valid ComplexMultiPartFormDto data, MultipartHttpServletRequest request) {
        logger.info(data.toString());
        logger.info(request.getMultiFileMap().toString());
    }
}
