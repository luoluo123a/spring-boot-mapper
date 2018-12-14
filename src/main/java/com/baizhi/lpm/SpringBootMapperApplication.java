package com.baizhi.lpm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.baizhi.lpm.mapper")
@SpringBootApplication
public class SpringBootMapperApplication {
    
    
    
    
    

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMapperApplication.class, args);
    }
}
