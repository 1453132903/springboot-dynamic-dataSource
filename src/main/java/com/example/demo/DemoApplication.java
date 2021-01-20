package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.example.demo.common.DynamicDataSourceConfig;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
@Import({DynamicDataSourceConfig.class})
@ComponentScan("com.example.demo")
@MapperScan(value = "com.example.demo.mapper")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
