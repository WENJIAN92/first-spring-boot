package com.example.myapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * <p>spring boot的配置更傾向于java代碼配置
 * 註解@Configuration指定配置信息，同時可不必將所有配置都放在一個class裡面，可以通過@Import或者@ComponentScan
 * 另外如果依舊想使用xml配置，也可以使用註解@Configuration，另外使用註解@ImportResource來加載xml配置文件</p>
 * <br>
 * <p>spring boot支持自動配置，只要你需要的組件已加入你的應用中，同時在任意一個配置了@Configuration的class中配置@EnableAutoConfiguration 
 * 或者  @SpringBootApplication（建議項目中只配置一個），則對應的組件將會自動配置，例如HSQLDB。</p>
 * <br>
 * <p><strong>使用@SpringBootApplication的作用</strong><br>
 * 對於使用了@SpringBootApplication註解來說，亦等同于其使用了 @Configuration, @EnableAutoConfiguration和 @ComponentScan
 * 三個註解。</p>
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
