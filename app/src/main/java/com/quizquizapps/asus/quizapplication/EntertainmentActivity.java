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

public class EntertainmentActivity extends AppCompatActivity {

    private EntQuestion entQuestion=new EntQuestion();
    private TextView EscoreView,EQuestView,EnextQst;
    private Button etnchc1,etnchc2,etnchc3,etnchc4;

    private String Eanswer;
    private int Escore=0;
    private int EquestNum=0;
    private int Eqstup=1;

    Dialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);
        mDialog=new Dialog(this);

        EscoreView=(TextView) findViewById(R.id.escoreid);
        EQuestView=(TextView) findViewById(R.id.equesid);
        EnextQst=(TextView) findViewById(R.id.eanqstid);
        etnchc1=(Button) findViewById(R.id.eans1id);
        etnchc2=(Button) findViewById(R.id.eans2id);
        etnchc3=(Button) findViewById(R.id.eans3id);
        etnchc4=(Button) findViewById(R.id.eans4id);

        updateQuestion();

        etnchc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EquestNum < 5)
                {
                    Eqstup=Eqstup+1;
                    updateQuestion(Eqstup);
                    if(etnchc1.getText()==Eanswer)
                    {
                        Escore=Escore+1;
                        updateScore(Escore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(EntertainmentActivity.this);
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
                        Toast toast=new Toast(EntertainmentActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                }
                else
                {
                    if(etnchc1.getText()==Eanswer)
                    {
                        Escore=Escore+1;
                        updateScore(Escore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(EntertainmentActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;
                        TextView tscr;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Escore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(EntertainmentActivity.this,EntertainmentActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(EntertainmentActivity.this,MainActivity.class);
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
                        Toast toast=new Toast(EntertainmentActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;
                        TextView tscr;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Escore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(EntertainmentActivity.this,EntertainmentActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(EntertainmentActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        mDialog.show();
                    }
                }
            }
        });
        etnchc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EquestNum < 5)
                {
                    Eqstup=Eqstup+1;
                    updateQuestion(Eqstup);
                    if(etnchc2.getText()==Eanswer)
                    {
                        Escore=Escore+1;
                        updateScore(Escore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(EntertainmentActivity.this);
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
                        Toast toast=new Toast(EntertainmentActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                }
                else
                {
                    if(etnchc2.getText()==Eanswer)
                    {
                        Escore=Escore+1;
                        updateScore(Escore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(EntertainmentActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Escore);

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(EntertainmentActivity.this,EntertainmentActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(EntertainmentActivity.this,MainActivity.class);
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
                        Toast toast=new Toast(EntertainmentActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Escore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(EntertainmentActivity.this,EntertainmentActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(EntertainmentActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        mDialog.show();
                    }
                }
            }
        });
        etnchc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EquestNum < 5)
                {
                    Eqstup=Eqstup+1;
                    updateQuestion(Eqstup);
                    if(etnchc3.getText()==Eanswer)
                    {
                        Escore=Escore+1;
                        updateScore(Escore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(EntertainmentActivity.this);
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
                        Toast toast=new Toast(EntertainmentActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                }
                else
                {
                    if(etnchc3.getText()==Eanswer)
                    {
                        Escore=Escore+1;
                        updateScore(Escore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(EntertainmentActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Escore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(EntertainmentActivity.this,EntertainmentActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(EntertainmentActivity.this,MainActivity.class);
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
                        Toast toast=new Toast(EntertainmentActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Escore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(EntertainmentActivity.this,EntertainmentActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(EntertainmentActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        mDialog.show();
                    }
                }
            }
        });
        etnchc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EquestNum < 5)
                {
                    Eqstup=Eqstup+1;
                    updateQuestion(Eqstup);
                    if(etnchc4.getText()==Eanswer)
                    {
                        Escore=Escore+1;
                        updateScore(Escore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(EntertainmentActivity.this);
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
                        Toast toast=new Toast(EntertainmentActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                }
                else
                {
                    if(etnchc4.getText()==Eanswer)
                    {
                        Escore=Escore+1;
                        updateScore(Escore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(EntertainmentActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Escore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(EntertainmentActivity.this,EntertainmentActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(EntertainmentActivity.this,MainActivity.class);
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
                        Toast toast=new Toast(EntertainmentActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Escore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(EntertainmentActivity.this,EntertainmentActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(EntertainmentActivity.this,MainActivity.class);
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
        EQuestView.setText(entQuestion.getQuestion(EquestNum));
        etnchc1.setText(entQuestion.getChoice1(EquestNum));
        etnchc2.setText(entQuestion.getChoice2(EquestNum));
        etnchc3.setText(entQuestion.getChoice3(EquestNum));
        etnchc4.setText(entQuestion.getChoice4(EquestNum));

        Eanswer=entQuestion.getCorrectAns(EquestNum);
        EquestNum++;
    }
    private void updateScore(int point){
        EscoreView.setText("" + Escore);
    }
    private void updateQuestion(int point){
        EnextQst.setText("" + Eqstup);
    }
}
