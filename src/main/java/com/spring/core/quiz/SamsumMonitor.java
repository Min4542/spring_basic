package com.spring.core.quiz;

import org.springframework.stereotype.Component;

@Component
public class SamsumMonitor implements Monitor{
    @Override
    public void info() {
        System.out.println("삼성 모니터");
    }
}
