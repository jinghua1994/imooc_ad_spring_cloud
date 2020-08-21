package com.imooc.ad.service.Impl;

import com.imooc.ad.constant.Constants;
import com.imooc.ad.dao.AdUserRepository;
import com.imooc.ad.entity.AdUser;
import com.imooc.ad.exception.AdException;
import com.imooc.ad.service.IUserSerivce;
import com.imooc.ad.utils.CommonUtils;
import com.imooc.ad.vo.CreateUserRequest;
import com.imooc.ad.vo.CreateUserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@Service
public class UserServiceImpl implements IUserSerivce {

    @Autowired
    AdUserRepository adUserRepository;


    @Override
    @Transactional
    public CreateUserResponse CreateUser(CreateUserRequest request)  throws AdException {


        //如果存在参数错误
        if(!request.vaildate()){
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        AdUser oldUser=adUserRepository.findByUsername(request.getUsername());
        //如果存在相同名字的用户
        if(oldUser!=null){
            throw new AdException(Constants.ErrorMsg.SAME_NAME_ERROR);
        }

       AdUser newUser= adUserRepository.save(new AdUser(request.getUsername(), CommonUtils.md5(request.getUsername())));


        return new CreateUserResponse(newUser.getId(),newUser.getUsername(),newUser.getToken(),newUser.getCreateTime(),newUser.getUpdateTime());
    }
}
