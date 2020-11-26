package com.employee.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ywq
 * @date 2020/4/14 17:04
 */
@Configuration
@EnableWebMvc
public class MyMvcConfig  implements WebMvcConfigurer {
}
