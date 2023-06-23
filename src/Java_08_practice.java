class StarPrint{
	
	void printTriangle(int num) {//함수선언
		for(int i=1;i<=num;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println(" ");
		}
	}
		
	void printReverseTriangle(int num) {//함수선언2 
		for(int i=1;i<=num;i++) {
		for(int j=3;j>=i;j--) {System.out.print("*");}
		System.out.println(" ");
		}
		
	}
	}

class GetSum{
	int num; //GetSum이 자기자신의 변수를 가진다

	void setNum(int num1) {
		this.num=num1;
	}
	
	int sum() {
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	}

class Gugudan{
	void printGugu(int num){
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j +"=" + (i*j));
			}
		}
	}
}

public class Java_08_practice {

	public static void main(String[] args) {
		
		Gugudan gugudan = new Gugudan();
		gugudan.printGugu(10);
		gugudan.printGugu(20);
		
		///////////////////////////////////////////////////////////
		StarPrint starPrint = new StarPrint(); //객체생성 // 클래스가 없으면 빨간색 줄이 생김
		 
		starPrint.printTriangle(3); //클래스 안에 함수 2개
		System.out.println();
		starPrint.printReverseTriangle(3);
		
		/////////////////////////////////////////////////////////////////
		
	      GetSum getsum = new GetSum();
	      int num; // 2)num 변수 선언

	      num = 100;

	      getsum.setNum(num); // 3)getsum 객체의 setNum함수 호출, num값 50 저장

	      num = getsum.sum(); // 4)getsum객체의 sum함수 호출, 1-50까지 합 구함
	      System.out.println(num);

	}

}
