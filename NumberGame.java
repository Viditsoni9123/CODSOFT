import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chanceToPlay = 5;
        int finals = 0;
        boolean playAgain = true;

        System.out.println("Welcome Player!");
        System.out.println("Hey player! you have about " + chanceToPlay + " chances to win the game");

        while (playAgain) {
            int rand = getrandN(1, 100);
            boolean guess = false;

            for (int i = 0; i < chanceToPlay; i++) {
                System.out.println("Chance " + (i + 1) + " Enter your number: ");
                int user = sc.nextInt();

                if (user == rand) {
                    guess=true;
                    finals += 1;
                    System.out.println("You won it.");
                    break;
                } else if (user > rand) {
                    System.out.println("Too high");
                } else {
                    System.out.println("Too low");
                }
            }

            if (!guess){
                System.out.println("Sorry player, you lost the chance. The number is: "+rand);
            }

            System.out.print("Do you want to play again(Y/N): ");
            String pA= sc.next();

            playAgain=pA.equalsIgnoreCase("Y");
        }

        sc.close();

        System.out.println("\nHope you enjoyed.");
        System.out.println("Here's your score: "+finals);
    }

    public static int getrandN(int min, int max){
        return (int)(Math.random() * (max - min + 1)) + min;
    }
}