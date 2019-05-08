package com.github.warger.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2019/5/8.
 */
@Component
public class FeignServiceHiHystric implements FeignService {

  @Override
  public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
    return "sorry "+name;
  }

  @Override
  public String sayHiFromClientOne2(@RequestParam(value = "userId") Integer userId, @RequestParam(value = "name") String name) {
    return "sorry userId="+ userId + " name = " + name;
  }
}
