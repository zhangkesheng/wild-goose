package com.qs.controller;

import com.qs.dto.ResponseDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FBin
 * @time 2019/1/21 11:22
 */
@RestController
public class LoginConsumerController {

    @ResponseBody
    @RequestMapping("/login")
    public ResponseDto loginByAccountAndPassword(String account, String password){
//        return remoteLoginService.loginByAccountAndPassword(account, password);
        return null;
    }

}
