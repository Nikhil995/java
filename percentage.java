
import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks in 1st subject");
        float a=sc.nextFloat();
        System.out.println("enter marks in 2nd subject");
        float b=sc.nextFloat();
        System.out.println("enter marks in 3rd subject");
        float c=sc.nextFloat();
        System.out.println("enter marks in 4th subject");
        float d=sc.nextFloat();
        System.out.println("enter marks in 5th subject");
        float e=sc.nextFloat();
        float sum=a+b+c+d+e;
        System.out.println(sum);
        float per=((sum/ 500)*100);
        System.out.println("percentage of 5 subject is");
        System.out.println(per);




    }
}
