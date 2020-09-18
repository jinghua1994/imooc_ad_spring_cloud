package com.imooc.ad.controller;

import com.alibaba.fastjson.JSON;
import com.imooc.ad.exception.AdException;
import com.imooc.ad.service.IUserSerivce;
import com.imooc.ad.vo.CreateUserRequest;
import com.imooc.ad.vo.CreateUserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class UserOPController {
    @Autowired
    private   IUserSerivce iUserSerivce;

    @PostMapping("/create/user")
    public CreateUserResponse  createUser(@RequestBody CreateUserRequest  request) throws AdException{


        log.info("ad-sponsor:create user->{}", JSON.toJSONString(request));

        return iUserSerivce.CreateUser(request) ;
    }






}
