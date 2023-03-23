public class BubbleSort 
{

    public static void main(String [] args)
    {
        int[] arr = {21,21,-21,2,13,42,32,43,1,36};
        int t;
        for(int i=0; i<arr.length-1;i++)
        { 
            for(int j=0; j<arr.length-2;j++)
            {
                if(arr[j]>arr[j+1])
                    { 
                        t = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = t;
                    }
            }
        }

        for(int i=0; i<arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
