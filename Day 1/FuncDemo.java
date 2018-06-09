

public class FuncDemo {
	
	public static int allAccess = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
	
		System.out.println(a+"-"+b);
		swap(a, b);
		System.out.println(a+"-"+b);
		System.out.println(allAccess);
	}
	
	public static int sum(int a, int b){
		return a + b;
	}
	
	public static void swap(int a, int b){
		int temp = a;
		a = b;
		b = temp;
	}

}
