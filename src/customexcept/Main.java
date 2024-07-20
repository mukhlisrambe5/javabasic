package customexcept;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = scan.nextInt();

        try{
            checkAge(age);
        }catch (Exception e){
        System.out.println("An error occurred: " + e.getMessage());
        }
    }

    static void checkAge(int age) throws Exception {
        if(age <18){
            throw new Exception("You are not eligible to vote");
        }else{
            System.out.println("You are eligible to vote");
        }
    }
}
