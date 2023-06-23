//Object Oriented Programing(객체지향언어) = 자바
class Student {
   int age;
   char gender;

   public char getGender() {
      return gender;
   }

   public void setGender(char gender) {
      this.gender = gender;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }
}

class Circle {
   double radius;

   public double getRadius() {
      return radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   public double getArea() {
      return radius * radius * Math.PI;
   }
}

class Rectangle2 {
   double width, height;

   void setWidthHeight(double width, double height) {
      this.width = width;
      this.height = height;
   }

   double getArea() {
      return width * height;
   }
}

//클래스와 객체=인스턴스 의 차이
class StarPrint1 {

   void printTriangle(int num) {

      for (int i = 1; i <= num; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
         }
         System.out.println();
      }

   }

   void printReverseTriangle(int num) {

      for (int i = 1; i <= num; i++) {
         for (int j = i; j <= num; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}
class GetSum1{
   int num;
   
   void setNum(int num1) {
      num = num1;
   }
   
	int sum() {
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	}

public class Java_07_MainClass {
   public static void main(String[] args) {


      
      /////////////////////////////////////
      StarPrint1 strPrint1 = new StarPrint1();

      strPrint1.printTriangle(3);
      System.out.println();
      strPrint1.printTriangle(50);
      System.out.println();



   }

}
