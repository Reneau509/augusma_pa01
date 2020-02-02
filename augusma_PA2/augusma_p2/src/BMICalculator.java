// Reneau Augusma
// COP 3330, Spring 2020
// Programming Assignment 2 - Problem 2

import java.util.Scanner;

public class BMICalculator
{
    private int height, weight;
    private double Bmi;
    private boolean exit = false;
    private String dataType, BmiCategory;
    private Scanner input;

    private void calculateBMICategory(double BMI)
    {
        if (exit)
            return;

        if (BMI < 18.5)
            this.BmiCategory = "Underweight";

        else if (BMI >= 18.5 && BMI < 25)
            this.BmiCategory = "Normal weight";

        else if (BMI >= 25 && BMI < 30)
            this.BmiCategory = "Overweight";

        else if (BMI >= 30)
            this.BmiCategory = "Obesity";
    }

    private void displayBMISpecs()
    {
        System.out.println("BMI Categories: \n" +
                "Underweight = <18.5\n" +
                "Normal weight = 18.5–24.9 \n" +
                "Overweight = 25–29.9 \n" +
                "Obesity = BMI of 30 or greater");
    }
    public void readUnitType()
    {
        System.out.println("Enter unit type: ");
    }

    public void readMeasurementData()
    {
        System.out.println("Enter height (in data type specified): ");
        this.height = input.nextInt();

        if (this.height < 0)
        {
            exit = true;
            return;
        }

        System.out.println("Enter weight (in data type specified): ");
        this.weight = input.nextInt();

        if (this.weight < 0)
        {
            exit = true;
            return;
        }
    }

    public void readUserData()
    {
        String choice = "";
        input = new Scanner(System.in);
        System.out.println("Welcome to the BMI calculator. Select which data type you would like to " +
                "use (m for metric, i for imperial).");
        choice = input.next();

        if (choice.equals("m"))
            readMetricData();

        else if (choice.equals("i"))
            readImperialData();

        readMeasurementData();

        if (exit)
            return;
    }

    public void readMetricData()
    {
        this.dataType = "metric";
    }

    public void readImperialData()
    {
        this.dataType = "imperial";
    }

    public void calculateBMI()
    {
        double result = 0.0;

        if (this.getDataType().equals("metric"))
            result = (703 * weight) / (height * height);

        else if (this.getDataType().equals("imperial"))
            result = weight / (height * height);

        this.Bmi = result;
        calculateBMICategory(this.Bmi);
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getHeight()
    {
        return this.height;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public int getWeight()
    {
        return this.weight;
    }

    public void setDataType(String dataType)
    {
        this.dataType = dataType;
    }

    public String getDataType()
    {
        return this.dataType;
    }

    public double getBmi()
    {
        return this.Bmi;
    }

    public String getBmiCategory()
    {
        return this.BmiCategory;
    }

    public void displayBmi()
    {
        if (exit)
            return;

        displayBMISpecs();
        System.out.println("\nYour BMI:");
        System.out.println("BMI: " + this.Bmi + ", BMI Category: " + this.getBmiCategory());
    }

    public static void main(String[] args)
    {
        BMICalculator app = new BMICalculator();
        app.readUserData();
        app.calculateBMI();
        app.displayBmi();
    }
}
