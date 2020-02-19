package utils;

/**
 * @author wulixz
 * @date 11/16/19 : 2:49 PM
 * @introduction :
 */
public class EightQueen {
    int max = 8;
    int[] P = new int[max];
    boolean[] hash = new boolean[max];
    int count = 0;

    public void generateP(int index){
        if (index == max){
            count ++;
            return;
        }
        for (int x = 0; x < max ; x ++){
            if (!hash[x]){
                boolean flag = true;
                for (int pre = 0; pre < index; pre ++){
                    if (Math.abs(pre - index) == Math.abs(P[pre] - x )){
                        flag = false;
                    }
                }
                if (flag){
                    P[index] = x;
                    hash[x] = true;
                    generateP(index + 1);
                    hash[x] = false;
                }
            }

        }

    }
}
class Test {
    public static void main(String[] args) {
        EightQueen queen = new EightQueen();
        queen.generateP(0);
        System.out.println(queen.count);

    }
}
