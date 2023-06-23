
public class Java_02_scoff {

	public static void main(String[] args) {
		boolean ste = true;
		int num1 = 11;
		
		if(ste) {
			//int num1= 22; //int위에 선언
			num1++;
			System.out.println(num1);
		}
		{
			int num2= 33;
			//num2++
			System.out.println(num2);
		}
		//System.out.println(num2);//지역변수 밖으로 나와서 에러

	}

}
