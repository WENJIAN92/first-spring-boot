package com.example.myapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * <p>spring boot���t�m��ɦV�_java�N�X�t�m
 * ����@Configuration���w�t�m�H���A�P�ɥi�����N�Ҧ��t�m����b�@��class�̭��A�i�H�q�L@Import�Ϊ�@ComponentScan
 * �t�~�p�G���·Q�ϥ�xml�t�m�A�]�i�H�ϥε���@Configuration�A�t�~�ϥε���@ImportResource�ӥ[��xml�t�m���</p>
 * <br>
 * <p>spring boot����۰ʰt�m�A�u�n�A�ݭn���ե�w�[�J�A�����Τ��A�P�ɦb���N�@�Ӱt�m�F@Configuration��class���t�m@EnableAutoConfiguration 
 * �Ϊ�  @SpringBootApplication�]��ĳ���ؤ��u�t�m�@�ӡ^�A�h�������ե�N�|�۰ʰt�m�A�ҦpHSQLDB�C</p>
 * <br>
 * <p><strong>�ϥ�@SpringBootApplication���@��</strong><br>
 * ���ϥΤF@SpringBootApplication���Ѩӻ��A�絥�P�_��ϥΤF @Configuration, @EnableAutoConfiguration�M @ComponentScan
 * �T�ӵ��ѡC</p>
 * 
 * @author Jacky 
 *
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
	}

}
