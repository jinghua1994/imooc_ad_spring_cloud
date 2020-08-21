package com.imooc.ad.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_creative")
public class Creative {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "type",nullable = false)
    private Integer type;

    @Column(name = "materialType",nullable = false)
    private Integer materialType;

    @Column(name = "height",nullable = false)
    private   Integer height;

    @Column(name = "width",nullable = false)
    private Integer width;

    @Column(name = "size",nullable = false)
    private Integer  size;

    /* 时长， 只有视屏不为0*/
    @Column(name = "duration",nullable = false)
    private Long  duration;

    //审核状态
    @Column(name = "audit_status",nullable = false)
    private  Integer audit_status;

    @Column(name = "userId",nullable = false)
    private  Long userId;

    @Column(name = "url",nullable = false)
    private String  url;

    @Column(name = "createTime",nullable = false)
    private Date createTime;

    @Column(name = "updateTime",nullable = false)
    private Date updateTime;





}
