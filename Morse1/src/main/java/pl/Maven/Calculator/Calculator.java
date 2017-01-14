package pl.Maven.Calculator;

import java.util.Scanner;

/**
 * Created by RENT on 2017-01-14.
 */
public class Calculator {
    public static void main(String[] args) {

        Scanner scannerIn = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe");
        Integer x = scannerIn.nextInt();

        System.out.println("Podaj druga liczbe");
        Integer y = scannerIn.nextInt();

        System.out.println("Podaj znak dzialania (-,+,*,/)");
        String operationChar = new Scanner(System.in).nextLine();

        Operation operationToPerform = null;

        switch (operationChar){
            case "+":
                operationToPerform = new Add();
                break;
            case "-":
                operationToPerform = new Substract();
                break;
            case "*":
                operationToPerform = new Multiply();
                break;
            case "/":
                operationToPerform = new Divide();
                default:
                    throw new IllegalArgumentException("Zly kod dzialania");
        }

        double result = operationToPerform.eval(x,y);
        System.out.println("Wynik dzialania " + result);
    }

}
