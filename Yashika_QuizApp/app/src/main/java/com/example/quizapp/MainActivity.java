package com.example.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score=0;
    int selectedId;
    String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rst=findViewById(R.id.ResetButton);;
        rst.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                RadioGroup rg= findViewById(R.id.radio_grp1);
                rg.clearCheck();
                RadioGroup rg2=findViewById(R.id.radio_grp2);
                rg2.clearCheck();
                EditText et1= findViewById(R.id.q3_ans);
                et1.getText().clear();
                EditText et2= findViewById(R.id.q4_ans);
                et2.getText().clear();

                CheckBox ch1=findViewById(R.id.ans5_a);
                ch1.setChecked(false);
                CheckBox ch2=findViewById(R.id.ans5_b);
                ch2.setChecked(false);
                CheckBox ch3=findViewById(R.id.ans5_c);
                ch3.setChecked(false);

                CheckBox ch11=findViewById(R.id.ans6_a);
                ch11.setChecked(false);
                CheckBox ch12=findViewById(R.id.ans6_b);
                ch12.setChecked(false);
                CheckBox ch13=findViewById(R.id.ans6_c);
                ch13.setChecked(false);

                EditText et3= findViewById(R.id.q7_ans);
                et3.getText().clear();
                EditText et4= findViewById(R.id.q8_ans);
                et4.getText().clear();

                RadioGroup rg9=findViewById(R.id.rg_9);
                rg9.clearCheck();
                RadioGroup rg10=findViewById(R.id.rg_10);
                rg10.clearCheck();
            }
        });

        //toast on submit button click
        Button sbt=findViewById(R.id.Submit_btn);
        sbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=0;
                //get answer to ques 1
                RadioGroup rg= findViewById(R.id.radio_grp1);
                selectedId=rg.getCheckedRadioButtonId();
                if(selectedId==R.id.opt3)
                    score+=1;

                //get answer to ques 2
                RadioGroup rg2=findViewById(R.id.radio_grp2);
                selectedId=rg2.getCheckedRadioButtonId();
                if(selectedId==R.id.opt3_1)
                    score+=1;

                //get answer to ques 3
                EditText et1= findViewById(R.id.q3_ans);
                String q3ans=et1.getText().toString();
                if(q3ans.equals(getString(R.string.ans3)))
                    score+=1;

                //get answer to ques 4
                EditText et2= findViewById(R.id.q4_ans);
                String q4ans=et1.getText().toString();
                if(q4ans.equals(getString(R.string.ans4)))
                    score+=1;

                //get answer to ques 5
                CheckBox ch1=findViewById(R.id.ans5_a);
                Boolean q5a=ch1.isChecked();

                CheckBox ch2=findViewById(R.id.ans5_b);
                Boolean q5b=ch2.isChecked();

                CheckBox ch3=findViewById(R.id.ans5_c);
                Boolean q5c=ch3.isChecked();

                if(q5c)
                    score+=1;

                //get ans to ques 6
                CheckBox ch11=findViewById(R.id.ans6_a);
                Boolean q6a=ch11.isChecked();

                CheckBox ch12=findViewById(R.id.ans6_b);
                Boolean q6b=ch12.isChecked();

                CheckBox ch13=findViewById(R.id.ans6_c);
                Boolean q6c=ch13.isChecked();

                if(q6c)
                    score+=1;

                //get ans to ques 7
                EditText et3= findViewById(R.id.q7_ans);
                String q7ans=et3.getText().toString();
                if(q7ans.equals(getString(R.string.ans7)))
                    score+=1;

                //get ans to ques 8
                EditText et4= findViewById(R.id.q8_ans);
                String q8ans=et4.getText().toString();
                if(q8ans.equals(getString(R.string.ans8)))
                    score+=1;

                //get ans to ques 9
                RadioGroup rg9=findViewById(R.id.rg_9);
                selectedId=rg9.getCheckedRadioButtonId();
                if(selectedId==R.id.rb9b)
                    score+=1;
                //get ans to ques 10
                RadioGroup rg10=findViewById(R.id.rg_10);
                selectedId=rg10.getCheckedRadioButtonId();
                if(selectedId==R.id.rb10b)
                    score+=1;

                if(score==10)
                    Toast.makeText(MainActivity.this, "Highest Score:" + score, Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Score:" + score, Toast.LENGTH_SHORT).show();
            }
        });
    }
}


