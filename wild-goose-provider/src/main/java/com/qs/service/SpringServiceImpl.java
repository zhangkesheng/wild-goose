package com.qs.service;

import com.alibaba.dubbo.config.annotation.Service;
import lombok.extern.slf4j.Slf4j;

/**
 * @author FBin
 * @time 2019/1/21 13:12
 */
@Slf4j
@Service(version = "1.0.0", interfaceClass = SpringService.class, timeout = 5000)
public class SpringServiceImpl implements SpringService {
    @Override
    public String sayHello() {
        return "hello world ,hello dubbo";
    }
}
