package no.academy.tictac;

public class Game {

    /**
     * Return 0 if no winner is determined yet
     * Return 1 for player 1 (Red)
     * Return 2 for player 2 (Blue)
     * Return -1 if nobody wins (draw)
     *
     * @param board a grid reprenting game squares
     * @return -1, 0, 1 or 2
     */
    int counter =0;
    public int determineWinner(int[][] board) {
        counter++;

        for (int i = 0; i <= 2; i++) {
            if ((board[i][0] == board[i][1] && board[i][1] == board[i][2]))
                return board[i][2];
        }
        for (int j = 0; j <=2 ; j++) {
            if ((board[0][j] == board[1][j] && board[1][j] == board[2][j]))
                return board[2][j];
        }

            if ((board[0][0] == board[1][1] && board[1][1] == board[2][2]
                || board[0][2] == board[1][1] && board[1][1] ==board[2][0])){
                return board[1][1];
            }

        /*if (board[0][0] == 1 && board[0][1] ==1 && board[0][2] ==1
            || board[1][0] == 1 && board[1][1] ==1 && board[1][2] ==1
            || board[2][0] == 1 && board[2][1] ==1 && board[2][2] ==1
            || board[0][1] == 1 && board[1][1] ==1 && board[2][1] ==1
            || board[1][0] == 1 && board[1][1] ==1 && board[1][2] ==1
            || board[2][0] == 1 && board[2][1] ==1 && board[2][2] ==1
            || board[0][0] == 1 && board[1][1] ==1 && board[2][2] ==1
            || board[0][2] == 1 && board[1][1] ==1 && board[2][0] ==1
        ){return 1;
            } else if (board[0][0] == 2 && board[0][1] ==2 && board[0][2] ==2
                || board[1][0] == 2 && board[1][1] ==2 && board[1][2] ==2
                || board[2][0] == 2 && board[2][1] ==2 && board[2][2] ==2
                || board[0][1] == 1 && board[1][1] ==1 && board[2][1] ==1
                || board[1][0] == 2 && board[1][1] ==2 && board[1][2] ==2
                || board[2][0] == 2 && board[2][1] ==2 && board[2][2] ==2
                || board[0][0] == 2 && board[1][1] ==2 && board[2][2] ==2
                || board[0][2] == 2 && board[1][1] ==2 && board[2][0] ==2

        ) {return 2;
        }*/ /*else*/

        if(counter == 9){
            return -1;
        }
        return 0;
    }

}
