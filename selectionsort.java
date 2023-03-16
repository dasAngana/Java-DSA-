class selectionsort{


    static void selection(int[] arr)
    {
        int n=arr.length;
         for(int i=0;i<n-1;i++)
         {
            int index=i;
               for(int j=i+1;j<n;j++)
               {
                if(arr[j]<arr[index])
                index=j;
             }
            int temp = arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
 }

    static void display(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }

    public  static void main(String args[])
    {
        int arr[]={70,90,10,30,50,20,60,89};
        System.out.print("Before Sorting: ");
        display(arr);

        selection(arr);

        System.out.print("after Sorting: ");
        display(arr);
    }
}