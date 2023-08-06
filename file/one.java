import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class one {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fr = new FileInputStream("abc.txt");
        int i = fr.read();
        while (i != -1) {
            System.out.println((char) i);
            // System.out.print((char) (int) 'a');
            i = fr.read();
        }
        // if (i == -1) {
        // System.out.println(90);
        // }
    }
}
