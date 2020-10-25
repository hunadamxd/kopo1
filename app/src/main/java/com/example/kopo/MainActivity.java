package com.example.kopo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{


    Button b_rock, b_paper, b_scissors;
    ImageView iv_cpu, iv_me, iv_e1, iv_e2, iv_e3, iv_ee1,iv_ee2, iv_ee3;
    TextView nctv_cpu_cho, nctv_tevalasztasod, nctv_gepeletereje,tvnc_eletero,nctv_dontetlen, tv_dc ,tv_t1, tv_t2;

    String myChoise, cpuChoise, result = "Nyertél";

    Random r;



    int dc;
    int jl;
    int gl;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_cpu =(ImageView) findViewById(R.id.iv_cpu);
        iv_me = (ImageView) findViewById(R.id.iv_me);
        iv_e1= (ImageView) findViewById(R.id.iv_e1);
        iv_e2= (ImageView) findViewById(R.id.iv_e2);
        iv_e3= (ImageView) findViewById(R.id.iv_e3);
        iv_ee1= (ImageView) findViewById(R.id.iv_ee1);
        iv_ee2= (ImageView) findViewById(R.id.iv_ee2);
        iv_ee3= (ImageView) findViewById(R.id.iv_ee3);

        b_rock= (Button) findViewById(R.id.b_rock);
        b_paper= (Button) findViewById(R.id.b_paper);
        b_scissors= (Button) findViewById(R.id.b_scissors);

        tv_dc= (TextView) findViewById(R.id.tv_dc);
        tv_t1= (TextView) findViewById(R.id.tv_t1);
        tv_t2= (TextView) findViewById(R.id.tv_t2);

        //teszt

        //tv_t1.setText(Integer.toString(gl));
        //tv_t2.setText(Integer.toString(jl));



        r= new Random();

        b_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myChoise= "rock";
                iv_me.setImageResource(R.drawable.rock);
                calculate();
            }
        });

        b_scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myChoise= "scissors";
                iv_me.setImageResource(R.drawable.scissors);
                calculate();
            }
        });

        b_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myChoise="paper";
                iv_me.setImageResource(R.drawable.paper);
                calculate();

            }
        });

        //

    }
    public void calculate() {


        int cpu = r.nextInt(3);
        if (cpu == 0) {
            cpuChoise = "rock";
            iv_cpu.setImageResource(R.drawable.rock);
        } else if (cpu == 1) {
            cpuChoise = "paper";
            iv_cpu.setImageResource(R.drawable.paper);
        } else if (cpu == 2) {
            cpuChoise = "scissors";
            iv_cpu.setImageResource(R.drawable.scissors);
        }

        if (myChoise.equals("rock") && cpuChoise.equals("paper")) {
            result = "Vesztettél";

        } else if (myChoise.equals("rock") && cpuChoise.equals("scissors")) {
            result = "Nyertél";

        } else if (myChoise.equals("paper") && cpuChoise.equals("rock")) {
            result = "Nyertél";

        } else if (myChoise.equals("paper") && cpuChoise.equals("scissors")) {
            result = "Vesztettél";

        } else if (myChoise.equals("scissors") && cpuChoise.equals("paper")) {
            result = "Nyertél";

        } else if (myChoise.equals("scissors") && cpuChoise.equals("rock")) {
            result = "Vesztettél";

        } else if (myChoise.equals(cpuChoise)) {
            result = "Döntetlen";
        }

       // tv_dc.setText(Integer.toString(dc));
        Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();



        if (result=="Dömtetlen"){
            dc++;
        }



    }


}