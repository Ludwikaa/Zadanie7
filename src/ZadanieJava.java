import java.util.Random;


public class ZadanieJava {
    public static void main(String[] args) throws Exception {
        int [] t = new int[10];
        Random rand = new Random();

        for(int i=0; i<10; i++) {
            t[i] = rand.nextInt(1000);
            if(t[i]%2==0) {
               System.out.println(t[i]);
            }
        }
    }
}