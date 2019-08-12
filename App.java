import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException{
        RNG rng = new RNG(12345L);
        
        BufferedWriter bwriter = new BufferedWriter(new FileWriter("output.txt"));
        
        for(int i = 0; i<999; i++) {
            bwriter.write(Double.toString(rng.next()));
            bwriter.write('\n');
        }
        bwriter.write(Double.toString(rng.next()));
        bwriter.close();
        /*
        long l = 1L<<48;
        double dl = (double)l;
        System.out.println(l);
        System.out.println(dl);
        */
    }
}