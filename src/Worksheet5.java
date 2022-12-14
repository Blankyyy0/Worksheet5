import java.util.Objects;
import java.util.Scanner;

public class Worksheet5 {
    public static void main(String[] args) {
        //Stage 1
        System.out.println("Input a word:");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        System.out.println("Input another word");
        String word2 = scan.nextLine();

        descartes(word, word2);


        //Stage 2

        System.out.println("Input a number:");
        int num = scan.nextInt();

        System.out.println("Input another number:");
        int num2 = scan.nextInt();
        String x = scan.nextLine();


        factor(num, num2);


        //Stage 3

        System.out.println("Input your sentence:");
        String sentence = scan.nextLine();

        decode(sentence);

        //Stage 4

        System.out.println("What's the current iteration?");
        int iteration = scan.nextInt();

        System.out.println("What's the difference?");
        int difference = scan.nextInt();


        matrixiterations(iteration, difference);

        String Y = scan.nextLine();

        //Stage 5

        System.out.println("Guess my favorite food");
        String foodGuess = scan.nextLine();

        foodguess(foodGuess);

        //Stage 6

        System.out.println("Enter your email:");
        String email = scan.nextLine();

        email(email);


    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Stage 1
    public static void descartes(String word, String word2) {
        System.out.println("I " + word + " therefore I " + word2);
    }

    //Stage 2
    public static void factor(int num1, int num2) {
        if (num1 % num2 == 0) {
            boolean factor = true;
            System.out.println("it is " + factor);
        } else {
            boolean factor = false;
            System.out.println("it is " + factor);
        }
    }

    //Stage 3
    public static void decode(String sentence) {
        String fixedSentence = sentence.replace("###", "o");
        String fixedSentence2 = fixedSentence.replace("##", "e");
        String fixedSentence3 = fixedSentence2.replace("%%", "a");
        System.out.println(fixedSentence3);
    }

    //Stage 4
    public static void matrixiterations(int current, int difference) {

        System.out.println("This is the present, Neo... iteration " + current);

        for (int i = 0; i < current; i++) {
            current -= difference;
            System.out.println("iteration " + current);
        }

        System.out.println("Done!");

    }

    //Stage 5
    public static void foodguess(String foodGuess) {
        for (int i = 1; i < 4; i++) {
            System.out.println("What's my favorite food? (" + i + " try)");
            if (Objects.equals(foodGuess, "pizza")) {
                System.out.println("Correct!");
                break;
            }
        }
    }

    //Stage 6

    public static void email(String email) {
        if (email.contains("@") && email.contains(".com")) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
    }
}






