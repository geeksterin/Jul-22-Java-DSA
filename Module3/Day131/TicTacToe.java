import java.util.* ;
import java.io.* ;

class Player {
    String name;
    Character marker;
    Player(String name, Character marker) {
        this.name = name;
        this.marker = marker;
    }
    String getName() { return this.name; }
    Character getMarker() { return this.marker; }
}

class Board {
    char matrix[][];
    
    Board() {
        matrix = new char[3][3];
        for ( int i = 0; i < 3; i++ )
            for ( int j = 0; j < 3; j++ )
                matrix[i][j] = '?';
    }

    boolean isSlotAvailable(int row, int col) {
        return this.matrix[row][col] == '?';
    }

    void printBoard() {
// ---------        
// | X O ? |
// | X ? O |
// | X X X |
// ---------
        // Printing first line of dashes
        for ( int i = 0 ; i < 9 ; i++ ) {
            System.out.print('-');
        }
        System.out.println();
        
        // Printing the actual board
        for ( char[] i : this.matrix) {
            // Currently in some row

            System.out.print("| ");

            for ( char j : i) {
                System.out.print(j+" ");   
            }
            System.out.println("|");
        }
        
        // Printing last line of dashes
        for ( int i = 0 ; i < 9 ; i++ ) {
            System.out.print('-');
        }
        System.out.println();
    }

    void putMarker(int row, int col, char marker) {
        this.matrix[row][col] = marker;
    }
    char getMarker(int row, int col) {
        return this.matrix[row][col];
    }

}

class Game {

    Board board;
    Player p1, p2, winner, currentPlayer;
    Scanner sc;
    
    Game() {
        
        this.board = new Board();
        sc = new Scanner(System.in);
        this.winner = null;
        
        // P1 inputs
        System.out.print("Name of the player 1:  ");
        String p1Name = sc.nextLine();
        System.out.print("Marker of player 1:  ");
        char p1Marker = sc.nextLine().charAt(0);

        this.p1 = new Player(p1Name, p1Marker);
        
        // P2 inputs
        System.out.print("Name of the player 2:  ");
        String p2Name = sc.nextLine();
        char p2Marker = 'X';
        if ( p2Marker==p1Marker ){
            p2Marker = 'O';
        }
        System.out.println("Marker of player 2 will be:  "+p2Marker);
        this.p2 = new Player(p2Name, p2Marker);

    }

    boolean play() {
        this.currentPlayer = this.p1;

        while (this.checkState().equals("CONTINUED")) {
            // make a move
            this.board.printBoard();
            while (this.makeMove()!=true) {
                System.out.println("Oops!! Couldn't make move.\nPlease Retry!!!");
            }
            this.switchPlayer();
        }

        if ( this.checkState().equals("DRAW") ) {
            System.out.println("DRAW");
            return true; // Game played successfully
        }

        // game has been won by someone.
        // winner is the other player
        
        this.switchPlayer();
        this.winner = this.currentPlayer;

        System.out.println("Game won by: "+this.winner.getName()+"("+this.winner.getMarker()+").");
        return true; // game won successfully by currentPlayer.
    }

    void switchPlayer() {
        if ( currentPlayer == this.p1 ) {
            currentPlayer = this.p2;
        } else {
            currentPlayer = this.p1;
        }
    }

    boolean makeMove() {

        // ask for a place to put the marker
        System.out.println("Please enter the coordinates where you want to put your "+currentPlayer.getMarker());
        int row = sc.nextInt();
        int col = sc.nextInt();
        if ( row<0 || row>2 || col<0 || col>2 || !this.board.isSlotAvailable(row, col) ) {
            return false;
        }
        this.board.putMarker(row, col, this.currentPlayer.getMarker());
        return true;
    }

    Player getWinner() {
        return this.winner;
    }

    String checkState() {
        
        // try to determine if the game is in a WIN state
        
        // 1. check all the rows
        for ( int row = 0 ; row < 3 ; row++ ) {
            char ch = this.board.getMarker(row,0);
            if ( ch=='?' ) {
                // we can skip this row
                continue;
            }
            boolean win = true;
            for ( int col = 1 ;col < 3 ; col++ ) {
                if ( this.board.getMarker(row,col)!=ch ) {
                    win = false;
                    break;
                }
            }
            if ( win ) {
                return "WIN";
            }
        }

        // 2. check all the cols
        for ( int col = 0 ; col < 3 ; col++ ) {
            char ch = this.board.getMarker(0,col);
            if ( ch=='?' ) {
                // we can skip this row
                continue;
            }
            boolean win = true;
            for ( int row = 1 ;row < 3 ; row++ ) {
                if ( this.board.getMarker(row,col)!=ch ) {
                    win = false;
                    break;
                }
            }
            if ( win ) {
                return "WIN";
            }
        }

        // 3. check the left diagonal
        char leftDiagonalMarker = this.board.getMarker(0,0);
        if ( leftDiagonalMarker!='?' ) {
            // now you can evaluate the left diagonal
            boolean win = true;
            for ( int i = 1 ; i < 3 ; i++ ) {
                if ( leftDiagonalMarker != this.board.getMarker(i,i) ) {
                    win = false;
                    break;
                }
            }
            if ( win ) {
                return "WIN";
            }
        }
        // 4. check the right diagonal
        char rightDiagonalMarker = this.board.getMarker(0,2);
        if ( rightDiagonalMarker!='?' ) {
            // now you can evaluate the left diagonal
            boolean win = true;
            for ( int i = 1 ; i < 3 ; i++ ) {
                if ( rightDiagonalMarker != this.board.getMarker(i,2-i) ) {
                    win = false;
                    break;
                }
            }
            if ( win ) {
                return "WIN";
            }
        }


        // Try to check if any of the slots are empty or not
        for ( int i = 0; i < 3; i++ )
            for ( int j = 0; j < 3; j++ )
                if ( this.board.isSlotAvailable(i, j) ) {
                    return "CONTINUED";
                }

        // all slots are filled and still no winner means
        return "DRAW";
    }

}


class TicTacToe {

    public static void main( String args[] ) {
        
        Scanner sc = new Scanner(System.in);
        Game newGame = new Game();
        newGame.play();

    }

}
