import java.util.Scanner;

public class tttt {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);

            String num = sc.next();
            if(num.equals("")){
                return;
            }
            char a[];
            a = num.toCharArray();
            int m = 125;
            char b ='z';
            for (int i = 0 ; i <a.length;i++){
                int n = (int)a[i];
                if (n >= 97){
                    n = n-32;
                }
                if(n < m){
                    m = n;
                    b = a[i];
                }
            }
            if ((int)b < 97){
                int res = (int)b +32;
                b = (char)res;
            }

            System.out.println(b);

    }
}
