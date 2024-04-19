package com.example.newdatabase;

public class ItemClass {

    final private String name;
    final private  int age;
    final private String address;

    public ItemClass(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName(){
        return  name;
    }

    public int getAge(){
        return  age;
    }

    public String getAddress(){
        return  address;
    }

}
