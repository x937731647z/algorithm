package com.zju.cst.jdbc;

public interface BMW {
    public abstract void info();
}
class BMWA3 implements BMW{

    @Override
    public void info() {
        System.out.println("this BMW3 introduced by A");
    }
}
class BMWA5 implements BMW{

    @Override
    public void info() {
        System.out.println("this BMW5 introduced by A");
    }
}
class BMWA7 implements BMW{

    @Override
    public void info() {
        System.out.println("this BMW7 introduced by A");
    }
}
