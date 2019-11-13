package com.hyz.service;

public interface IUserService {

    /**
     * 登录方法
     * @param username 用户名
     * @param password 密码
     * @return 是否登录成功
     */
    public boolean login(String username, String password);

}
