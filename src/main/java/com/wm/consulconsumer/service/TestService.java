package com.wm.consulconsumer.service;

import com.wm.consulconsumer.service.impl.TestServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 王锰
 * @date 11:45 2019/6/4
 */
@FeignClient(value = "consul-producer",fallback = TestServiceImpl.class)
public interface TestService {

    @GetMapping("/{id}")
    String get1(@PathVariable("id") String id);
}
