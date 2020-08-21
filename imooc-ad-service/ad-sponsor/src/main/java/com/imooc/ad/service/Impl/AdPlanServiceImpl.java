package com.imooc.ad.service.Impl;

import com.imooc.ad.constant.CommonStatus;
import com.imooc.ad.constant.Constants;
import com.imooc.ad.dao.AdPlanRepository;
import com.imooc.ad.dao.AdUserRepository;
import com.imooc.ad.entity.AdPlan;
import com.imooc.ad.entity.AdUser;
import com.imooc.ad.exception.AdException;
import com.imooc.ad.service.IAdPlanService;
import com.imooc.ad.utils.CommonUtils;
import com.imooc.ad.vo.AdPlanGetRequest;
import com.imooc.ad.vo.AdPlanRequest;
import com.imooc.ad.vo.AdPlanResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class AdPlanServiceImpl implements IAdPlanService {


    @Autowired
    AdUserRepository adUserRepository;
    @Autowired
    AdPlanRepository adPlanRepository;

   @Transactional
    @Override
    public AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException {

        if(!request.createValidate()){
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
      Optional<AdUser>  oldUser= adUserRepository.findById(request.getUserId());
        if(oldUser.isPresent()){
            throw new AdException(Constants.ErrorMsg.SAME_NAME_ERROR);
        }
       AdPlan  oldPlan= adPlanRepository.findByUserIdAndAndPlanName(request.getUserId(), request.getPlanName());
         if(oldPlan!=null){
             throw new AdException(Constants.ErrorMsg.SAME_NAME_PLAN_ERROR);
         }
       AdPlan newPlan = adPlanRepository.save(new AdPlan(request.getUserId(), request.getPlanName(),
               CommonUtils.parseStringDate(request.getStartDate()), CommonUtils.parseStringDate(request.getEndDate()) ));

       return new AdPlanResponse(newPlan.getId(),newPlan.getPlanName());
    }

    @Override
    public List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException {

        if(!request.validate()){
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        List<AdPlan> allByIdInAndUserId = adPlanRepository.findAllByIdInAndUserId(request.getIds(), request.getUserId());
        return allByIdInAndUserId;
    }

    @Override
    @Transactional
    public AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException {

        if(!request.createValidate()){
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        AdPlan plan = adPlanRepository.findByIdAndUserId(request.getId(), request.getUserId());

        if(plan!=null){
            throw new AdException(Constants.ErrorMsg.SAME_NAME_PLAN_ERROR);
        }

        if (request.getPlanName() != null) {
            plan.setPlanName(request.getPlanName());
        }
        if (request.getStartDate() != null) {
            plan.setStartDate(
                    CommonUtils.parseStringDate(request.getStartDate())
            );
        }
        if (request.getEndDate() != null) {
            plan.setEndDate(
                    CommonUtils.parseStringDate(request.getEndDate())
            );
        }

        plan.setUpdateTime(new Date());
        plan = adPlanRepository.save(plan);

        return new AdPlanResponse(plan.getId(), plan.getPlanName());
    }

    @Override
    public void deleteAdPlan(AdPlanRequest request) throws AdException {
        if(!request.createValidate()){
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        AdPlan plan = adPlanRepository.findByIdAndUserId(request.getId(), request.getUserId());

        if(plan==null){
            throw  new AdException(Constants.ErrorMsg.CAN_NOT_FIND_RECORD);
        }

        plan.setPlanStatus(CommonStatus.INVAILD.getStatus());
        plan.setUpdateTime(new Date());
        adPlanRepository.save(plan);
    }
}
