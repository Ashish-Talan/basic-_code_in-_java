import java.util.*;
public class divisible { 
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Number :");
            int num =sc.nextInt();
            if(num%3==0  && num%5==0){
                System.out.println("Number is divisible both  3 and 5 ");
            }
            else {
                System.out.println("it's divisible neither 3 nor 5");
            }

        
    }
}
