package com.imooc.ad.entity.unit_condition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_unit_keyword")
public class AdUnitKeyword {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "unit_id",nullable = false)
    private Long unitId;
    @Column(name = "key_word",nullable = false)
    private String  keyword;

    public AdUnitKeyword(Long unitId,String keyword){
        this.unitId=unitId;
        this.keyword=keyword;
    }
}