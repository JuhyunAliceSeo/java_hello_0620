
public class Java_04_method {

	public static void showStar(int k) {
		for(int i=1;i<=k;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
		}
		System.out.println();
		}
	}
	
	public static char gradChar(double avg) {
		if(avg>=90) {return'수';}
		else if (avg>=80) {return'우';}
		else if (avg>=70) {return'미';}
		else if (avg>=60) {return'양';}
		else {return'가';}
	}
	
	public static void main(String[] args) {
		System.out.println(gradChar(90.8));
		System.out.println(gradChar(80.8));
		System.out.println(gradChar(50.0));
	}

}
