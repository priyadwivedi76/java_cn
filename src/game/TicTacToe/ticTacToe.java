package game.TicTacToe;

import java.util.Scanner;

public class ticTacToe {
    private Player player1,player2;
    private Board board;

    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        ticTacToe t=new ticTacToe();
        t.startGame();
    }

    public void startGame(){
        player1=takeInput(1);
        player2=takeInput(2);

        //take input like name and symbol from player
        while(player1.getSymbol() == player2.getSymbol()){
            System.out.println("The symbol you have entered is already being used.Please enter another symbol:");
            char symbol=sc.next().charAt(0);
            player2.setSymbol(symbol);
        }

        //create a board for game to begin
        board=new Board(player1.getSymbol(), player2.getSymbol());

        //game begins
        boolean player1_turn=true;
        int status=Board.Incomplete;
        while(status==Board.Incomplete || status==Board.Invalid){
            if(player1_turn){
                System.out.println("Player "+player1.getName()+"'s turn");
                System.out.println("Enter the x coordinates");
                int x=sc.nextInt();
                System.out.println("Enter y coordinates:");
                int y=sc.nextInt();


                status=board.move(player1.getSymbol(),x,y);
                if(status!=Board.Invalid){
                    player1_turn=false;
                    board.printBoard();
                }else{
                    System.out.println("Invalid Move..!Try Again");
                }
            }
            else{
                System.out.println("Player "+player2.getName()+"'s turn");
                System.out.println("Enter the x coordinates");
                int x=sc.nextInt();
                System.out.println("Enter y coordinates:");
                int y=sc.nextInt();
                status=board.move(player2.getSymbol(),x,y);
                if(status!=Board.Invalid){
                    player1_turn=true;
                    board.printBoard();
                }else{
                    System.out.println("Invalid Move..!Try Again");
                }
            }
        }
        if(status==Board.Player1_wins){
            System.out.println("Player "+player1.getName()+" wins!");
        }else if(status==Board.Player2_wins){
            System.out.println("Player "+player2.getName()+" wins");
        }else{
            System.out.println("Draw!");
        }
    }

    public Player takeInput(int num){
        System.out.println("Enter the name of the player"+num+":");
        String name=sc.next();
        System.out.println("Enter the symbol of the player"+num+":");
        char symbol=sc.next().charAt(0);
        Player p=new Player(name, symbol);
        return p;
    }
    
}

class Player{
    private String name;
    private char symbol;

    public Player(String name,char symbol){
        this.name=name;
        this.symbol=symbol;
    }

    //getter-name
    public String getName(){
        return this.name;
    }

    //setter-name
    public void setName(String name){
        this.name=name;
    }

    //getter-symbol
    public char getSymbol(){
        return this.symbol;
    }

    //setter-symbol
    public void setSymbol(char symbol){
        this.symbol=symbol;
    }
}

class Board{
    private char board[][];
    private int boardSize=3;
    private char p1Symbol,p2Symbol;
    private int count;
    public final static int Player1_wins=1;
    public final static int Player2_wins=2;
    public final static int Draw=3;
    public final static int Incomplete=4;
    public final static int Invalid=5;


    public Board(char p1Symbol,char p2Symbol){
        board=new char[boardSize][boardSize];
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                board[i][j]=' ';
            }
        }
        this.p1Symbol=p1Symbol;
        this.p2Symbol=p2Symbol;
    }
    public void printBoard(){
        System.out.println("----------------");
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                System.out.print("|"+board[i][j]+"|");
            }
            System.out.println();
            System.out.println("---------------");
        }
    }

    public int move(char symbol,int x,int y){
        if(x<0 || y<0 || x>boardSize || y>boardSize){
            return Invalid;
        }

        board[x][y]=symbol;
        count++;

        //rows
        if(board[x][0]==board[x][1] && board[x][1]==board[x][2]){
            return symbol==p1Symbol?Player1_wins:Player2_wins;
        }

        //columns
        if(board[0][y]==board[1][y] && board[1][y]==board[2][y]){
            return symbol==p1Symbol?Player1_wins:Player2_wins;
        }

        //diagonal-first
        if(board[0][0]!=' ' && board[0][0]==board[1][1] && board[1][1]==board[2][2]){
            return symbol==p1Symbol?Player1_wins:Player2_wins;
        }

        //diagonal-second
        if(board[0][2]!=' ' && board[0][2]==board[1][1] && board[1][1]==board[2][0]){
            return symbol==p1Symbol?Player1_wins:Player2_wins;
        }

        if(count==boardSize*boardSize){
            return Draw;
        }

        return Incomplete;
    }
    }

