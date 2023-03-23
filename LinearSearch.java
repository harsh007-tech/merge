import java.util.Scanner;
//Time complexity O(n)
public class LinearSearch {

// public static void linear_search(Integer[] arr)
// {
//     System.out.println("Enter the target value");
//     Scanner scan = new Scanner(System.in);
//     int i = scan.nextInt();
//     System.out.println(i);
// }

    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println("Enter the target value");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        //Find the index of target value
        int counter = 0;
        Boolean status = false;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==i)
            {
                System.out.println(counter +"/"+ arr[j]);
                status = true;
            }
            counter++;
        }
        if(status == false)
        System.out.println("Target Not found");
    }

}
