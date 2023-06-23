
public class Java_05_method2 {
	
//	public static void getCircleArea(int radius) {
//		double area = (radius*radius) *3.14; 
//		System.out.println(area);
//	}
	
	public static double getCircleArea(int radius) {
		final double PI = 3.14;  //파이값 설정 파이널 =상수로 만들어줌(고정되야하니까 변하면 x)
		return radius * radius * PI;
	}
	
	public static double getRectangleArea(double width, double height) {
		return width * height;//double int 둘다 가능
	}
	
	public static double getTraiangleArea(double width, double height) {
		return width * height * 0.5;
	}
	
	public static int getAscCode(char ch) {
		return (int)ch; //문자를 Asc Code에 있는 숫자로 형변환 시켜 버림
	}
	
	public static void main(String[] args) {
		double area = getCircleArea(10);
		System.out.println(area);
		
		area = getRectangleArea(10,20);
		System.out.println(area);
		
		area = getTraiangleArea(40,20);
		System.out.println(area);
		
		int code = getAscCode('A');
		System.out.println(code);
		
		code = getAscCode('\n');
		System.out.println(code);
	}


}
