package com.zju.cst.juc;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author wulixz
 * @date 9/19/19 : 11:23 AM
 * @introduction :
 */
public class TestCallable {
    public static void main(String[] args) {
        CallableDemp callableDemp = new CallableDemp();
        //
        FutureTask<Integer> integerFutureTask= new FutureTask<>(callableDemp);
        new Thread(integerFutureTask).start();
        try {
            Integer integer = integerFutureTask.get();
            System.out.println("the result is  : "+integer);
            System.out.println("-----------");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
class  CallableDemp implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        int res = 1;
        for (int i = 0 ; i < 5 ; i ++){
            System.out.println(res);
            res += i;
        }
        return res;
    }
}
