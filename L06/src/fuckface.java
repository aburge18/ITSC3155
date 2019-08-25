  public class fuckface{
    public static void main(String[] args){
        int num1 = 5, num2 = 10;
        int sum = method1(num1, num2);
        System.out.println("Using Method 1: " + sum);
  
        System.out.println("Using Method 2: " + method2(5, 10));
   }
  
  public static int method1(int num1, int num2){
     int sum = num1 + num2;
     return sum;
   }
 
public static int method2(int num1, int num2){
     return num1 + num2;
  }
}