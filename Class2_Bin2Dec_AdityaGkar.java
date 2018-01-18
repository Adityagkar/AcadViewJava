//to convert binary number to decimal number
public class Class2_Bin2Dec_AdityaGkar {
    
    public static void main(String[] args)
    {
        int bin=100,mul=1,dec=0,rem=0;
       
        while(bin!=0){
               rem=bin%10;
               
               if(rem==1){
                   dec=dec+rem*mul;
               }
               mul=mul*2;
               bin=bin/10;
        }
         System.out.println("Decimal is "+dec);      
    }
    
}
