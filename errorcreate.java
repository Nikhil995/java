
    import java.util.Scanner;

    public class errorcreate extends Exception {

        public static void main(String[] args) throws Error {

            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();

            if(a%10==0){
                throw new Error("the no is multiple of 10");
            }
            else{
                System.out.println(a);
            }


        }
    }

