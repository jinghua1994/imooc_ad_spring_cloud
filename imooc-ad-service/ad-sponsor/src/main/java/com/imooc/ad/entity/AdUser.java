package com.imooc.ad.entity;

import com.imooc.ad.constant.CommonStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "ad_user")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class AdUser {
    @Basic

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username" , nullable=false)
    private String username;
    @Column(name = "token",nullable = false)
    private String token;
    @Column(name="user_status",nullable = false)
    private Integer userStatus;
    @Column(name = "create_time",nullable = false)
    private Date createTime;
    @Column(name = "update_time",nullable = false)
    private Date updateTime;
    public AdUser(String username,String token){
        this.username=username;
        this.token=token;
        this.createTime=new Date();
        this.userStatus= CommonStatus.VALID.getStatus();
        this.updateTime=this.createTime;
    }










}
