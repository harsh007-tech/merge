// import java.util.Scanner;
public class FrequencyCount 
{
//Time Complexity O(log(n))
     public static void main(String [] args)
  {
    // Scanner scan = new Scanner(System.in);
    // int t = scan.nextInt();
    // scan.close();
    int t= 11;
    int[] arr = {1,3,5,7,9,11,11,11,11,13,15};
    int l = 0;
    int r = arr.length - 1;
    int m = r+(l-r)/2;
    boolean status = false;
    int n = -1;
    System.out.println(lower_bound(arr, l, r, m, n,t, status));
    System.out.println(upper_bound(arr, l, r, m, n,t, status));
    System.out.println(upper_bound(arr, l, r, m, n, t, status)-lower_bound(arr, l, r, m, n, t, status));
    
  }  

  static int lower_bound(int[] arr, int l, int r,int m,int n,int t,boolean status)
  {
              while(l <= r)
              {    m =  (l+r)/2;
                  if(arr[m] == t)
                  {
                  n = m;
                  r = m-1;
                //   System.out.print("left :");
                //   System.out.print(l);
                //   System.out.print(" right :");
                //   System.out.print(r);
                  }
                  else if(t < arr[m])
                  r = m-1;
                  else 
                  l = m+1;
                 
                  return n;
              }
        return n;          
  }

  static int upper_bound(int[] arr, int l, int r,int m,int n,int t,boolean status)
  {
              while(l <= r)
              {    m =  r+(l-r)/2;
                  if(arr[m] == t)
                  {
                  n = m;
                  l = m+1;
                //   System.out.print("left :");
                //   System.out.print(l);
                //   System.out.print(" right :");
                //   System.out.print(r);
                  }
                  else if(t < arr[m])
                  r = m-1;
                  else 
                  l = m+1;
                  }
                  return n;
  }
}
