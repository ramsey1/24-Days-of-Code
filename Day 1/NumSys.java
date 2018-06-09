package lecture3;

import java.util.Scanner;

public class NumSys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	}
	
	public static int O2D(int oct){
		int dec = 0;
		return dec;
	}
	
	public static int D2B(int dec){
		int bin = 0;
		return bin;
	}
	
	public static int O2B(int oct){
		int dec = O2D(oct);
		int bin = D2B(dec);
		return bin;
	}
	
	public static int A2A(int sb, int sn, int db){
		int dec = A2D(sb, sn);
		int dn = D2A(dec, db);
		return dn;
	}
	
	public static int A2D(int sb, int sn){
		int dec = 0;
		return dec;
	}
	
	public static int D2A(int dec, int db){
		int dn = 0;
		return dn;
	}
	
	

}
