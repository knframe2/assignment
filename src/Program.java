import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a temperature followed by its type as a capital letter (e.g 5.0 C or 16.0 F)");
        double firstInput = userInput.nextDouble();
        String temperature = userInput.next();
        if (temperature.equals("C")) {
            double finaltemp =firstInput*1.8+32;
            System.out.printf("%2.2f degrees C is equal to %2.2f degrees F",firstInput,finaltemp);
        } else if(temperature.equals("F")){
            double finaltemp =(firstInput-32)/1.8;
            System.out.printf("%2.2f degrees F is equal to %2.2f degrees C",firstInput,finaltemp);
        } else {
            System.out.println("unrecognized temperature");
        }
    }
}
