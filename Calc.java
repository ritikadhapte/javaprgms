//Program demonstrating different type of methods
public class Calc{
       int num1,num2;
       void sum(){
       int sum=num1+num2;
       System.out.println("Sum="+sum);
   }
  //method with return type
   int difference(){
   int difference=num1-num2;
   return difference;
   } 
   void product(int a,int b){
           int product=a*b;
           System.out.println("Product="+product);
    }
    int division(int a,int b){
           int quotient=a/b;
           return quotient;
     }
     public static void main(String args[]){
     Calc calc=new Calc();
     calc.num1=30;
     calc.num2=20;
     calc.sum();
     int val=calc.difference();
     System.out.println("Difference"+val);
     calc.product(50,5);
      System.out.println("Division val="+calc.division(20,4));
     }
}

