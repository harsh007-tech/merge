import java.util.Scanner;
public class BinarySearch
//Time Complexity O(log(n))
{
     public static void main(String [] args)
  {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    scan.close();
    int[] arr = {1,3,5,7,9,11,13,15};
    int l = 0;
    int r = arr.length - 1;
    int m = r+(l-r)/2;
    boolean status = false;
    // System.out.println(arr[m]);
    while(l <= r)
    { 
        if(arr[m] == t)
        {
         System.out.print("Target  :  ");
         System.out.print(m);
         status = true;
         break;
        }
        else if(t < arr[m])
        { r = m-1;
          m =  r+(l-r)/2;
        }
        else 
        {l = m+1;
         m =  r+(l-r)/2;
        }
    }
    if(status == false)
    {System.out.println("Target not found");}
  }  
}
