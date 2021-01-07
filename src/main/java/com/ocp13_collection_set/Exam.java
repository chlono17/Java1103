package com.ocp13_collection_set;

import com.github.javafaker.Faker;
import java.util.Random;

public class Exam implements Comparable<Exam>{
    private String name;    
    private int chinese;    
    private int english;
    private int math;
    private boolean sex;//男: true ;女: false
    
    public Exam() {
        Faker faker = new Faker();
        Random r =new Random();
        name = faker.name().lastName();
        chinese = r.nextInt(100) +1;
        english = r.nextInt(100) +1;
        math = r.nextInt(100) +1;
        sex = r.nextInt(2) == 0 ? true : false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Exam{" + "name=" + name + ", chinese=" + chinese + ", english=" + english + ", math=" + math + ", sex=" + sex + '}';
    }

    @Override
    public int compareTo(Exam o) {
        int sum = o.chinese + o.english + o.math;
        int sum2 = chinese + english + math;  
        return sum -  sum2;
    }

   
}
