package com.in28minutes.spring.learnspringframework.enterprise.example.data;

import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Arrays;

@Component
public class DataService{

    public List<Integer> getData(){
        return Arrays.asList(10,20,30,40);
    }
}