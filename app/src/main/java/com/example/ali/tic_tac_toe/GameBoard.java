package com.example.ali.tic_tac_toe;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {

    public static final int EMPTY = 0;
    public static final int X = 1;
    public static final int O = 2;

    public static int[][] board = new int[3][3];

    public Point computerPoint;

    public int alphaBetaPruning(int treeDepth, int player) {
        if (isPlayerWon(X)) return 1;
        if (isPlayerWon(O)) return -1;

        // check for draw
        List<Point> emptyCells = getEmptyPoints();
        if (emptyCells.isEmpty())
            return 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < emptyCells.size(); i++) {
            Point currentPoint = emptyCells.get(i);

            switch (player) {
                case X:
                    setMovePoint(currentPoint, X);
                    int score = alphaBetaPruning(treeDepth + 1, O);
                    max = Math.max(score, max);
                    if (score >= 0 && treeDepth == 0)
                        computerPoint = currentPoint;
                    if (score == 1) {
                        board[currentPoint.getX()][currentPoint.getY()] = EMPTY;
                        break;
                    }
                    if (i == emptyCells.size() - 1 && max < 0 && treeDepth == 0)
                        computerPoint = currentPoint;

                    break;
                case O:
                    setMovePoint(currentPoint, O);
                    int currentScore = alphaBetaPruning(treeDepth + 1, X);
                    min = Math.min(currentScore, min);
                    if (min == -1) {
                        board[currentPoint.getX()][currentPoint.getY()] = EMPTY;
                        break;
                    }
            }

            board[currentPoint.getX()][currentPoint.getY()] = EMPTY;
        }

        return player == X ? max : min;
    }

    public boolean isPlayerWon(int player) {
        if ((board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == player)
                || (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] == player)) {
            return true;
        }
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] == player)
                    || (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] == player)) {
                return true;
            }
        }
        return false;
    }

    public List<Point> getEmptyPoints() {
        List<Point> emptyPoints = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY)
                    emptyPoints.add(new Point(i, j));
            }
        }
        return emptyPoints;
    }

    public boolean setMovePoint(Point point, int player) {
        if (board[point.getX()][point.getY()] != EMPTY)
            return false;
        board[point.getX()][point.getY()] = player;
        return true;
    }
}
