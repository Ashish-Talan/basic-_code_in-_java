import java.util.*;
public class calculatepercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Math marks: " );
        int m =sc.nextInt();
        System.out.print("Enter chemistry marks: " );
        int c =sc.nextInt();
        System.out.print("Enter english marks: " );
        int e =sc.nextInt();
        float percentage=(e+m+c)/3;
        System.out.println(percentage);
        
    }
    
}
