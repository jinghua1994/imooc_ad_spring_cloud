package com.imooc.ad.vo;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {


    private  String  username;

    public boolean vaildate(){

        if(StringUtils.isEmpty(username)){
            return false;
        }
            return  true;
        }

}
