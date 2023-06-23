class Grade{
	int kor, eng, math, total;
	double avg;
	
	void setGrade(int kor, int eng , int math){ 
		this.kor=kor;
		this.eng=eng;
		this.math=math; 
		}//선언
	
	double getAvg() {
		total = (kor + eng + math);
		return  total/3.0; //getAvg메서드의 값을 반환하는데 사용
	}
	char gradGrade() {
	      
	      char ch = '가';
	      double avg = getAvg();
	            
	      if(avg >= 90) {
	         ch = '수';
	      }else if(avg >=80) {
	         ch = '우';
	      }else if(avg >=70) {
	         ch = '미';
	      }else if(avg >=60) {
	         ch = '양';
	      }else {
	         ch = '가';
	      }      
	      return ch;
	   }

	}


public class Java_09_ {
	public static void main(String[] args) {
		Grade kim = new Grade(); 
		 
		kim.setGrade(80,80,90); 
		System.out.println(kim.kor + "," + kim.eng + "," + kim.math);
		System.out.println(kim.getAvg());
		System.out.println(kim.gradGrade());
//		Grade.avgGrad(80,80,90);
		
		Grade park = new Grade();
		park.setGrade(80, 70, 50);
		System.out.println(park.getAvg());
		System.out.println(park.gradGrade());
	}
}
