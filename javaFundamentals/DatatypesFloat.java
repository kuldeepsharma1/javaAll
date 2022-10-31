package javaFundamentals;
import java.util.Scanner;
public class DatatypesFloat {
    public static void main(String[] args) {
            
// Datatypes in java are used to store different kind of data into variable
 float num1 = 22; // stores floating point values
 float num2 = 34;
 double sum = num1 + num2; // stores decimal point values more precise
 System.out.println(sum);
 try (// Above i use 2 different types of Datatypes to store values
// Integers Datatypes :-- byte. short , int, long
Scanner sc = new Scanner(System.in)) {
    System.out.println("Enter a number and test the variable length for DECIMAL ");
    System.out.print("Enter a number to Test FLOAT variable :-->> ");
    float floatVar = sc.nextFloat();
    System.out.print("Enter a number to Test DOUBLE variable :-->> ");
    double doubleVar = sc.nextDouble();
 
    
    // Output of all integers variables
    System.out.println("The Value of Your Float Variable is  "+floatVar);
    System.out.println("The Value of Your Double Variable is "+doubleVar);

}catch(Exception e){System.out.println(e);  
//rest code of the program   
System.out.println("Re Run the code...");  
} 

    }
}
