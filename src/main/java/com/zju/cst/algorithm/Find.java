package com.zju.cst.algorithm;

public class Find {
    public boolean find(int target, int [][] array) { 	
    	int width = array[0].length;
    	int height = array.length;
    	if(width <= 0 ||height <= 0)return false;
    	for(int i = width -1; i >= 0;i --) {
    		if(target >= array[0][i]) {
    			for(int j = 0; j <height;j++) {
    				while(target == array[j][i]) {
    					return true;
    				}
    			}
    		}
    	}
    	return false;
    }
//        for(int i = 0; i < width -1;i++){
//            if(target < array[0][0])return false;
//            if(target >= array[0][i] && target < array[0][i+1])
//            {
//                for(int j=0;j < height ;j++){
//                     if(target == array[j][i]){
//                        return true;
//                    }
//                }
//                return false;
//            }
//        }
//        if(target >= array[0][width-1]){
//           for(int j=0;j < height;j++){
//                 if(target == array[j][width - 1]){
//                        return true;
//                    }
//                }
//                return false;
//            }
//        return false;
//    }
    	
}
