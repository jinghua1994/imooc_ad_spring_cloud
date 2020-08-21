package com.imooc.ad.service;

import com.imooc.ad.exception.AdException;
import com.imooc.ad.vo.AdUnitRequest;
import com.imooc.ad.vo.AdUnitResponse;

public interface IUnitService {

    AdUnitResponse createUnit(AdUnitRequest request) throws AdException;


}
