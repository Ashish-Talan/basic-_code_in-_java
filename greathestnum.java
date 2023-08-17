import java.util.*;
public class greathestnum {
    public static void main(String[] args) {

    Scanner sc =new Scanner(System.in);
    System.out.print("Enter a :");
    int a=sc.nextInt();
    System.out.print("Enter b :");
    int b=sc.nextInt();
    System.out.print("Enter c :");
    int c=sc.nextInt();
    if(a>b && a>c){
        System.out.println(" a is greather than others");
    }else if(b>c && b>a){
        System.out.println("b is greathest no.");
    }
    else {
        System.out.println("c greathest no.");
    }
}
    
}
