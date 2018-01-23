
public class Class5_Overload_AdityaGkar {
    
    static void print(){
        System.out.println("Hello !!");
    }
    
    static void print(int a){
               System.out.println("Hello !!"+a);
    }
    
    static void print(float a){
               System.out.println("Hello !!"+a);
    }
    
    
    
    
    public static void main(String args[]){
        
        int a=1;
        float b=1F;
        
        Class5_Overload_AdityaGkar.print();
          Class5_Overload_AdityaGkar.print(b);
            Class5_Overload_AdityaGkar.print(a);
        
    }
    
    
    
}
