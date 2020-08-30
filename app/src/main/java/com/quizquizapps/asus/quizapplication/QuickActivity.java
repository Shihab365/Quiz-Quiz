package com.quizquizapps.asus.quizapplication;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuickActivity extends AppCompatActivity {

    private QActivity qQuestion=new QActivity();
    private TextView QscoreView,QQuestView,Timetext;
    private Button qtnchc1,qtnchc2,qtnchc3,qtnchc4;

    public CountDownTimer countDownTimer;

    private String Qanswer;
    private int Qscore=0;
    private int QquestNum=0;
    private int Qqstup=1;

    Dialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick);
        mDialog=new Dialog(this);

        QscoreView=(TextView) findViewById(R.id.qscoreid);
        QQuestView=(TextView) findViewById(R.id.qquesid);
        Timetext=(TextView) findViewById(R.id.qtimeid);
        qtnchc1=(Button) findViewById(R.id.qans1id);
        qtnchc2=(Button) findViewById(R.id.qans2id);
        qtnchc3=(Button) findViewById(R.id.qans3id);
        qtnchc4=(Button) findViewById(R.id.qans4id);

        updateQuestion();

        qtnchc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (QquestNum < 22)
                {
                    Qqstup=Qqstup+1;
                    if(qtnchc1.getText()==Qanswer)
                    {
                        Qscore=Qscore+1;
                        updateScore(Qscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(QuickActivity.this);
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
                        Toast toast=new Toast(QuickActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                }
                else
                {
                    if(qtnchc1.getText()==Qanswer)
                    {
                        Qscore=Qscore+1;
                        updateScore(Qscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(QuickActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                    }
                    else
                    {
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.wrong_toast, (ViewGroup) findViewById(R.id.wrongid));
                        Toast toast=new Toast(QuickActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                    }
                }
            }
        });
        qtnchc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (QquestNum < 22)
                {
                    Qqstup=Qqstup+1;
                    if(qtnchc2.getText()==Qanswer)
                    {
                        Qscore=Qscore+1;
                        updateScore(Qscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(QuickActivity.this);
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
                        Toast toast=new Toast(QuickActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                }
                else
                {
                    if(qtnchc2.getText()==Qanswer)
                    {
                        Qscore=Qscore+1;
                        updateScore(Qscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(QuickActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                    }
                    else
                    {
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.wrong_toast, (ViewGroup) findViewById(R.id.wrongid));
                        Toast toast=new Toast(QuickActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                    }
                }
            }
        });
        qtnchc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (QquestNum < 22)
                {
                    Qqstup=Qqstup+1;
                    if(qtnchc3.getText()==Qanswer)
                    {
                        Qscore=Qscore+1;
                        updateScore(Qscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(QuickActivity.this);
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
                        Toast toast=new Toast(QuickActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                }
                else
                {
                    if(qtnchc3.getText()==Qanswer)
                    {
                        Qscore=Qscore+1;
                        updateScore(Qscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(QuickActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                    }
                    else
                    {
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.wrong_toast, (ViewGroup) findViewById(R.id.wrongid));
                        Toast toast=new Toast(QuickActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                    }
                }
            }
        });
        qtnchc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (QquestNum < 22)
                {
                    Qqstup=Qqstup+1;
                    if(qtnchc4.getText()==Qanswer)
                    {
                        Qscore=Qscore+1;
                        updateScore(Qscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(QuickActivity.this);
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
                        Toast toast=new Toast(QuickActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                }
                else
                {
                    if(qtnchc4.getText()==Qanswer)
                    {
                        Qscore=Qscore+1;
                        updateScore(Qscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(QuickActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                    }
                    else
                    {
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.wrong_toast, (ViewGroup) findViewById(R.id.wrongid));
                        Toast toast=new Toast(QuickActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                    }
                }
            }
        });

        countDownTimer=new CountDownTimer(81*1000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Timetext.setText(""+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                      Timetext.setText("0");
                      Button popbtn;
                      mDialog.setContentView(R.layout.timesup);
                      popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                      TextView tscr;
                      tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                      tscr.setText(""+Qscore);

                      popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(QuickActivity.this,QuickActivity.class);
                                startActivity(intent);
                            }
                      });
                      Button popbbtn;
                      popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                      popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(QuickActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                      });
                      mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                      mDialog.show();
            }
        };
        countDownTimer.start();
    }
    private void updateQuestion(){
        QQuestView.setText(qQuestion.getQuestion(QquestNum));
        qtnchc1.setText(qQuestion.getChoice1(QquestNum));
        qtnchc2.setText(qQuestion.getChoice2(QquestNum));
        qtnchc3.setText(qQuestion.getChoice3(QquestNum));
        qtnchc4.setText(qQuestion.getChoice4(QquestNum));

        Qanswer=qQuestion.getCorrectAns(QquestNum);
        QquestNum++;
    }
    private void updateScore(int point){
        QscoreView.setText("" + Qscore);
    }
}
