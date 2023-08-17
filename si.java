import java.util.*;
public class si {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter principle :");
        float p=sc.nextFloat();
        System.out.print("Enter Rate :");
        float r=sc.nextFloat();
        System.out.print("Enter Time :");
        float t=sc.nextFloat();
        float si=(p*r*t)/100;
        System.out.println("simple interest : " + si);

        
    }
    
}
