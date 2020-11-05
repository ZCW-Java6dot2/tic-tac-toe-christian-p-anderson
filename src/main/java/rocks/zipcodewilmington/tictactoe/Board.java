package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {

        boolean win = false;
        char rowX = ' ';
        char columnX = ' ';
        char diagonal1X = ' ';
        char diagonal2X = ' ';

        //row
        for(int i = 0; i < 3; i++) {
            if(matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2] && matrix[i][0] != ' ' && matrix[i][0] == 'X') {
                rowX = 'X';
            }
        }

        //column
        for(int j = 0; j < 3; j++) {
            if(matrix[0][j] == matrix[1][j] && matrix[1][j] == matrix[2][j] && matrix[0][j] != ' ' && matrix[0][j] == 'X') {
                columnX = 'X';
            }
        }

        //diagonal1
        if(matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2] && matrix[0][0] != ' ' && matrix[0][0] == 'X') {
            diagonal1X = 'X';
        }

        if(matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0] && matrix[0][2] != ' ' && matrix[0][2] == 'X') {
            diagonal2X = 'X';
        }

        if(rowX == 'X' || columnX == 'X' || diagonal1X == 'X' || diagonal2X == 'X') {
            return true;
        } else {
            return false;
        }

    }

    public Boolean isInFavorOfO() {
        boolean win = false;
        char row = ' ';
        char column = ' ';
        char diagonal1 = ' ';
        char diagonal2 = ' ';

        //row
        for(int i = 0; i < 3; i++) {
            if(matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2] && matrix[i][0] != ' ' && matrix[i][0] == 'O') {
                row = 'O';
            }
        }

        //column
        for(int j = 0; j < 3; j++) {
            if(matrix[0][j] == matrix[1][j] && matrix[1][j] == matrix[2][j] && matrix[0][j] != ' ' && matrix[0][j] == 'O') {
                column = 'O';
            }
        }

        //diagonal1
        if(matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2] && matrix[0][0] != ' ' && matrix[0][0] == 'O') {
            diagonal1 = 'O';
        }

        if(matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0] && matrix[0][2] != ' ' && matrix[0][2] == 'O') {
            diagonal2 = 'O';
        }

        if(row == 'O' || column == 'O' || diagonal1 == 'O' || diagonal2 == 'O') {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isTie() {
        if(isInFavorOfX() == false && isInFavorOfO() == false) {
            return true;
        } else {
            return false;
        }
    }

    public String getWinner() {
        if(isInFavorOfX() == true) {
            return "X";
        } else if(isInFavorOfO() == true) {
            return "O";
        } else {
            return "";
        }
    }



    // there are positions in the 2x2 matrix
    // if certain positions are filled
}

