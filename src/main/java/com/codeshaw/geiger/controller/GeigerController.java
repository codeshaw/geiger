package com.codeshaw.geiger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GeigerController {

  private final Logger LOGGER = LoggerFactory.getLogger(GeigerController.class);

  @RequestMapping("/log")
  public String hello(@RequestParam Map<String, String> allParams) {
    LOGGER.info("Logged Data is:[{}]", allParams);
    return "OK";

  }
}
