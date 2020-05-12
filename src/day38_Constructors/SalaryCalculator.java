package day38_Constructors;
import java.text.DecimalFormat;

public class SalaryCalculator {
    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;


    public SalaryCalculator( double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate){
        this.federalTaxRate = federalTaxRate;
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        return hourlyRate*weeklyHours*48;
    }

    public double stateTax(){
        return salary()*stateTaxRate;
    }

    public double federalTax(){
        return salary()*federalTaxRate;
    }
    public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
    }

    public String toString(){
        DecimalFormat df = new DecimalFormat("0.0");
        return "Total Income: $"+ df.format(salary()) + ", state tax withholding: "+ df.format(stateTax()) +
                "\nFederal tax withholding: "+ df.format(federalTax())+ ", income after tax: $" + df.format(salaryAfterTax());
    }

    public static void main(String[] args) {

        SalaryCalculator obj1 = new SalaryCalculator(60, 40, 4.3/100, 5.75/100);
        System.out.println(obj1);
    }
}





/*
Create class called SalaryCalculator
            instance variables:
                hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
            add a constructor can initialize those fields
            instance methods:
                salary(): returns the total salary as double
                salaryAftertax(): retuns the salary after tax as double
                stateTax(): retuns the total state tax as double
                federalTax(): retuns the total federal tax as double
                toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
 */