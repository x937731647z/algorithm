package com.zju.cst.algorithm_note;



public class Prime {
    public boolean isPrime(int a){
        boolean flag = true;
        if (a <= 1){
            flag = false;
        }
        if (a > 1) {
            for (int  i = 2 ; i * i <= a; i ++){
                if (a % i == 0 ){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
    public int [ ] findPrime(int n){
        int [ ] list = new int[n];
        int index = 0;
        for (int i = 2; i <= n;i++){
            if (isPrime(i)){
                list[index++] = i;
            }
        }
        int[] resultList =arrayTransform(list,index);
        return resultList;
    }
    public int[] rangePrime(int a, int b ){
        int [] list = findPrime(b);
        int [] rangelist = new int[list.length];
        int index = 0;
        for (int i =0; i < list.length; i ++){
            if (list[i] >= a){
                rangelist[index++] = list[i];
            }
        }
        int[] resultList = arrayTransform(rangelist,index);
        return resultList;
    }
    public int[] arrayTransform(int[] preList, int len){
        int[] resultList = new int[len ];
        for (int i = 0 ; i < len ; i ++){
            resultList[i] = preList[i];
        }
        return resultList;
    }

    public void Factor(int num){
        int[] prime = findPrime(num);
        int [] factor = new int[prime.length];
        int factorIndex = 0;
        int[] hash = new int[prime.length];
        if (num == 1){
            System.out.println("1==1");
        }else {
            System.out.print(num + " = ");
            double sqrt = Math.sqrt(num);
            for (int i = 0; i < prime.length && prime[i]<= sqrt;i ++){
                int count=0;
                if (num % prime[i] ==0){
                    factor[factorIndex] = prime[i];
                    while (num % prime[i] == 0){
                        ++count;
                        num /= prime[i];
                    }
                    hash[factorIndex] = count;
                    factorIndex ++;
                }
                if (num == 1){
                    break;
                }
            }
            if (num != 1){
                factor[factorIndex] = num;
                hash[factorIndex] ++;
            }
            for (int j = 0 ; j < hash.length ; j ++){
                if (hash[j] != 0) System.out.println(prime[j]+" has "+ hash[j]);
            }
        }


    }
}
