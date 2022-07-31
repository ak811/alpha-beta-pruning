package com.example.ali.tic_tac_toe;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class OnePlayerActivity extends AppCompatActivity {

    // O wants to maximize.
    // X wants to minimize.

    private int counter = 0;

    int whoBeginsFirst;
    public static final int X = 1;
    public static final int O = 2;

    public Random RANDOM = new Random();

    GameBoard gameBoard;

    Button newGameButton;
    TextView whoTurn_textView;

    Button buttons[][] = new Button[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_board);

        gameBoard = new GameBoard();

//        whoBeginsFirstDialog();

        initButtons();

        initActionListener();

        whoTurn_textView.setText("Your Turn");
    }

    private void showOnTheBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (GameBoard.board[i][j] == O)
                    buttons[i][j].setText("O");
                else if (GameBoard.board[i][j] == X)
                    buttons[i][j].setText("X");
            }
        }
    }

    private void initButtons() {
        buttons[0][0] = findViewById(R.id.btn0);
        buttons[0][1] = findViewById(R.id.btn1);
        buttons[0][2] = findViewById(R.id.btn2);
        buttons[1][0] = findViewById(R.id.btn3);
        buttons[1][1] = findViewById(R.id.btn4);
        buttons[1][2] = findViewById(R.id.btn5);
        buttons[2][0] = findViewById(R.id.btn6);
        buttons[2][1] = findViewById(R.id.btn7);
        buttons[2][2] = findViewById(R.id.btn8);

        newGameButton = findViewById(R.id.newGameBtn);
        whoTurn_textView = findViewById(R.id.whoTurn_textView);
    }

    private void whoBeginsFirstDialog() {
        new AlertDialog.Builder(this)
//                .setTitle("View was...")
                .setMessage("Who begins first?")
                .setPositiveButton("Me", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        whoBeginsFirst = O;
                        whoTurn_textView.setText("Your turn");
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("Computer", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        whoBeginsFirst = X;
                        Point point = new Point(RANDOM.nextInt(3), RANDOM.nextInt(3));
                        gameBoard.setMovePoint(point, GameBoard.X);
                        showOnTheBoard();
//                        whoTurn_textView.setText("Computer Turn");
                        buttons[point.getX()][point.getY()].setText("X");
                        dialog.dismiss();
                    }
                })
                .show();
    }

    private void initActionListener() {
        //]
        buttons[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttons[0][0].isEnabled()) {
                    buttons[0][0].setText("O");
                    buttons[0][0].setEnabled(false);
                    counter++;

                    GameBoard.board[0][0] = O;

                    gameBoard.setMovePoint(new Point(0, 0), GameBoard.O);
                    gameBoard.alphaBetaPruning(0, GameBoard.X);
                    if (gameBoard.computerPoint != null) {
                        gameBoard.setMovePoint(new Point(gameBoard.computerPoint.getX(), gameBoard.computerPoint.getY()), GameBoard.X);
                        buttons[gameBoard.computerPoint.getX()][gameBoard.computerPoint.getY()].setText("X");
                    }
                }
                whoWins();
            }
        });
        buttons[0][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttons[0][1].isEnabled()) {
                    buttons[0][1].setText("O");
                    buttons[0][1].setEnabled(false);
                    counter++;

                    GameBoard.board[0][1] = O;

                    gameBoard.setMovePoint(new Point(0, 1), GameBoard.O);
                    gameBoard.alphaBetaPruning(0, GameBoard.X);
                    if (gameBoard.computerPoint != null) {
                        gameBoard.setMovePoint(new Point(gameBoard.computerPoint.getX(), gameBoard.computerPoint.getY()), GameBoard.X);
                        buttons[gameBoard.computerPoint.getX()][gameBoard.computerPoint.getY()].setText("X");
                    }
                }
                whoWins();
            }
        });
        buttons[0][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttons[0][2].isEnabled()) {
                    buttons[0][2].setText("O");
                    buttons[0][2].setEnabled(false);
                    counter++;

                    GameBoard.board[0][2] = O;

                    gameBoard.setMovePoint(new Point(0, 2), GameBoard.O);
                    gameBoard.alphaBetaPruning(0, GameBoard.X);
                    if (gameBoard.computerPoint != null) {
                        gameBoard.setMovePoint(new Point(gameBoard.computerPoint.getX(), gameBoard.computerPoint.getY()), GameBoard.X);
                        buttons[gameBoard.computerPoint.getX()][gameBoard.computerPoint.getY()].setText("X");
                    }
                }
                whoWins();
            }
        });
        buttons[1][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttons[1][0].isEnabled()) {
                    buttons[1][0].setText("O");
                    buttons[1][0].setEnabled(false);
                    counter++;

                    GameBoard.board[1][0] = O;

                    gameBoard.setMovePoint(new Point(1, 0), GameBoard.O);
                    gameBoard.alphaBetaPruning(0, GameBoard.X);
                    if (gameBoard.computerPoint != null) {
                        gameBoard.setMovePoint(new Point(gameBoard.computerPoint.getX(), gameBoard.computerPoint.getY()), GameBoard.X);
                        buttons[gameBoard.computerPoint.getX()][gameBoard.computerPoint.getY()].setText("X");
                    }
                }
                whoWins();
            }
        });
        buttons[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttons[1][1].isEnabled()) {
                    buttons[1][1].setText("O");
                    buttons[1][1].setEnabled(false);
                    counter++;

                    GameBoard.board[1][1] = O;

                    gameBoard.setMovePoint(new Point(1, 1), GameBoard.O);
                    gameBoard.alphaBetaPruning(0, GameBoard.X);
                    if (gameBoard.computerPoint != null) {
                        gameBoard.setMovePoint(new Point(gameBoard.computerPoint.getX(), gameBoard.computerPoint.getY()), GameBoard.X);
                        buttons[gameBoard.computerPoint.getX()][gameBoard.computerPoint.getY()].setText("X");
                    }
                }
                whoWins();
            }
        });
        buttons[1][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttons[1][2].isEnabled()) {
                    buttons[1][2].setText("O");
                    buttons[1][2].setEnabled(false);
                    counter++;

                    GameBoard.board[1][2] = O;

                    gameBoard.setMovePoint(new Point(1, 2), GameBoard.O);
                    gameBoard.alphaBetaPruning(0, GameBoard.X);
                    if (gameBoard.computerPoint != null) {
                        gameBoard.setMovePoint(new Point(gameBoard.computerPoint.getX(), gameBoard.computerPoint.getY()), GameBoard.X);
                        buttons[gameBoard.computerPoint.getX()][gameBoard.computerPoint.getY()].setText("X");
                    }
                }
                whoWins();
            }
        });
        buttons[2][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttons[2][0].isEnabled()) {
                    buttons[2][0].setText("O");
                    buttons[2][0].setEnabled(false);
                    counter++;

                    GameBoard.board[2][0] = O;

                    gameBoard.setMovePoint(new Point(2, 0), GameBoard.O);
                    gameBoard.alphaBetaPruning(0, GameBoard.X);
                    if (gameBoard.computerPoint != null) {
                        gameBoard.setMovePoint(new Point(gameBoard.computerPoint.getX(), gameBoard.computerPoint.getY()), GameBoard.X);
                        buttons[gameBoard.computerPoint.getX()][gameBoard.computerPoint.getY()].setText("X");
                    }
                }
                whoWins();
            }
        });
        buttons[2][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttons[2][1].isEnabled()) {
                    buttons[2][1].setText("O");
                    buttons[2][1].setEnabled(false);
                    counter++;

                    GameBoard.board[2][1] = O;

                    gameBoard.setMovePoint(new Point(2, 1), GameBoard.O);
                    gameBoard.alphaBetaPruning(0, GameBoard.X);
                    if (gameBoard.computerPoint != null) {
                        gameBoard.setMovePoint(new Point(gameBoard.computerPoint.getX(), gameBoard.computerPoint.getY()), GameBoard.X);
                        buttons[gameBoard.computerPoint.getX()][gameBoard.computerPoint.getY()].setText("X");
                    }
                }
                whoWins();
            }
        });
        buttons[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttons[2][2].isEnabled()) {
                    buttons[2][2].setText("O");
                    buttons[2][2].setEnabled(false);
                    counter++;

                    GameBoard.board[2][2] = O;

                    gameBoard.setMovePoint(new Point(2, 2), GameBoard.O);
                    gameBoard.alphaBetaPruning(0, GameBoard.X);
                    if (gameBoard.computerPoint != null) {
                        gameBoard.setMovePoint(new Point(gameBoard.computerPoint.getX(), gameBoard.computerPoint.getY()), GameBoard.X);
                        buttons[gameBoard.computerPoint.getX()][gameBoard.computerPoint.getY()].setText("X");
                    }
                }
                whoWins();
            }
        });

        newGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopGame();

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        buttons[i][j].setText("");
                    }
                }
//                whoBeginsFirstDialog();
                whoTurn_textView.setTextColor(Color.BLACK);
                counter = 0;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        buttons[i][j].setEnabled(true);
                        buttons[i][j].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.gray));
                    }
                }

                RANDOM = new Random();
                buttons = new Button[3][3];
                gameBoard = new GameBoard();
                gameBoard.computerPoint = null;
                gameBoard.board = new int[3][3];
                initButtons();
                initActionListener();
                whoTurn_textView.setText("Your Turn");
                counter = 0;
            }
        });
    }

    private void whoWins() {
        //horizontal
        if (buttons[0][0].getText() == buttons[0][1].getText() && buttons[0][1].getText() == buttons[0][2].getText()
                && !buttons[0][0].getText().equals("") && !buttons[0][1].getText().equals("") && !buttons[0][2].getText().equals("")) {
            if (buttons[0][0].getText().equals("X"))
                whoTurn_textView.setText("X won!");
            else
                whoTurn_textView.setText("O won!");
            buttons[0][0].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            buttons[0][1].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            buttons[0][2].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            whoTurn_textView.setTextColor(getResources().getColor(R.color.green));
            stopGame();
        } else if (buttons[1][0].getText() == buttons[1][1].getText() && buttons[1][1].getText() == buttons[1][2].getText()
                && !buttons[1][0].getText().equals("") && !buttons[1][1].getText().equals("") && !buttons[1][2].getText().equals("")) {
            if (buttons[1][0].getText().equals("X"))
                whoTurn_textView.setText("X won!");
            else
                whoTurn_textView.setText("O won!");
            buttons[1][0].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            buttons[1][1].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            buttons[1][2].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            whoTurn_textView.setTextColor(getResources().getColor(R.color.green));
            stopGame();
        } else if (buttons[2][0].getText() == buttons[2][1].getText() && buttons[2][1].getText() == buttons[2][2].getText()
                && !buttons[2][0].getText().equals("") && !buttons[2][1].getText().equals("") && !buttons[2][2].getText().equals("")) {
            if (buttons[2][0].getText().equals("X"))
                whoTurn_textView.setText("X won!");
            else
                whoTurn_textView.setText("O won!");
            buttons[2][0].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            buttons[2][1].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            buttons[2][2].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            whoTurn_textView.setTextColor(getResources().getColor(R.color.green));
            stopGame();
        }
        //vertical
        else if (buttons[0][0].getText() == buttons[1][0].getText() && buttons[1][0].getText() == buttons[2][0].getText()
                && !buttons[0][0].getText().equals("") && !buttons[1][0].getText().equals("") && !buttons[2][0].getText().equals("")) {
            if (buttons[0][0].getText().equals("X"))
                whoTurn_textView.setText("X won!");
            else
                whoTurn_textView.setText("O won!");
            buttons[0][0].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            buttons[1][0].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            buttons[2][0].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            whoTurn_textView.setTextColor(getResources().getColor(R.color.green));
            stopGame();
        } else if (buttons[0][1].getText() == buttons[1][1].getText() && buttons[1][1].getText() == buttons[2][1].getText()
                && !buttons[0][1].getText().equals("") && !buttons[1][1].getText().equals("") && !buttons[2][1].getText().equals("")) {
            if (buttons[0][1].getText().equals("X"))
                whoTurn_textView.setText("X won!");
            else
                whoTurn_textView.setText("O won!");
            buttons[0][1].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            buttons[1][1].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            buttons[2][1].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            whoTurn_textView.setTextColor(getResources().getColor(R.color.green));
            stopGame();
        } else if (buttons[0][2].getText() == buttons[1][2].getText() && buttons[1][2].getText() == buttons[2][2].getText()
                && !buttons[0][2].getText().equals("") && !buttons[1][2].getText().equals("") && !buttons[2][2].getText().equals("")) {
            if (buttons[0][2].getText().equals("X"))
                whoTurn_textView.setText("X won!");
            else
                whoTurn_textView.setText("O won!");
            buttons[0][2].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            buttons[1][2].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            buttons[2][2].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            whoTurn_textView.setTextColor(getResources().getColor(R.color.green));
            stopGame();
        }
        //diagonal
        else if (buttons[0][0].getText() == buttons[1][1].getText() && buttons[1][1].getText() == buttons[2][2].getText()
                && !buttons[0][0].getText().equals("") && !buttons[1][1].getText().equals("") && !buttons[2][2].getText().equals("")) {
            if (buttons[0][0].getText().equals("X"))
                whoTurn_textView.setText("X won!");
            else
                whoTurn_textView.setText("O won!");
            buttons[0][0].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            buttons[1][1].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            buttons[2][2].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            whoTurn_textView.setTextColor(getResources().getColor(R.color.green));
            stopGame();
        } else if (buttons[0][2].getText() == buttons[1][1].getText() && buttons[1][1].getText() == buttons[2][0].getText()
                && !buttons[0][2].getText().equals("") && !buttons[1][1].getText().equals("") && !buttons[2][0].getText().equals("")) {
            if (buttons[0][2].getText().equals("X"))
                whoTurn_textView.setText("X won!");
            else
                whoTurn_textView.setText("O won!");
            buttons[0][2].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            buttons[1][1].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            buttons[2][0].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            whoTurn_textView.setTextColor(getResources().getColor(R.color.green));
            stopGame();
        } else if (counter == 5) {
            whoTurn_textView.setText("Draw!");
            whoTurn_textView.setTextColor(getResources().getColor(R.color.green));
            stopGame();
        }
    }

    private void stopGame() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setEnabled(false);
            }
    }

}
