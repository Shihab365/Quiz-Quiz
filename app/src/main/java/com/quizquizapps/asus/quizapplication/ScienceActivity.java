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

public class ScienceActivity extends AppCompatActivity {

    private SciQuestion sciQuestion=new SciQuestion();
    private TextView SscoreView,SQuestView,SnextQst;
    private Button stnchc1,stnchc2,stnchc3,stnchc4;

    private String Sanswer;
    private int Sscore=0;
    private int SquestNum=0;
    private int Sqstup=1;

    Dialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);
        mDialog=new Dialog(this);

        SscoreView=(TextView) findViewById(R.id.sscoreid);
        SQuestView=(TextView) findViewById(R.id.squesid);
        SnextQst=(TextView) findViewById(R.id.sanqstid);
        stnchc1=(Button) findViewById(R.id.sans1id);
        stnchc2=(Button) findViewById(R.id.sans2id);
        stnchc3=(Button) findViewById(R.id.sans3id);
        stnchc4=(Button) findViewById(R.id.sans4id);

        updateQuestion();

        stnchc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (SquestNum < 5)
                {
                    Sqstup=Sqstup+1;
                    updateQuestion(Sqstup);
                    if(stnchc1.getText()==Sanswer)
                    {
                        Sscore=Sscore+1;
                        updateScore(Sscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(ScienceActivity.this);
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
                        Toast toast=new Toast(ScienceActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                }
                else
                {
                    if(stnchc1.getText()==Sanswer)
                    {
                        Sscore=Sscore+1;
                        updateScore(Sscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(ScienceActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;
                        TextView tscr;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Sscore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(ScienceActivity.this,ScienceActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(ScienceActivity.this,MainActivity.class);
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
                        Toast toast=new Toast(ScienceActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;
                        TextView tscr;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Sscore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(ScienceActivity.this,ScienceActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(ScienceActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        mDialog.show();
                    }
                }
            }
        });
        stnchc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (SquestNum < 5)
                {
                    Sqstup=Sqstup+1;
                    updateQuestion(Sqstup);
                    if(stnchc2.getText()==Sanswer)
                    {
                        Sscore=Sscore+1;
                        updateScore(Sscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(ScienceActivity.this);
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
                        Toast toast=new Toast(ScienceActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                }
                else
                {
                    if(stnchc2.getText()==Sanswer)
                    {
                        Sscore=Sscore+1;
                        updateScore(Sscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(ScienceActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Sscore);

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(ScienceActivity.this,ScienceActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(ScienceActivity.this,MainActivity.class);
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
                        Toast toast=new Toast(ScienceActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Sscore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(ScienceActivity.this,ScienceActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(ScienceActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        mDialog.show();
                    }
                }
            }
        });
        stnchc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (SquestNum < 5)
                {
                    Sqstup=Sqstup+1;
                    updateQuestion(Sqstup);
                    if(stnchc3.getText()==Sanswer)
                    {
                        Sscore=Sscore+1;
                        updateScore(Sscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(ScienceActivity.this);
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
                        Toast toast=new Toast(ScienceActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                }
                else
                {
                    if(stnchc3.getText()==Sanswer)
                    {
                        Sscore=Sscore+1;
                        updateScore(Sscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(ScienceActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Sscore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(ScienceActivity.this,ScienceActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(ScienceActivity.this,MainActivity.class);
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
                        Toast toast=new Toast(ScienceActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Sscore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(ScienceActivity.this,ScienceActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(ScienceActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        mDialog.show();
                    }
                }
            }
        });
        stnchc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (SquestNum < 5)
                {
                    Sqstup=Sqstup+1;
                    updateQuestion(Sqstup);
                    if(stnchc4.getText()==Sanswer)
                    {
                        Sscore=Sscore+1;
                        updateScore(Sscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(ScienceActivity.this);
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
                        Toast toast=new Toast(ScienceActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                }
                else
                {
                    if(stnchc4.getText()==Sanswer)
                    {
                        Sscore=Sscore+1;
                        updateScore(Sscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(ScienceActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Sscore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(ScienceActivity.this,ScienceActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(ScienceActivity.this,MainActivity.class);
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
                        Toast toast=new Toast(ScienceActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Sscore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(ScienceActivity.this,ScienceActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(ScienceActivity.this,MainActivity.class);
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
        SQuestView.setText(sciQuestion.getQuestion(SquestNum));
        stnchc1.setText(sciQuestion.getChoice1(SquestNum));
        stnchc2.setText(sciQuestion.getChoice2(SquestNum));
        stnchc3.setText(sciQuestion.getChoice3(SquestNum));
        stnchc4.setText(sciQuestion.getChoice4(SquestNum));

        Sanswer=sciQuestion.getCorrectAns(SquestNum);
        SquestNum++;
    }
    private void updateScore(int point){
        SscoreView.setText("" + Sscore);
    }
    private void updateQuestion(int point){
        SnextQst.setText("" + Sqstup);
    }
}
