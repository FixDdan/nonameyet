import java.util.*;

public class Main{
    public static void main(String[] args){
        Random random = new Random();
        int r;
        int c = 1;
        while (true) {
            r = random.nextInt(100);
            System.out.println("bound"+c+" = "+r);
            c++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}