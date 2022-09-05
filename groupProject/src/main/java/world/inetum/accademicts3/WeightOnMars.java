package world.inetum.accademicts3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeightOnMars {


    public static void main(String[] args) {

        try {
            float weight = getWeight("Please provide your weight (on Earth:))");
            float wightOnMars = yourWeightOnMars(weight);
            System.out.println("your weight on planet Mars is " + wightOnMars);
            System.out.println("==========================");
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    public static float yourWeightOnMars(float weight) throws InputMismatchException {
        if (weight < 1.0) {
            throw new InputMismatchException("Weight has to be at least 1.0KG or higher");
        } else {
            return (float) (weight * 0.38);
        }
    }

    public static float getWeight(String msg) {
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        float weight = scanner.nextFloat();

        while (weight < 1.0) {
            System.out.println("Please provide a valid weight greater than 1.0 KG");
            weight = scanner.nextFloat();
        }
        return weight;
    }
}
