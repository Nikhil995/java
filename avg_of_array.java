import java.util.*;
class avg_of_array {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.printf("Enter the size of array :");
        int n=input.nextInt();
        int[] a =new int[n];
        double sum=0;
        for(int i=0;i<n;i++){
            System.out.printf("Enter %d element :",i);
            a[i]=input.nextInt();
            sum+=a[i];
        }
        double z=sum/n;
        System.out.printf(" the average is:%.2f",z);
      
    }
}
