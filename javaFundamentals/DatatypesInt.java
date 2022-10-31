package javaFundamentals;

import java.util.Scanner;
public class DatatypesInt {
    
public static void main(String[] args) {
    // Datatypes in java are used to store different kind of data into variable
 int num1 = 22; // stores integers 123,-1-2-3..
 int num2 = 34;
 float sum = num1 + num2; // stores decimal point values 
 System.out.println(sum);
try (// Above i use 2 different types of Datatypes to store values
// Integers Datatypes :-- byte. short , int, long
Scanner sc = new Scanner(System.in)) {
    System.out.println("Enter a number and test the variable length ");
    System.out.print("Enter a number to Test Byte variable :-->> ");
    byte byteVar = sc.nextByte();
    System.out.print("Enter a number to Test Short variable :-->> ");
    short shortVar = sc.nextShort();
    System.out.print("Enter a number to Test Int variable :-->> ");
    int integer = sc.nextInt();
    System.out.print("Enter a number to Test Long variable :-->> ");
    long longVar = sc.nextLong();
    
    // Output of all integers variables
    System.out.println("The Value of Your Byte Variable is  "+byteVar);
    System.out.println("The Value of Your Short Variable is "+shortVar);
    System.out.println("The Value of Your Int Variable is "+integer);
    System.out.println("The Value of Your Long Variable is "+longVar);
}catch(Exception e){System.out.println(e);  
//rest code of the program   
System.out.println("Re Run the code...");  
} 




}


}
