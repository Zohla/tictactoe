package no.academy.tictac;
import javafx.scene.shape.Rectangle;
import java.util.Collection;

public class Game {
    int counter = 0;//count turns taken to evaluate draw

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int determineWinner(int[][] board, Rectangle target) {
        counter++;
        //get coordinates from target rectangle
        Collection<Object> coordinates = target.getProperties().values();
        Object[] coorArr = coordinates.toArray();

        int coor1 = (int) coorArr[1];
        int coor2 = (int) coorArr[0];
        int value = board[coor1][coor2]; //set the value to target rectangle

        // check row containing target coordinates
        int correctRowCount = 0;
        for (int j = 0; j < board.length; j++) {
            if ((board[coor1][j] == value)) { //check if values on row have same value
                correctRowCount++;
            }
        }
        if (correctRowCount == board.length){return value;}

        // check column containing target coordinates
        int correctColCount = 0;
        for (int j = 0; j < board.length; j++) {
            if ((board[j][coor2] == value)) {
                correctColCount++;
            }
        }
        if (correctColCount == board.length){return value;}

        //add loop [++][++] for the first diagonal check and [++][--] for the other(check only if target is on the diagonal?)
        int diaSub = board.length-1;
        int correctCountLeft =0;
        int correctCountRight =0;
        for ( int diaAdd =0;diaAdd< board.length;diaAdd++){
            if ((board[diaAdd][diaSub] == value)) {
                correctCountLeft++;
                diaSub--;
            }
            if ((board[diaAdd][diaAdd] == value)) {
                correctCountRight++;
            }
        }
        if (correctCountLeft == board.length || correctCountRight ==board.length){
            return value;
        }
        if (counter == board.length * board.length) {
            return -1;
        }
        return 0;
    }
}