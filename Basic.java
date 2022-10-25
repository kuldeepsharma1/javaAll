import java.util.Scanner;

class Basic{
    //main function of java 
    public static void main(String args[]){
        System.out.println("Hello to HYTEK JAVA");
        System.out.println("Hello to HYTEK JAVA\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age:>>");
        int age = sc.nextInt();
        
        // check the user age and apply rules
        if (age <= 18 ){
            System.out.println(" you can't drive");
        }
        else{
            System.out.println(" you can drive");
        }


      
      

    }
}

