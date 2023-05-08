package introduction;
import java.util.Scanner;
/**
 * @author kemo
 */
public class Main {

    public static void main(String[] args) {

        var in  = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String name =  in.next();

        System.out.println("Hello, "+name);
    }
}
