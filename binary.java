

public class binary {


    static int search(int arr[],int low,int high,int item){
        

        while(low<=high){
            int mid=(low+high)/2;
        if(arr[mid]==item)
        return mid;

        else if(arr[mid]>item)
       { return(search(arr, 0, mid, item));
        
       }
        else 
        {
          return(search(arr,mid,high,item));
        
        
    
    }
   
        
     }
     return 0;
    }




    public static void main(String args[]){

int arr[]={2,5,7,9,12,13,15};
int item =13;


System.out.println("found at :"+search(arr,0,6,item));


    }
    
}
