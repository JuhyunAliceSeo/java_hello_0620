
public class Java_06_rectangle {
 //사각형을 전산적으로 표현 한다면 밑변 x 높이
	double width, height;
	
	void setWidthHeight(double width, double height) {
		this.width = width;
		this.height = height; //따로따로 말고 한꺼번에 만들 수 있음.
		
	}
	double getArea() {
		return width * height;
	}
//클래스와 객체 = 인스턴스의 차이
	public static void main(String[] args) {
		Java_06_rectangle rec = new Java_06_rectangle();//해당주소를 reference한다고 = new
		rec.setWidthHeight(10,5);
		
		System.out.println(rec);
		System.out.println(rec.getArea());
		
	}
		
	}
