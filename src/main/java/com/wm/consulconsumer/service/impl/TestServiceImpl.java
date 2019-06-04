package com.wm.consulconsumer.service.impl;

import com.wm.consulconsumer.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 王锰
 * @date 11:47 2019/6/4
 */
@Service
@Slf4j
public class TestServiceImpl implements TestService {

    @Override
    public String get1(String id) {
        log.error("进入测试回调接口");
        return null;
    }
}
