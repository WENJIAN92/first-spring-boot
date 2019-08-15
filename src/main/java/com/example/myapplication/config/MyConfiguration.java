package com.example.myapplication.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * 當項目針對某一個配置不需要啟用自動配置時，可修改@EnableAutoConfiguration的exclude屬性值，來排除不需要的配置
 * 另外也可以通過配置spring.autoconfigure.exclude配置信息來排除不需要自動配置的class
 * @author Jacky
 *
 */
@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class MyConfiguration {

}
