package com.qs.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.qs.dto.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * 登录服务实现类
 *
 * @author FBin
 * @time 2019/1/21 10:46
 */
@Slf4j
@Component
@Service(version = "1.0.0", interfaceClass = RemoteLoginService.class, timeout = 5000)
public class RemoteLoginServiceImpl implements RemoteLoginService {
    @Override
    public ResponseDto loginByAccountAndPassword(String account, String password) {
        if(StringUtils.isBlank(account)){

        }
        if(StringUtils.isBlank(password)){

        }
        return ResponseDto.builder().code("0").message("登录成功").data(UUID.randomUUID()).build();
    }

}
