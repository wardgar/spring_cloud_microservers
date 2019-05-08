package com.github.warger.service.impl;

import com.github.warger.service.ProvideService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/5/7.
 */
@Service
public class ProvideServiceImpl implements ProvideService {

  @Value("${server.port}")
  String port;

  @Override
  public String home(String name) {
    return name + " register port: " + port;
  }

  @Override
  public String home2(Integer userId, String name) {
    return name + " userId: " + userId +" port: " + port;
  }
}
