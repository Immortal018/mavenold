package practice;

public class NewBasic {
	public String ff() {
		
		return "yoyoy";
	}
	public void add(int a ,int b) {
		
		System.out.println(a+b);
		
	}
	
	public void sub(int a, int b) {
		System.out.println(a-b);
	}
	
	public void res(int a, int b) {
		
		add(a,b);
		sub(a,b);
		String s=ff();
		System.out.println(s);
		
	}
	
	public static void main(String[] args) {
		NewBasic nb=new NewBasic();
		nb.res(10, 200);
		/*
		 * String ss=nb.ff(); System.out.println(ss);
		 */
	}
}
