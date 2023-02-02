import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double userInput = user();
        while (userInput>-460){
            double c = formula(userInput);
            display(c);
            userInput = user();


        }

    }
    static double user(){
        System.out.println("Please enter the temp in fahrenheit");
        double temp = input.nextDouble();
        return temp;
    }
    static double formula(double temp ){
        double celsius =((5*(temp-32.0))/9.0);
        return celsius;
    }
    static void display(double temp){

        System.out.println("The temperature in Celsius is "+temp);
    }

}