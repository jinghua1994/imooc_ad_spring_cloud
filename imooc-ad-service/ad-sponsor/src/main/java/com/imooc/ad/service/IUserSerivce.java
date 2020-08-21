package com.imooc.ad.service;

import com.imooc.ad.exception.AdException;
import com.imooc.ad.vo.CreateUserRequest;
import com.imooc.ad.vo.CreateUserResponse;

public interface IUserSerivce {

    public CreateUserResponse  CreateUser(CreateUserRequest request) throws AdException;


}
