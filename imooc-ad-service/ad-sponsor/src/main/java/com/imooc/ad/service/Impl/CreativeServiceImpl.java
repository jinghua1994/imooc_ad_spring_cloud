package com.imooc.ad.service.Impl;

import com.imooc.ad.dao.CreativeRepository;
import com.imooc.ad.entity.Creative;
import com.imooc.ad.service.ICreativeService;
import com.imooc.ad.vo.CreateUserRequest;
import com.imooc.ad.vo.CreativeRequest;
import com.imooc.ad.vo.CreativeResponse;
import org.springframework.beans.factory.annotation.Autowired;

public class CreativeServiceImpl implements ICreativeService {

    @Autowired
    private CreativeRepository creativeRepository;

    @Override
    public CreativeResponse createCreative(CreativeRequest creativeRequest) {


        Creative creative=creativeRepository.save(creativeRequest.convertToEntity());


        return new CreativeResponse(creative.getId(),creative.getName());
    }
}
