import java.util.*;
class sample{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:\n");
        int n=in.nextInt();
        int m= (n%2==0) ? 1 : 0;
        if(m==1){
            System.out.println("It is even");

        }
        else{
            System.out.println("It is odd");
        }
    }
}