class  abc extends Thread {
    public void run() {
        try {
            int i=00,j=00,k=00;
            for (int a = 1; a < 10; a++) {

                k=k+1 ;
                if(k==60){
                    j=j+1;
                    k=0;
                }
                if(j==60){
                    k=k+1;
                    j=0;
                }
                if(i==24){
                    i=0;
                    j=0;
                    k=0;

                }

                sleep(1000);
                System.out.println(i+":"+j+":"+k);

            }
        } catch (InterruptedException ie) {
            System.out.println("bye");
        }
    }
}
public class stopwatch{
public static void main(String[] args)
{
    abc obj=new abc();
    Thread t=new Thread(obj);
    t.start();
}


}