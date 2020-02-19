package com.zju.cst.jdbc;

/**
 * @author wulixz
 * @date 9/15/19 : 1:30 PM
 * @introduction :
 */
public class EnumDemo {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        spring.showInfo();

        Season summer = Season.SUMMER;
        summer.showInfo();
    }
}

enum Season{
    SPRING("Spring","Warm"),
    SUMMER("Summer","Hot"),
    AUTUMN("Autumn","Comfortable"),
    WINTER("Winter","Cold");

    //属性私有化
    private final String name;
    private final String desc;

    private Season(String name,String desc){
        this.name = name;
        this.desc = desc;
    }

    public void showInfo(){
        System.out.println(this.name + " : " +  this.desc);
    }
}
