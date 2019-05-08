package com.github.warger.controller;

import com.github.warger.service.ProvideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/5/7.
 */
@RestController
public class ProviderController {

  @Autowired
  private ProvideService provideService;

  @RequestMapping("/home")
  public String home(@RequestParam String name) {
    return provideService.home(name);
  }

  @RequestMapping("/home2")
  public String home2(@RequestParam Integer userId, @RequestParam String name) {
    return provideService.home2(userId, name);
  }
}
