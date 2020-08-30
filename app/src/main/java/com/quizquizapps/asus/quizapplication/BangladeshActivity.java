package com.quizquizapps.asus.quizapplication;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BangladeshActivity extends AppCompatActivity {

    private BanQuestion banQuestion=new BanQuestion();
    private TextView BscoreView,BQuestView,BnextQst;
    private Button btnchc1,btnchc2,btnchc3,btnchc4;

    private String Banswer;
    private int Bscore=0;
    private int BquestNum=0;
    private int Bqstup=1;

    Dialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangladesh);
        mDialog=new Dialog(this);

        BscoreView=(TextView) findViewById(R.id.bscoreid);
        BQuestView=(TextView) findViewById(R.id.bquesid);
        BnextQst=(TextView) findViewById(R.id.banqstid);
        btnchc1=(Button) findViewById(R.id.bans1id);
        btnchc2=(Button) findViewById(R.id.bans2id);
        btnchc3=(Button) findViewById(R.id.bans3id);
        btnchc4=(Button) findViewById(R.id.bans4id);

        updateQuestion();

        btnchc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BquestNum < 5)
                {
                    Bqstup=Bqstup+1;
                    updateQuestion(Bqstup);
                    if(btnchc1.getText()==Banswer)
                    {
                        Bscore=Bscore+1;
                        updateScore(Bscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(BangladeshActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                    else
                    {
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.wrong_toast, (ViewGroup) findViewById(R.id.wrongid));
                        Toast toast=new Toast(BangladeshActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                }
                else
                {
                    if(btnchc1.getText()==Banswer)
                    {
                        Bscore=Bscore+1;
                        updateScore(Bscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(BangladeshActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;
                        TextView tscr;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Bscore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(BangladeshActivity.this,BangladeshActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(BangladeshActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        mDialog.show();
                    }
                    else
                    {
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.wrong_toast, (ViewGroup) findViewById(R.id.wrongid));
                        Toast toast=new Toast(BangladeshActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;
                        TextView tscr;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Bscore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(BangladeshActivity.this,BangladeshActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(BangladeshActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        mDialog.show();
                    }
                }
            }
        });
        btnchc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BquestNum < 5)
                {
                    Bqstup=Bqstup+1;
                    updateQuestion(Bqstup);
                    if(btnchc2.getText()==Banswer)
                    {
                        Bscore=Bscore+1;
                        updateScore(Bscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(BangladeshActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                    else
                    {
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.wrong_toast, (ViewGroup) findViewById(R.id.wrongid));
                        Toast toast=new Toast(BangladeshActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                }
                else
                {
                    if(btnchc2.getText()==Banswer)
                    {
                        Bscore=Bscore+1;
                        updateScore(Bscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(BangladeshActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Bscore);

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(BangladeshActivity.this,BangladeshActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(BangladeshActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        mDialog.show();
                    }
                    else
                    {
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.wrong_toast, (ViewGroup) findViewById(R.id.wrongid));
                        Toast toast=new Toast(BangladeshActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Bscore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(BangladeshActivity.this,BangladeshActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(BangladeshActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        mDialog.show();
                    }
                }
            }
        });
        btnchc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BquestNum < 5)
                {
                    Bqstup=Bqstup+1;
                    updateQuestion(Bqstup);
                    if(btnchc3.getText()==Banswer)
                    {
                        Bscore=Bscore+1;
                        updateScore(Bscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(BangladeshActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                    else
                    {
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.wrong_toast, (ViewGroup) findViewById(R.id.wrongid));
                        Toast toast=new Toast(BangladeshActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                }
                else
                {
                    if(btnchc3.getText()==Banswer)
                    {
                        Bscore=Bscore+1;
                        updateScore(Bscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(BangladeshActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Bscore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(BangladeshActivity.this,BangladeshActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(BangladeshActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        mDialog.show();
                    }
                    else
                    {
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.wrong_toast, (ViewGroup) findViewById(R.id.wrongid));
                        Toast toast=new Toast(BangladeshActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Bscore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(BangladeshActivity.this,BangladeshActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(BangladeshActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        mDialog.show();
                    }
                }
            }
        });
        btnchc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BquestNum < 5)
                {
                    Bqstup=Bqstup+1;
                    updateQuestion(Bqstup);
                    if(btnchc4.getText()==Banswer)
                    {
                        Bscore=Bscore+1;
                        updateScore(Bscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(BangladeshActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                    else
                    {
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.wrong_toast, (ViewGroup) findViewById(R.id.wrongid));
                        Toast toast=new Toast(BangladeshActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                }
                else
                {
                    if(btnchc4.getText()==Banswer)
                    {
                        Bscore=Bscore+1;
                        updateScore(Bscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(BangladeshActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Bscore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(BangladeshActivity.this,BangladeshActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(BangladeshActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        mDialog.show();
                    }
                    else
                    {
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.wrong_toast, (ViewGroup) findViewById(R.id.wrongid));
                        Toast toast=new Toast(BangladeshActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Bscore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(BangladeshActivity.this,BangladeshActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(BangladeshActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        mDialog.show();
                    }
                }
            }
        });

    }
    private void updateQuestion(){
        BQuestView.setText(banQuestion.getQuestion(BquestNum));
        btnchc1.setText(banQuestion.getChoice1(BquestNum));
        btnchc2.setText(banQuestion.getChoice2(BquestNum));
        btnchc3.setText(banQuestion.getChoice3(BquestNum));
        btnchc4.setText(banQuestion.getChoice4(BquestNum));

        Banswer=banQuestion.getCorrectAns(BquestNum);
        BquestNum++;
    }
    private void updateScore(int point){
        BscoreView.setText("" + Bscore);
    }
    private void updateQuestion(int point){
        BnextQst.setText("" + Bqstup);
    }
}
