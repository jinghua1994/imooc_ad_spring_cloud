package com.imooc.ad.search.Feature;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author jinghua
 * @date 2020年 11月01日 12:29:39
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KeywordFeature {
    private List<String>  keywords;
}
