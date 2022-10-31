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

        for (int i = 0; i < board.length; i++) {
            if ((board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][2] == board[i][3] && board[i][3]==board[i][4]))
                return board[i][2];
        }
        for (int j = 0; j < board.length ; j++) {
            if ((board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[2][j] == board[3][j] && board[3][j] == board[4][j]))
                return board[2][j];
        }
            if ((board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] == board[3][3] && board[3][3] == board[4][4]
                || board[0][4] == board[1][3] && board[1][3] ==board[2][2] && board[3][1] ==board[4][0])){
                return board[2][2];
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

        if(counter == 25){
            return -1;
        }
        return 0;
    }

}
