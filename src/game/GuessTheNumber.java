package src.game;
import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber {
    public static void main(String[] args) {
        Game guessGame=new Game();
        guessGame.checkNum();
    }
}

class Game {
    int comp;
    int user;
    int count = 1;
    Scanner sc = new Scanner(System.in);

    //constructore
    public Game() {
        Random ran = new Random();
        comp = ran.nextInt(100);
        System.out.println(comp);
    }

    //check if the number is smaller or greater than the number
    public void checkNum() {
        System.out.println("Enter the number:");
        user = sc.nextInt();
        while (count<=10) {
            if (user!=comp) {
                if(user>comp){
                    System.out.println("The number you have entered is too large.Consider a smaller number");
                    user = sc.nextInt();
                    count++;
                }else if(user<comp){
                    System.out.println("Consider a greater number:");
                    user = sc.nextInt();
                    count++;
                }
            }else{
                System.out.print("The number you guessed is correct at:"+count);
                return;
            }
        }
        System.out.println("You lost!");
    }
}

