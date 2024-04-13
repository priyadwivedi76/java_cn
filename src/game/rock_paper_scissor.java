package src.game;
import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissor {
        public static void main(String[] args) {
        Random ran=new Random();
        Scanner sc=new Scanner(System.in);
        int countOfUser=0;
        int countOfComp=0;
        int game=0;
            while(game<3){
                int computerNum=ran.nextInt(0,2);
                System.out.println("Enter the number between 0/1/2 where 0 stands for rock,1 stands for scissor and 2 is paper:");
                int userNum=sc.nextInt();
                System.out.println("The number entered by computer is:"+computerNum);
                 if(computerNum==0){
                    if(userNum==0){
                        System.out.println("Tie");
                        continue;
                    }
                    else{
                        if(userNum==1){
                            System.out.println("Computer wins");
                            countOfComp++;
                        }else{
                            System.out.println("You win");
                            countOfUser++;
                        }
                    }
                    }
               else  if(computerNum==1){
                    if(userNum==1){
                        System.out.println("Tie");
                        continue;
                    }
                    else{
                        if(userNum==0){
                            System.out.println("You win");
                            countOfUser++;
                        }else{
                            System.out.println("Computer wins");
                            countOfComp++;
                        }
                    }
                }
               else if (computerNum==2) {
                   if(userNum==2){
                       System.out.println("Tie");
                       continue;
                   }else if(userNum==1){
                       System.out.println("You win");
                       countOfUser++;
                   }else{
                       System.out.println("Computer wins");
                       countOfComp++;
                   }
                }
                game++;
            }
            System.out.print("The final result is:");
            if(countOfComp>countOfUser){
                System.out.println("Computer wins");
            }else{
                System.out.println("You win");
            }
        }
}
