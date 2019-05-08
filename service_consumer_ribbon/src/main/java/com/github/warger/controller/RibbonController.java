package com.github.warger.controller;

import com.github.warger.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/5/8.
 */
@RestController
public class RibbonController {


  @Autowired
  RibbonService ribbonService;

  @GetMapping(value = "/home")
  public String sayHi(@RequestParam String name) {
    return ribbonService.sayHiFromClientOne(name);
  }

  @GetMapping(value = "/home2")
  public String sayHi(@RequestParam Integer userId, @RequestParam String name) {
    return ribbonService.sayHiFromClientOne2(userId, name);
  }
}