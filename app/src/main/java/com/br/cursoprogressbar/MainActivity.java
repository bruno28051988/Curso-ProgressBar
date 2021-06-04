package com.br.cursoprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBarHorizontal, progressBarCircular;
    private int progresso = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBarHorizontal = findViewById(R.id.progressBar_Horizontal);
        progressBarCircular = findViewById(R.id.progressBar_Circular);

       progressBarCircular.setVisibility(GONE);

    }

    public void carregarProgressBar(View view){

        //ProgressBar horizontal
        this.progresso = this.progresso + 1;
        progressBarHorizontal.setProgress(this.progresso);

        //ProgressBar Circular
        progressBarCircular.setVisibility(VISIBLE);

        if (this.progresso == 10){
            progressBarCircular.setVisibility(GONE);
        }


    }
}