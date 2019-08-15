package com.example.myapplication.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * ���ذw��Y�@�Ӱt�m���ݭn�ҥΦ۰ʰt�m�ɡA�i�ק�@EnableAutoConfiguration��exclude�ݩʭȡA�ӱư����ݭn���t�m
 * �t�~�]�i�H�q�L�t�mspring.autoconfigure.exclude�t�m�H���ӱư����ݭn�۰ʰt�m��class
 * @author Jacky
 *
 */
@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class MyConfiguration {

}
