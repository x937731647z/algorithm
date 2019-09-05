package com.zju.cst.btree;

public class lala {
	int n;
	public lala() {
		
	}
	public lala(int n) {
		this.n = n;
	}
	public static void main(String[] args) {
		lala a = new lala();
		System.out.println(a.get(10));
	}
	public int get(int n) {
		if (n == 1) {
			return 1;
		}
		else {
			int a = 0;
			a = get(n - 1) + n;
		//	a = get(n - 1) ;
			return a ;
		}
		
	}

}
