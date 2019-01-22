package com.qs.service;

import com.qs.dto.ResponseDto;

/**
 * 登录服务接口
 *
 * @author FBin
 * @time 2019/1/21 10:36
 */
public interface RemoteLoginService {

    /**
     * 登录账户和密码登录
     *
     * @param account 账户
     * @param password 密码
     * @return
     */
    ResponseDto loginByAccountAndPassword(String account, String password);

}
