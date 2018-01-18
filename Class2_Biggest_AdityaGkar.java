//largest of three numbers
public class Class2_Biggest_AdityaGkar {
    
    public static void main(String[] args){
        int num1=10,num2=110,num3=20;
        
     //considering no two numbers are same
     
        if(num1>num2 && num1>num3)
            System.out.println(num1+" is the largest number");
        else if(num2>num1 && num2>num3)
             System.out.println(num2+" is the largest number");
        else 
             System.out.println(num3+" is the largest number");
        
        
    }
    
}
