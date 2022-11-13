import java.net.SocketTimeoutException;

public class pattern2 {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(j);
            }
            System.out.printf("\n");
        }
        for(int k=2;k<=4;k++){
            for(int l=1;l<=k;l++){
                System.out.print(l);
            }
            System.out.printf("\n");
        }
        
        
        

    }
    
}
