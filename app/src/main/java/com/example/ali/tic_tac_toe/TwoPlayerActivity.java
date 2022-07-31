package com.example.ali.tic_tac_toe;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TwoPlayerActivity extends AppCompatActivity {
    private static int counter = 0;

    Button newGameBtn;
    TextView whoTurn_textView;

    Button btn[] = new Button[9];
    boolean isClicked[] = new boolean[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_board);

        initButtons();

        initActionListener();
    }

    private void initButtons() {
        btn[0] = findViewById(R.id.btn0);
        btn[1] = findViewById(R.id.btn1);
        btn[2] = findViewById(R.id.btn2);
        btn[3] = findViewById(R.id.btn3);
        btn[4] = findViewById(R.id.btn4);
        btn[5] = findViewById(R.id.btn5);
        btn[6] = findViewById(R.id.btn6);
        btn[7] = findViewById(R.id.btn7);
        btn[8] = findViewById(R.id.btn8);

        newGameBtn = findViewById(R.id.newGameBtn);
        whoTurn_textView = findViewById(R.id.whoTurn_textView);
    }

    private void initActionListener() {
        //]
        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isClicked[0]) {
                    if (counter % 2 == 0) {
                        btn[0].setText("X");
                        whoTurn_textView.setText("O turn");
                    } else {
                        btn[0].setText("O");
                        whoTurn_textView.setText("X turn");
                    }
                    counter++;
                    isClicked[0] = true;
//                    btn[0].setTextColor(android.R.drawable.btn_default);
                }
                whoWins();
            }
        });
        btn[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isClicked[1]) {
                    if (counter % 2 == 0) {
                        btn[1].setText("X");
                        whoTurn_textView.setText("O turn");
                    } else {
                        btn[1].setText("O");
                        whoTurn_textView.setText("X turn");
                    }
                    counter++;
                    isClicked[1] = true;
//                    btn[0].setTextColor(android.R.drawable.btn_default);

                }
                whoWins();
            }
        });
        btn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isClicked[2]) {
                    if (counter % 2 == 0) {
                        btn[2].setText("X");
                        whoTurn_textView.setText("O turn");
                    } else {
                        btn[2].setText("O");
                        whoTurn_textView.setText("X turn");
                    }
                    counter++;
                    isClicked[2] = true;
//                    btn[0].setTextColor(android.R.drawable.btn_default);
                }
                whoWins();
            }
        });
        btn[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isClicked[3]) {
                    if (counter % 2 == 0) {
                        btn[3].setText("X");
                        whoTurn_textView.setText("O turn");
                    } else {
                        btn[3].setText("O");
                        whoTurn_textView.setText("X turn");
                    }
                    counter++;
                    isClicked[3] = true;
//                    btn[0].setTextColor(android.R.drawable.btn_default);
                }
                whoWins();
            }
        });
        btn[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isClicked[4]) {
                    if (counter % 2 == 0) {
                        btn[4].setText("X");
                        whoTurn_textView.setText("O turn");
                    } else {
                        btn[4].setText("O");
                        whoTurn_textView.setText("X turn");
                    }
                    counter++;
                    isClicked[4] = true;
//                    btn[0].setTextColor(android.R.drawable.btn_default);
                }
                whoWins();
            }
        });
        btn[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isClicked[5]) {
                    if (counter % 2 == 0) {
                        btn[5].setText("X");
                        whoTurn_textView.setText("O turn");
                    } else {
                        btn[5].setText("O");
                        whoTurn_textView.setText("X turn");
                    }
                    counter++;
                    isClicked[5] = true;
//                    btn[0].setTextColor(android.R.drawable.btn_default);
                }
                whoWins();
            }
        });
        btn[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isClicked[6]) {
                    if (counter % 2 == 0) {
                        btn[6].setText("X");
                        whoTurn_textView.setText("O turn");
                    } else {
                        btn[6].setText("O");
                        whoTurn_textView.setText("X turn");
                    }
                    counter++;
                    isClicked[6] = true;
//                    btn[0].setTextColor(android.R.drawable.btn_default);
                }
                whoWins();
            }
        });
        btn[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isClicked[7]) {
                    if (counter % 2 == 0) {
                        btn[7].setText("X");
                        whoTurn_textView.setText("O turn");
                    } else {
                        btn[7].setText("O");
                        whoTurn_textView.setText("X turn");
                    }
                    counter++;
                    isClicked[7] = true;
//                    btn[0].setTextColor(android.R.drawable.btn_default);
                }
                whoWins();
            }
        });
        btn[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isClicked[8]) {
                    if (counter % 2 == 0) {
                        btn[8].setText("X");
                        whoTurn_textView.setText("O turn");
                    } else {
                        btn[8].setText("O");
                        whoTurn_textView.setText("X turn");
                    }
                    counter++;
                    isClicked[8] = true;
//                    btn[0].setTextColor(android.R.drawable.btn_default);
                }
                whoWins();
            }
        });

        newGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < btn.length; i++) {
                    btn[i].setText("");
                }
                whoTurn_textView.setText("X turn");
                whoTurn_textView.setTextColor(Color.BLACK);
                counter = 0;
                //
                for (int i = 0; i < isClicked.length; i++) {
                    isClicked[i] = false;
                    btn[i].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.gray));
                }
            }
        });
    }

    private void whoWins() {
        //horizontal
        if (btn[0].getText() == btn[1].getText() && btn[1].getText() == btn[2].getText()
                && !btn[0].getText().equals("") && !btn[1].getText().equals("") && !btn[2].getText().equals("")) {
            if (btn[0].getText().equals("X"))
                whoTurn_textView.setText("X won!");
            else
                whoTurn_textView.setText("O won!");
            btn[0].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            btn[1].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            btn[2].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            whoTurn_textView.setTextColor(getResources().getColor(R.color.green));
            stopGame();
        } else if (btn[3].getText() == btn[4].getText() && btn[4].getText() == btn[5].getText()
                && !btn[3].getText().equals("") && !btn[4].getText().equals("") && !btn[5].getText().equals("")) {
            if (btn[3].getText().equals("X"))
                whoTurn_textView.setText("X won!");
            else
                whoTurn_textView.setText("O won!");
            btn[3].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            btn[4].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            btn[5].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            whoTurn_textView.setTextColor(getResources().getColor(R.color.green));
            stopGame();
        } else if (btn[6].getText() == btn[7].getText() && btn[7].getText() == btn[8].getText()
                && !btn[6].getText().equals("") && !btn[7].getText().equals("") && !btn[8].getText().equals("")) {
            if (btn[6].getText().equals("X"))
                whoTurn_textView.setText("X won!");
            else
                whoTurn_textView.setText("O won!");
            btn[6].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            btn[7].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            btn[8].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            whoTurn_textView.setTextColor(getResources().getColor(R.color.green));
            stopGame();
        }
        //vertical
        else if (btn[0].getText() == btn[3].getText() && btn[3].getText() == btn[6].getText()
                && !btn[0].getText().equals("") && !btn[3].getText().equals("") && !btn[6].getText().equals("")) {
            if (btn[0].getText().equals("X"))
                whoTurn_textView.setText("X won!");
            else
                whoTurn_textView.setText("O won!");
            btn[0].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            btn[3].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            btn[6].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            whoTurn_textView.setTextColor(getResources().getColor(R.color.green));
            stopGame();
        } else if (btn[1].getText() == btn[4].getText() && btn[4].getText() == btn[7].getText()
                && !btn[1].getText().equals("") && !btn[4].getText().equals("") && !btn[7].getText().equals("")) {
            if (btn[1].getText().equals("X"))
                whoTurn_textView.setText("X won!");
            else
                whoTurn_textView.setText("O won!");
            btn[1].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            btn[4].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            btn[7].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            whoTurn_textView.setTextColor(getResources().getColor(R.color.green));
            stopGame();
        } else if (btn[2].getText() == btn[5].getText() && btn[5].getText() == btn[8].getText()
                && !btn[2].getText().equals("") && !btn[5].getText().equals("") && !btn[8].getText().equals("")) {
            if (btn[2].getText().equals("X"))
                whoTurn_textView.setText("X won!");
            else
                whoTurn_textView.setText("O won!");
            btn[2].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            btn[5].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            btn[8].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            whoTurn_textView.setTextColor(getResources().getColor(R.color.green));
            stopGame();
        }
        //diagonal
        else if (btn[0].getText() == btn[4].getText() && btn[4].getText() == btn[8].getText()
                && !btn[0].getText().equals("") && !btn[4].getText().equals("") && !btn[8].getText().equals("")) {
            if (btn[0].getText().equals("X"))
                whoTurn_textView.setText("X won!");
            else
                whoTurn_textView.setText("O won!");
            btn[0].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            btn[4].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            btn[8].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            whoTurn_textView.setTextColor(getResources().getColor(R.color.green));
            stopGame();
        } else if (btn[2].getText() == btn[4].getText() && btn[4].getText() == btn[6].getText()
                && !btn[2].getText().equals("") && !btn[4].getText().equals("") && !btn[6].getText().equals("")) {
            if (btn[2].getText().equals("X"))
                whoTurn_textView.setText("X won!");
            else
                whoTurn_textView.setText("O won!");
            btn[2].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            btn[4].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            btn[6].setBackgroundTintList(getApplicationContext().getResources().getColorStateList(R.color.green));
            whoTurn_textView.setTextColor(getResources().getColor(R.color.green));
            stopGame();
        } else if (counter == 9) {
            whoTurn_textView.setText("Draw!");
            whoTurn_textView.setTextColor(getResources().getColor(R.color.green));
        }
    }

    private void stopGame() {
        for (int i = 0; i < isClicked.length; i++)
            isClicked[i] = true;
    }
}
