package cn.jjz.spring726_1;

/**
 * Created by lenovo on 2017/7/26.
 */
public class Stu {
    private String name;  //姓名
    private int age;      //年龄
    private Car car;       //车
    //带参构造
    public Stu(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }
    //无参构造
    public Stu() {
    }

    //get  set 方法

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
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
    //tostring方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
