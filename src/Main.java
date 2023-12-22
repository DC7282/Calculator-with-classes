import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Calculator{
    double addition(double input1, double input2){
        return input1+input2;
    }
    double subtraction(double input1, double input2){
        return input1-input2;
    }
    double multiplication(double input1, double input2){
        return input1*input2;
    }
    double division(double input1, double input2){
        return input1/input2;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Calculator c=new Calculator();
        System.out.println("Enter first number");
        double input1=sc.nextDouble();
        System.out.println("Enter Second number");
        double input2= sc.nextDouble();
        System.out.println("Enter Choice \n 1) Addition \n 2) Subtraction \n 3) Multiplication \n 4) Division");
        int choice = sc.nextInt();
        switch (choice){
            case 1->System.out.println("Addition is " + c.addition(input1, input2));
            case 2->System.out.println("Subtraction is " + c.subtraction(input1, input2));
            case 3->System.out.println("Multiplication is " + c.multiplication(input1, input2));
            case 4->System.out.println("Division is " + c.division(input1, input2));
            default -> System.out.println("Wrong choice");
        }
    }
}