import java.util.Scanner;

public class interview {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        int sum=factorial(num);
        System.out.println("factorail of given num"+sum);
    }
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
