package com.wm.consulconsumer.controller;

import com.wm.consulconsumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王锰
 * @date 11:34 2019/6/4
 */
@RestController
public class TestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private TestService testService;


    @GetMapping("/{id}")
    public String get1(@PathVariable("id")String id){
        return testService.get1(id);
    }

}
