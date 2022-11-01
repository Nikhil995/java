import java.util.Scanner;

public class Error extends Exception {

    public static void main(String[] args) throws Error {

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        if(a%10==0){
            throw new Error();
        }
        else{
            System.out.println(a);
        }


    }
}