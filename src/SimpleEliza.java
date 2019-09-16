/*
You will be creating an interactive chat-bot type program. Eliza is a therapist program that interacts with the user.
 Your program will need to evaluate what the user asks and turn the user's input into a question that sounds like the
 therapist really cares.

Your first task is to develop a program with a running loop. If the user types in "I am feeling great" or enter "Q",
the program will stop running. Your program should print out the last input (as an output) every time before accepting
new input. Make sure you are accommodating for NO case-sensitivity. (Q is the same as q)
 */

import java.util.Scanner;

public class SimpleEliza {

    public static void main(String[] args){

        String answer = "";
        String inAns = "I am feeling great";
        Scanner input = new Scanner(System.in);

        System.out.println("Good day. What is your problem ?");
        System.out.println("-------------------------------------");

            while(!(answer.equalsIgnoreCase(inAns))&&!(answer.equalsIgnoreCase("Q"))) {

                    if (!answer.equalsIgnoreCase(inAns)|| !(answer.equalsIgnoreCase("Q"))) {

                            System.out.println("\nEnter your response here or Q to quit: ");
                            answer = input.nextLine();
                            System.out.println("***** " + answer + "*****");
                        }
                        else{
                            break;
                        }

                    System.out.println("\nEnter your response here or Q to quit: ");
                    answer = input.nextLine();
                    System.out.println("***** " + answer + "*****");
                }
  }
}
