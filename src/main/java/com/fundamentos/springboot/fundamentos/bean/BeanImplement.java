package com.fundamentos.springboot.fundamentos.bean;

public class BeanImplement implements MyBean{

    @Override
    public void print() {
        System.out.println("Hola desde my implementacion propia del bean");
    }
}
