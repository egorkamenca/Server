package com.server.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by egorka on 26.08.16.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.server.server")
public class WebConfig extends WebMvcConfigurerAdapter{
}
