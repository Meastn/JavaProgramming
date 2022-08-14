package Replit.Arrays;

import java.util.Arrays;

public class ChessBoard2DArrays {
    public static void main(String[] args) {
        String [][]  chessboard = new String [8] [8];
        String ch = "abcdefgh";
        int cells=1;

        for (int i =0; i<8 ; i++){
            cells =i+1;
            for (int j=0; j<8; j++){
                chessboard[i] [j] = ""+ cells + ch.charAt(j) ;
            }

        }
        System.out.println(Arrays.deepToString(chessboard));
    }
}


/*
Given a 8x8 two-dimensional array
of strings named chessboard.
Initialize values inside an array
accordingly to the chess board.
So first element in the array, chessboard[0] should have
a value "1a", and last element in the array,
chessboard[7] should have a value "8h".

 */