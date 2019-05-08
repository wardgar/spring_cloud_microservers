package com.github.warger.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2019/5/7.
 *
 * @FeignClient(value = "service-hi", fallback = FeignServiceHiHystric.class), value:指定服务提供名称， fallback指定断路器调用
 */
@FeignClient(value = "service-hi", fallback = FeignServiceHiHystric.class)
public interface FeignService {

  @RequestMapping(value = "/home", method = RequestMethod.GET)
  String sayHiFromClientOne(@RequestParam(value = "name") String name);

  @RequestMapping(value = "/home2", method = RequestMethod.GET)
  String sayHiFromClientOne2(@RequestParam(value = "userId") Integer userId,
                             @RequestParam(value = "name") String name);

}
