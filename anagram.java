import java.util.*;
public class anagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(a.length()==b.length()){
            char[] x=a.toCharArray();
            char[] y=b.toCharArray();
            Arrays.sort(x);
            
            Arrays.sort(y);
            boolean r= Arrays.equals(x,y);
            if(r){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        else{
            System.out.println("no");
        }



    }
    
}
