package com.github.warger.service.impl;

import com.github.warger.service.RibbonService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2019/5/8.
 */
@Service
public class RibbonServiceImpl implements RibbonService {


  @Autowired
  private RestTemplate restTemplate;

  @Override
  public String sayHiFromClientOne(String name) {
    return restTemplate.getForObject("http://SERVICE-HI/home?name="+name, String.class);
  }

  @Override
  @HystrixCommand(fallbackMethod = "hiError")
  public String sayHiFromClientOne2(Integer userId, String name) {
    return restTemplate.getForObject("http://SERVICE-HI/home2?userId=" + userId + "&name="+name, String.class);
  }

  @Override
  public String sorryService(){
    return "sorry request is not accept";
  }
}
