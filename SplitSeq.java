package lecture3;

import java.util.Scanner;

public class SplitSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValidSeq());
	}
	
	public static boolean isValidSeq(){
		Scanner scn = new Scanner(System.in);
		System.out.println("Total numbers in a seq");
		int n = scn.nextInt();
		System.out.println("Enter 1st no");
		int prev = scn.nextInt();
		int ctr = 2;
		boolean isDec = true;
		while(ctr <= n){
			int curr = scn.nextInt();
			if(curr < prev){
				if(!isDec){
					return false;
				}
			} else {
				isDec = false;
			}
			prev = curr;
			ctr += 1;
		}
		return true;
	}

}







