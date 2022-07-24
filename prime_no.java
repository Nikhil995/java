import java.util.Scanner;
public class prime_no {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a no");
        int n=s.nextInt();
        int c=0;
        for(int i=2;i<n;i++) {
            if (n % i == 0) {
                c++;
                break;
            }
        }
        if(c==0){
            System.out.println("prime no");
        }
        else{
            System.out.println("not prime no");
        }


    }
}
