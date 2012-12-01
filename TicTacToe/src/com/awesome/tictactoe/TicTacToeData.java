package com.awesome.tictactoe;

public class TicTacToeData {
	int[] p1data;
    int[] p2data;

    public TicTacToeData() {
        p1data = new int[] {0,0,0,0,0,0,0,0};
        p2data = new int[] {0,0,0,0,0,0,0,0};
    }

    public boolean add(int x, int y, boolean player) {
        //Converts x, y into index
        if (player) {
            p1data[x]++;
            p2data[y+3]++;
            if (x == y) p1data[6]++;
            if (x+y == 2) p1data[7]++;
            if (check(p1data)) System.out.println("X has won");
            return check(p1data);
        } else {
            p2data[x]++;
            p2data[y]++;
            if (x == y) p2data[6]++;
            if (x+y == 2) p2data[7]++;
            if (check(p2data)) System.out.println("O has won");
            return check(p2data);
        } 
    }

    public boolean check(int[] data) {
        for (int i : data) {
            if (i == 3) {
                return true;
            }
        }
        return false;
    }
            


            


}