package com.example.tennistracker;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Partie p = new Partie();


    public void displayMsg(String str){
        Toast.makeText(this, "Bouton cliqué : " + str, Toast.LENGTH_SHORT).show();
    }

    public boolean veriffinset(int i){
        if(p.getSet().isFin()){
            if(i==1){
                p.j1++;
            }
            else if (i==2){
                p.j2++;
            }
            p.setNb(p.getNb()+1);
            p.newSet();
            if (p.j1 < 2 && p.j2 < 2) {
                return true;
            }
            else {
                return false;
            }
        }
        else{
            return false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView j1score = findViewById(R.id.score1);
        final TextView j2score = findViewById(R.id.score2);
        final TextView j1s1 = findViewById(R.id.j1s1);
        final TextView j1s2 = findViewById(R.id.j1s2);
        final TextView j1s3 = findViewById(R.id.j1s3);
        final TextView j2s1 = findViewById(R.id.j2s1);
        final TextView j2s2 = findViewById(R.id.j2s2);
        final TextView j2s3 = findViewById(R.id.j2s3);
        final CheckBox j1serve = findViewById(R.id.serve1);
        final CheckBox j2serve = (CheckBox) findViewById(R.id.serve2);
        //final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.adversaire, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //spinner.setAdapter(adapter);
        final Button bt1 = findViewById(R.id.bj1);
        final Button bt2 = findViewById(R.id.bj2);
        j1serve.setClickable(false);
        j2serve.setClickable(false);

        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                if (p.j1 < 2 && p.j2 < 2){
                    p.j1();
                    j1score.setText(p.getJ1());
                    j2score.setText(p.getJ2());
                    if(p.getNb()==0){
                        j1s1.setText(p.getj1());
                        if (veriffinset(1)){
                            j1s2.setText(p.getj1());
                            j2s2.setText(p.getj2());
                        };

                    }
                    else if (p.getNb()==1){
                        j1s2.setText(p.getj1());
                        j2s2.setText(p.getj2());
                        if (veriffinset(1)){
                            j1s3.setText(p.getj1());
                            j2s3.setText(p.getj2());
                        };
                    }
                    else if (p.getNb()==2){
                        j1s3.setText(p.getj1());
                        j2s3.setText(p.getj2());
                        veriffinset(1);
                    }
                    if (p.getSet().isServeur()){
                        j1serve.setChecked(true);
                        j2serve.setChecked(false);
                        j1serve.setVisibility(View.VISIBLE);
                        j2serve.setVisibility(View.INVISIBLE);
                    }
                    else{
                        j1serve.setChecked(false);
                        j2serve.setChecked(true);
                        j1serve.setVisibility(View.INVISIBLE);
                        j2serve.setVisibility(View.VISIBLE);
                    }
                }
                else{
                    bt1.setVisibility(View.INVISIBLE);
                    bt2.setVisibility(View.INVISIBLE);
                }
            }
        });


        bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                if (p.j1 < 2 && p.j2 < 2) {
                    p.j2();
                    j1score.setText(p.getJ1());
                    j2score.setText(p.getJ2());
                    if (p.getNb() == 0) {
                        j2s1.setText(p.getj2());
                        if (veriffinset(2)){
                            j1s2.setText(p.getj1());
                            j2s2.setText(p.getj2());
                        };
                    } else if (p.getNb() == 1) {
                        j1s2.setText(p.getj1());
                        j2s2.setText(p.getj2());
                        veriffinset(2);
                    } else if (p.getNb() == 2) {
                        j1s3.setText(p.getj1());
                        j2s3.setText(p.getj2());
                        veriffinset(2);
                    }
                    if (p.getSet().isServeur()) {
                        j1serve.setChecked(true);
                        j2serve.setChecked(false);
                        j1serve.setVisibility(View.VISIBLE);
                        j2serve.setVisibility(View.INVISIBLE);
                    } else {
                        j1serve.setChecked(false);
                        j2serve.setChecked(true);
                        j1serve.setVisibility(View.INVISIBLE);
                        j2serve.setVisibility(View.VISIBLE);
                    }
                }
                else{
                    bt1.setVisibility(View.INVISIBLE);
                    bt2.setVisibility(View.INVISIBLE);
                }
            }
        });
    }


}
