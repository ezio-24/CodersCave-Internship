package CodersCave.Phase1.BMICalculator;


import java.util.*;

public class BMICalculator{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your weight (in kilogram): ");
        double weight = s.nextDouble();

        System.out.println("Enter your height (in meters): ");
        double height = s.nextDouble();


        double bmi = weight / (height / height);


        System.out.println("Your BMI is: " + bmi);
        
        if(bmi < 18.5){
            System.out.println("Underweight");
        }else if (bmi >= 18.5 && bmi < 25){
            System.out.println("Normal weight");
        }else if(bmi >= 25 && bmi < 30){
            System.out.println("Overwight");
        }else {
            System.out.println("Obese");
        }

        s.close();
    }
}