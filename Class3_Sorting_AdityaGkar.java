// sorting of a given array using Insertion Sort (as in small inputs even it performs equivalent to QS and MS

public class Class3_Sorting_AdityaGkar {
    
    public static void main(String args[]){
        int arr[]={1,1,1,1,0,0,1,0};
     int length=arr.length;
     
        for(int i=1;i<length;i++)
        {
           int ele=arr[i];
            int j=i-1;
            
            
            while(j>=0 && arr[j]>ele)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=ele;
        }
        
        for(int i=0;i<length;i++)
            System.out.println(" "+arr[i]);
        
        
    }
            
    
}
