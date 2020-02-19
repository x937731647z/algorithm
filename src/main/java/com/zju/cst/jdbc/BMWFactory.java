package com.zju.cst.jdbc;

/**
 * @author wulixz
 * @date 9/14/19 : 3:42 PM
 * @introduction :
 */
public interface BMWFactory {
    BMW product();
}
class BMW3Factory implements BMWFactory{

    @Override
    public BMW product() {
        System.out.println("this is BMW3Factory");
        return new BMWA3();
    }
}
class BMW5Factory implements BMWFactory{

    @Override
    public BMW product() {
        System.out.println("this is BMW5Factory");
        return new BMWA5();
    }
}
class BMW7Factory implements BMWFactory{

    @Override
    public BMW product() {
        System.out.println("this is BMW7Factory");
        return new BMWA7();
    }
}
