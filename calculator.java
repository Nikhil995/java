import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter two no");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("choose an operator(+,-,/,*)");
        char o=s.next().charAt(0);
        switch(o){
            case '+':
                System.out.println(a+b);
                break;
            case  '-':
                System.out.println(a-b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            default:
                System.out.println("incorrect operator");

        }

    }
}
