import java.util.Scanner;
public class n_no_while_loop {
    public static void main(String[] agrs){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a no");
        int n= s.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
