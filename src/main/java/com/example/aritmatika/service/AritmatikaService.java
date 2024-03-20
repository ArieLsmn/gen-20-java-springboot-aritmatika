package com.example.aritmatika.service;

import org.springframework.stereotype.Service;

@Service
public class AritmatikaService {

    public AritmatikaService(){

    }

    public double addition(double a,double b){
        return a+b;
    }
    public double subtract(double a,double b){
        return a-b;
    }
    public double multiply(double a,double b){
        return a*b;
    }
    public double division(double a,double b){
        if (b==0){
            throw new ArithmeticException("Divide by zero");
        }
        return a/b;
    }

}
