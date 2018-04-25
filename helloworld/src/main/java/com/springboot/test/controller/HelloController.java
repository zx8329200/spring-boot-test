package com.springboot.test.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huwei on 2018/4/25.
 */
@RestController
@RequestMapping("hello")
@EnableAutoConfiguration
public class HelloController {

  @RequestMapping
  public String hello() {
    return "hello spring boot";
  }
}
