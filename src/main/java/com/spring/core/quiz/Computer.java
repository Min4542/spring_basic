package com.spring.core.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //관리해주세요 프레임워크에
public class Computer {

    private final KeyBoard keyBoard;
    private final Mouse mouse;
    private final Monitor monitor;

    @Autowired //자동주입 해주세요 (생략가능 필드가 파이널일 때 생략가능 )
    public Computer(KeyBoard keyBoard, Mouse mouse, Monitor monitor) {
        this.keyBoard = keyBoard;
        this.mouse = mouse;

        this.monitor = monitor;
    }

    //부품정보를 보여주는 메서드
    public void showParts() {
        keyBoard.info();
        mouse.info();
        monitor.info();
    }

}
