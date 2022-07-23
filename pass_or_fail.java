import java.util.Scanner;
public class pass_or_fail {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter marks in 3 subjects");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        float d=(a+b+c)/3;
        if(d>33 && a>40 && b>40 && c>40){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}
