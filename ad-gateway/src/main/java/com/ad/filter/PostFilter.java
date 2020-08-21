package com.ad.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PostFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.SEND_RESPONSE_FILTER_ORDER-1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext  context=RequestContext.getCurrentContext();
        Long startTime = (Long)context.get("startTime");
        Long endTime=System.currentTimeMillis();
        String uri=context.getRequest().getRequestURI();
        long duration=endTime-startTime;
        log.info("uri:"+uri+"，duration:"+duration/100+"ms");

        return null;
    }
}
