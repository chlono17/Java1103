package com.ocp10.computer;

public class ComputerStore {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer();
        System.out.println(pc.add(10, 20));
        System.out.println(pc.getName());
        Computer mobile = new IPhone();
        System.out.println(mobile.add(10, 20));
        System.out.println(mobile.getName());
    }
}
