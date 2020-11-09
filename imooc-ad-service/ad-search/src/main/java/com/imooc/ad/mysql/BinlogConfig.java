package com.imooc.ad.mysql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author jinghua
 * @date 2020年 10月23日 00:17:01
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "adconf.mysql")
@Component
public class BinlogConfig {

    private String host;
    private Integer port;
    private String username;
    private String password;

    private String binlogName;
    private Long position;

}
