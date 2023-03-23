import java.util.Scanner;
public class Method 
{
    public static void main(String[] args)
    { Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      // myMethod(a,b);
      // myMethod(2, 3);

    }  
    
    public static int myMethod(int a,int b)
    { 
        System.out.println(a+b);
      return a+b;
    }  

    public static int sub(int a,int b)
    {
      System.out.println(a-b);
      return a-b;
    }
}
