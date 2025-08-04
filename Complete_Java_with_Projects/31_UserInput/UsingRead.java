
import java.io.IOException;

public class UsingRead {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter a number");
        int num = System.in.read();

        System.out.println(num);
        System.out.println(num - 48);

    }
}
