package com.spring.core.cofig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //이것은 설정 파일입니다.

@ComponentScan(basePackages = "com.spring.core.quiz") //여기서 뒤지세요
public class ComputerConfig {
}
