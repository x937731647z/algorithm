package com.zju.cst.java;

/**
 * @author wulixz
 * @date 9/16/19 : 5:09 PM
 * @introduction :
 */
public class Students implements Study,Move {

    String school;
    int rank;

    public Students(){

    }

    public Students(String school){
        this.school= school;
    }
    public Students(String school, int rank){
        this.school = school;
        this.rank = rank;
    }
    public void showInfo(){
        System.out.println("the school's name is :  " + this.school );
    }
    public void showRank(){
        System.out.println("the school's name is :  " + this.school + "  and it's rank is : " +rank );
    }

    @Override
    public void move() {
        System.out.println("this is move function");
    }

    @Override
    public void study() {
        System.out.println("this is study function");
    }
}
