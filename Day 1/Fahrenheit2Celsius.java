import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter start");
		int start = scn.nextInt();
		System.out.println("Enter end");
		int end = scn.nextInt();
		System.out.println("Enter step");
		int step = scn.nextInt();
		
		while(start <= end){
			int c = (int)((5.0/9)*(start - 32));
			System.out.println(start + " " + c);
			start += step;
		}
	}

}
