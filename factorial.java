import java.util.*;
public class factorial {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
    System.out.print("Enter no :");
    int num = sc.nextInt();
    System.out.println("Factorial is :"+ fact(num));
     
    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        int factorial=n*fact(n-1);
        return factorial;
    }
    
}
