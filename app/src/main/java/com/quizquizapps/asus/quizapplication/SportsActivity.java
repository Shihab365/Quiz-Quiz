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

public class SportsActivity extends AppCompatActivity {

    private SpoQuestion spoQuestion=new SpoQuestion();
    private TextView PscoreView,PQuestView,PnextQst;
    private Button ptnchc1,ptnchc2,ptnchc3,ptnchc4;

    private String Panswer;
    private int Pscore=0;
    private int PquestNum=0;
    private int Pqstup=1;

    Dialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        mDialog=new Dialog(this);

        PscoreView=(TextView) findViewById(R.id.pscoreid);
        PQuestView=(TextView) findViewById(R.id.pquesid);
        PnextQst=(TextView) findViewById(R.id.panqstid);
        ptnchc1=(Button) findViewById(R.id.pans1id);
        ptnchc2=(Button) findViewById(R.id.pans2id);
        ptnchc3=(Button) findViewById(R.id.pans3id);
        ptnchc4=(Button) findViewById(R.id.pans4id);

        updateQuestion();

        ptnchc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PquestNum < 5)
                {
                    Pqstup=Pqstup+1;
                    updateQuestion(Pqstup);
                    if(ptnchc1.getText()==Panswer)
                    {
                        Pscore=Pscore+1;
                        updateScore(Pscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(SportsActivity.this);
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
                        Toast toast=new Toast(SportsActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                }
                else
                {
                    if(ptnchc1.getText()==Panswer)
                    {
                        Pscore=Pscore+1;
                        updateScore(Pscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(SportsActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;
                        TextView tscr;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Pscore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(SportsActivity.this,SportsActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(SportsActivity.this,MainActivity.class);
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
                        Toast toast=new Toast(SportsActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;
                        TextView tscr;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Pscore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(SportsActivity.this,SportsActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(SportsActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        mDialog.show();
                    }
                }
            }
        });
        ptnchc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PquestNum < 5)
                {
                    Pqstup=Pqstup+1;
                    updateQuestion(Pqstup);
                    if(ptnchc2.getText()==Panswer)
                    {
                        Pscore=Pscore+1;
                        updateScore(Pscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(SportsActivity.this);
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
                        Toast toast=new Toast(SportsActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                }
                else
                {
                    if(ptnchc2.getText()==Panswer)
                    {
                        Pscore=Pscore+1;
                        updateScore(Pscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(SportsActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Pscore);

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(SportsActivity.this,SportsActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(SportsActivity.this,MainActivity.class);
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
                        Toast toast=new Toast(SportsActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Pscore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(SportsActivity.this,SportsActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(SportsActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        mDialog.show();
                    }
                }
            }
        });
        ptnchc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PquestNum < 5)
                {
                    Pqstup=Pqstup+1;
                    updateQuestion(Pqstup);
                    if(ptnchc3.getText()==Panswer)
                    {
                        Pscore=Pscore+1;
                        updateScore(Pscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(SportsActivity.this);
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
                        Toast toast=new Toast(SportsActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                }
                else
                {
                    if(ptnchc3.getText()==Panswer)
                    {
                        Pscore=Pscore+1;
                        updateScore(Pscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(SportsActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Pscore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(SportsActivity.this,SportsActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(SportsActivity.this,MainActivity.class);
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
                        Toast toast=new Toast(SportsActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Pscore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(SportsActivity.this,SportsActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(SportsActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        mDialog.show();
                    }
                }
            }
        });
        ptnchc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PquestNum < 5)
                {
                    Pqstup=Pqstup+1;
                    updateQuestion(Pqstup);
                    if(ptnchc4.getText()==Panswer)
                    {
                        Pscore=Pscore+1;
                        updateScore(Pscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(SportsActivity.this);
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
                        Toast toast=new Toast(SportsActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        updateQuestion();
                    }
                }
                else
                {
                    if(ptnchc4.getText()==Panswer)
                    {
                        Pscore=Pscore+1;
                        updateScore(Pscore);
                        LayoutInflater inflater=getLayoutInflater();
                        View customView=inflater.inflate(R.layout.correct_toast, (ViewGroup) findViewById(R.id.correctid));
                        Toast toast=new Toast(SportsActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Pscore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(SportsActivity.this,SportsActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(SportsActivity.this,MainActivity.class);
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
                        Toast toast=new Toast(SportsActivity.this);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setView(customView);
                        toast.show();
                        Button popbtn;

                        mDialog.setContentView(R.layout.gameover);
                        popbtn=(Button) mDialog.findViewById(R.id.popbuttonid);

                        TextView tscr;
                        tscr=(TextView) mDialog.findViewById(R.id.totalscrid);

                        tscr.setText(""+Pscore);

                        popbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(SportsActivity.this,SportsActivity.class);
                                startActivity(intent);
                            }
                        });
                        Button popbbtn;
                        popbbtn=(Button) mDialog.findViewById(R.id.popbbuttonid);
                        popbbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(SportsActivity.this,MainActivity.class);
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
        PQuestView.setText(spoQuestion.getQuestion(PquestNum));
        ptnchc1.setText(spoQuestion.getChoice1(PquestNum));
        ptnchc2.setText(spoQuestion.getChoice2(PquestNum));
        ptnchc3.setText(spoQuestion.getChoice3(PquestNum));
        ptnchc4.setText(spoQuestion.getChoice4(PquestNum));

        Panswer=spoQuestion.getCorrectAns(PquestNum);
        PquestNum++;
    }
    private void updateScore(int point){
        PscoreView.setText("" + Pscore);
    }
    private void updateQuestion(int point){
        PnextQst.setText("" + Pqstup);
    }
}
