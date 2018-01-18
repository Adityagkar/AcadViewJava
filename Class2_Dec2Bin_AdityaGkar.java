//decimal to binary conversion -division by 2 approach
public class Class2_Dec2Bin_AdityaGkar {
    
    public static void main(String[] args){
        int N=100,quo,bits,binNum=0,mul=1;// mul is initialized to 1 as 10^0=1
        
        while(N!=0){
            bits=N%2;
            quo=N/2;
            N=quo;
           
            binNum=binNum+bits*mul;
           mul=10*mul; // for calculating powers of 10
           
        }
          System.out.println("Binary is "+binNum);  
    }
}
