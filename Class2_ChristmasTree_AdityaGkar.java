//print christmas tree pattern
public class Class2_ChristmasTree_AdityaGkar {
    
    public static void main(String[] args){
        int i=1,j=1,k=1;
        
        while(i<8)
        {j=1;
        k=5-i;
            while(j<=i){
                while(k!=0){
                    System.out.print(" ");
                    k--;
                }
                System.out.print("* ");
                j=j+2;
            }
            System.out.println("");
            i=i+2;
        }
                
           
        
      
    }
}

