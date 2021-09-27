package com.spring.core.hotel;

import org.springframework.stereotype.Component;

@Component("cr")
public class Chineserestaurant {
    private  final Chef chef;

    public Chineserestaurant(Chef chef) {
        this.chef = chef;
    }
}
