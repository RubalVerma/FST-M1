package Activities;

public class Activity4 {

    public static void main(String[] args){

        int[] arr = {3,1,5,6,2,3,9,4};

        System.out.println("Array before sorting");
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }

        int temp, j;
        for(int i=1;i<arr.length;i++)
        {
           temp = arr[i];
           j=i;
           while(j>0 && arr[j-1] > temp)
           {
               arr[j] = arr[j-1];
               j=j-1;

           }
            arr[j]=temp;
        }

        System.out.println(" ");
        System.out.println("Array after sorting");
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
