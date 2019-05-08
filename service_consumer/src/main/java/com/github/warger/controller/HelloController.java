package com.github.warger.controller;

import com.github.warger.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/5/7.
 */
@RestController
public class HelloController {

  @Autowired
  private FeignService feignService;

  @GetMapping(value = "/home")
  public String sayHi(@RequestParam String name) {
    return feignService.sayHiFromClientOne(name);
  }

  @GetMapping(value = "/home2")
  public String sayHi(@RequestParam Integer userId, @RequestParam String name) {
    return feignService.sayHiFromClientOne2(userId, name);
  }
}
