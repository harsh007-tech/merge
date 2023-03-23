public class SelectionSort 
{
    
public static void main(String [] args)
{   
        int[] arr = {21,21,-21,2,13,42,32,43,1,36};
        int t;
        for(int i=0; i<arr.length-1;i++)
        { 
            for(int j=i+1; j<arr.length-1;j++)
            {
                if(arr[i]>arr[j])
                {
                        t = arr[j];
                        arr[j] = arr[i];
                        arr[i] = t;
                }
            }
        }

        for(int i=0; i<arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
}

}
