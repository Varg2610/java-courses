import java.util.Scanner;

/**
 * Created by Varg on 05.06.2017.
 */
public class InterractRunner {
    /**
     * Enter
     * @param args
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        try {
            Calculator calc = new Calculator();
            String exit = "no";

            while(!exit.equals("yes")) {
                System.out.println("Enter first arg: ");
                String first = reader.next();
                System.out.println("Enter second arg: ");
                String second = reader.next();
                calc.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Result = " + calc.getResult());
                calc.clearResult();
                System.out.println("Enter yes/no");
                exit = reader.next();
            }
        }
        catch(Exception exc) {
        }
        finally {
            reader.close();
        }
    }
}
