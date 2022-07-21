import java.util.Scanner;
public class replace_with_space {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string with underscore");
        String a=sc.nextLine();
        System.out.println(a.replace("_"," "));
    }
}
