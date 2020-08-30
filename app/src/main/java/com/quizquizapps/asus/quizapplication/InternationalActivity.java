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

import java.util.Random;

public class InternationalActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;
    TextView score,question;
    Dialog mDialog;

    private IntQuestion intQuestion =new IntQuestion();
    private String Crtans;
    private int Crtscore=0;
    private int queslength= intQuestion.banQues.length;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_international);
        random=new Random();
        mDialog=new Dialog(this);

        btn1=(Button) findViewById(R.id.banbtn1id);
        btn2=(Button) findViewById(R.id.banbtn2id);
        btn3=(Button) findViewById(R.id.banbtn3id);
        btn4=(Button) findViewById(R.id.banbtn4id);

        question=(TextView) findViewById(R.id.banquestionid);
        score=(TextView) findViewById(R.id.banscrid);

        score.setText("Score: "+Crtscore);
        updateQues(random.nextInt(queslength));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn1.getText()==Crtans)
                {
                    Crtscore=Crtscore+1;
                    score.setText("Score: "+Crtscore);
                    updateQues(random.nextInt(queslength));
                    LayoutInflater inflater=getLayoutInflater();
                    View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                    Toast toast=new Toast(InternationalActivity.this);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.setView(customView);
                    toast.show();
                }
                else
                {
                    Button popbtn;
                    mDialog.setContentView(R.layout.gameover);
                    popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);
                    TextView tscr;
                    tscr=(TextView) mDialog.findViewById(R.id.totalscrid);
                    tscr.setText(""+Crtscore);
                    popbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent=new Intent(InternationalActivity.this,InternationalActivity.class);
                            startActivity(intent);
                        }
                    });
                    Button popbbtn;
                    popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                    popbbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent=new Intent(InternationalActivity.this,MainActivity.class);
                            startActivity(intent);
                        }
                    });
                    mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    mDialog.show();
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn2.getText()==Crtans)
                {
                    Crtscore=Crtscore+1;
                    score.setText("Score: "+Crtscore);
                    updateQues(random.nextInt(queslength));
                    LayoutInflater inflater=getLayoutInflater();
                    View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                    Toast toast=new Toast(InternationalActivity.this);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.setView(customView);
                    toast.show();
                }
                else
                {
                    Button popbtn;
                    mDialog.setContentView(R.layout.gameover);
                    popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);
                    TextView tscr;
                    tscr=(TextView) mDialog.findViewById(R.id.totalscrid);
                    tscr.setText(""+Crtscore);
                    popbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent=new Intent(InternationalActivity.this,InternationalActivity.class);
                            startActivity(intent);
                        }
                    });
                    Button popbbtn;
                    popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                    popbbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent=new Intent(InternationalActivity.this,MainActivity.class);
                            startActivity(intent);
                        }
                    });
                    mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    mDialog.show();
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn3.getText()==Crtans)
                {
                    Crtscore=Crtscore+1;
                    score.setText("Score: "+Crtscore);
                    updateQues(random.nextInt(queslength));
                    LayoutInflater inflater=getLayoutInflater();
                    View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                    Toast toast=new Toast(InternationalActivity.this);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.setView(customView);
                    toast.show();
                }
                else
                {
                    Button popbtn;
                    mDialog.setContentView(R.layout.gameover);
                    popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);
                    TextView tscr;
                    tscr=(TextView) mDialog.findViewById(R.id.totalscrid);
                    tscr.setText(""+Crtscore);
                    popbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent=new Intent(InternationalActivity.this,InternationalActivity.class);
                            startActivity(intent);
                        }
                    });
                    Button popbbtn;
                    popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                    popbbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent=new Intent(InternationalActivity.this,MainActivity.class);
                            startActivity(intent);
                        }
                    });
                    mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    mDialog.show();
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn4.getText()==Crtans)
                {
                    Crtscore=Crtscore+1;
                    score.setText("Score: "+Crtscore);
                    updateQues(random.nextInt(queslength));
                    LayoutInflater inflater=getLayoutInflater();
                    View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                    Toast toast=new Toast(InternationalActivity.this);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.setView(customView);
                    toast.show();
                }
                else
                {
                    Button popbtn;
                    mDialog.setContentView(R.layout.gameover);
                    popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);
                    TextView tscr;
                    tscr=(TextView) mDialog.findViewById(R.id.totalscrid);
                    tscr.setText(""+Crtscore);
                    popbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent=new Intent(InternationalActivity.this,InternationalActivity.class);
                            startActivity(intent);
                        }
                    });
                    Button popbbtn;
                    popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                    popbbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent=new Intent(InternationalActivity.this,MainActivity.class);
                            startActivity(intent);
                        }
                    });
                    mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    mDialog.show();
                }
            }
        });
    }

    private void updateQues(int x) {
        question.setText(intQuestion.getQues(x));
        btn1.setText(intQuestion.getOpt1(x));
        btn2.setText(intQuestion.getOpt2(x));
        btn3.setText(intQuestion.getOpt3(x));
        btn4.setText(intQuestion.getOpt4(x));
        Crtans= intQuestion.getAns(x);
    }
}
