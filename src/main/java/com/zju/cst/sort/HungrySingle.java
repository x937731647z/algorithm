package com.zju.cst.sort;

public class HungrySingle {

  private HungrySingle() {}

  private static HungrySingle instance = new HungrySingle();

  public static HungrySingle getInstance() {
    return instance;
  }
}
