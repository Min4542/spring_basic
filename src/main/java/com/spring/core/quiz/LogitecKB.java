package com.spring.core.quiz;

import org.springframework.stereotype.Component;

@Component
public class LogitecKB implements KeyBoard{
    @Override
    public void info() {
        System.out.println("로지텍 키보드 ");
    }
}
