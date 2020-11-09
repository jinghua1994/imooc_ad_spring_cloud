package com.imooc.ad.search;

import com.imooc.ad.search.vo.SearchRequest;
import com.imooc.ad.search.vo.SearchResponse;

/**
 * @author jinghua
 * @date 2020年 11月01日 10:11:41
 **/
public interface ISearch {


    SearchResponse  fetchAds(SearchRequest searchRequest);



}
