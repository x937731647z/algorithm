import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static int len = 0;
  public static void main(String[] args) {
	  //
	  Scanner scanner = new Scanner(System.in);
	  int n = scanner.nextInt();
	  int k = scanner.nextInt();
	  int [] a = new int[n];
	  for (int i = 0 ; i < n; i++){
		  a[i] = scanner.nextInt();
	  }
	  ArrayList arrayList = new ArrayList();
	  ArrayList array = new ArrayList();
	  for (int j = 0;j < n ; j++){
		  if (help(a[j]) == true){
			  if (!arrayList.contains(a[j])){
				  arrayList.add(a[j]);
				  array.add(a[j]);
			  }
		  }else {
			  array.add(a[j]);
		  }
	  }
	  int len = array.size();

  }
	public static boolean help(int a) {
		int temp =a;
		while(temp!=0) {
			int b =temp%10;
			temp = temp/10;
			if(b!=9||b!=6) {
				return false;
			}
		}
		return true;
	}

}