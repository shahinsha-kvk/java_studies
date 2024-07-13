import java.util.*;
public class Prime {
    public static void main (String aswwwwa[]){
        System.out.println("Enter a number to check prime or not: ");
        Scanner sc=new Scanner(System.in);   //for read
        int number=sc.nextInt();

        int flagg=0;
        for(int i=2;i<number/2;i++){
            if (number%i==0){
                flagg=1;
                break;
            }
        }
        if(flagg==0){
            System.out.println("PRIME");
        }   
        else{
            System.out.println("NON PRIME");
        }  
    }
}
