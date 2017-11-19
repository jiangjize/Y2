package cn.jjz.spring730_1.service;

import cn.jjz.service.Car;

/**
 * Created by lenovo on 2017/7/30.
 */
public class DogService {
    private String name;
    private int age;
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public DogService(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public DogService() {
        System.out.println("我是无参--------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void DogName(){

    }

}
