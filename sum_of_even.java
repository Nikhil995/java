public class sum_of_even {
    

    public static void main(String[] args) {
       
        int i=1;
        while(i<=9){
            int s=0;
            if(i%2==0){
                int j=i;
                while(j<=9){
                    s=s+j;
                    j=j+2;
                }
                System.out.println(s);
            }
            else{
                System.out.println(i);

            }
            i++;
        }
            
            
            
            
        
    }
}
    

