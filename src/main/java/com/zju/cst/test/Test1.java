package com.zju.cst.test;

public class Test1 {
  public static void main(String[] args) {
    String str0 = "BB";
    String str1 = "AA";
    String str2 = new String("AA");
    Person p1 = new Person("AA");
    Person p2 = new Person("AA");
    String str3 = "AA" + "BB";
    String str4 = str0 + str1;
    String str5 = "AABB";
    System.out.println("str3 == str4: "+(str3 == str4));
    System.out.println("str3 == str5: "+(str3 == str5));
    System.out.println("str4 == str5: "+(str4 == str5));
    System.out.println("str1 == str2: " + (str1 == str2));
    System.out.println("str1 == p1.name: " + (str1 == p1.name));
    System.out.println("str1 == p1.get: " + (str1 == p1.get("AA")));
    System.out.println("str2 == p1.name: " + (str2 == p1.name));
    System.out.println("p1.name == p2.name: " + (p1.name == p2.name));


  }
}

class Person {
  String name;

  Person(String name) {
    this.name = name;
  }

  public String get(String ss) {
    return ss;
  }
}
