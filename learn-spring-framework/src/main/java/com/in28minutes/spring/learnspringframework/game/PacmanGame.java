package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole{

    public void up(){
        System.out.println("Pacman jump");
    }

    public void down(){
        System.out.println("Pacman down into a hole");
    }

    public void left(){
        System.out.println("Pacman stop");
    }

    public void right(){
        System.out.println("Pacman accelerate");
    }
}
