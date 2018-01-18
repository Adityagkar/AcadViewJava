//to check whether a number is a leap year or not (Gregorian based)
public class Class2_LeapYear_AdityaGkar {
    
    public static void main(String[] args)
    {
        int year=1900;
        
        if(year%4==0 && year%100!=0) 
            System.out.println("Leap year");
        else if(year%400==0)
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year !!");
        
        
    }
}
