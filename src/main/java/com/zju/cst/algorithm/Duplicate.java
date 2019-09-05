package com.zju.cst.algorithm;

import java.util.Scanner;

public class Duplicate {

    public boolean duplicate(int numbers[],int length,int [] duplication) {
    	if(numbers == null || length <= 0)return false;
    	
        for(int i = 0 ; i < length ; i ++){
        	if(numbers[i] <0 || numbers[i] >=length)return false;
            while(i != numbers[i]){
                int num = numbers[i];
                int temp = numbers[num];;
                if(temp == num){ 
                    duplication[0] = num;
                    return true;
                }else{
                    numbers[num] = numbers[i];
                    numbers[i] = temp;                    
                }
            }
        }
        return false;
    }
	}

