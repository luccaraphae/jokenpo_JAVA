package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class tela2 extends AppCompatActivity {

    private ImageView imgMaquina, imgJogador;
    private ImageButton btPedra, btPapel, btTesoura;
    private TextView txtResultado;
    //declarando vetor
    //private String[] jokenpo={"pedra","papel","tesoura"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        //referenciando os objetos
        imgMaquina=(ImageView)findViewById(R.id.imgPC);
        imgJogador=(ImageView)findViewById(R.id.imgJogador);
        btPedra=(ImageButton)findViewById(R.id.btn1);
        btPapel=(ImageButton)findViewById(R.id.btn2);
        btTesoura=(ImageButton)findViewById(R.id.btn3);
        txtResultado=(TextView) findViewById(R.id.txtStatus);

        btPedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //chamando a classe Random para sorteio aleatorio
                 Random randomico= new Random();

                //bound 3 = 0-pedra, 1-papel,2-tesoura
                 int numsorteado=randomico.nextInt(3);

                 //Fazendo a seleção para setar a imagem de acordo com a imagem
                 switch(numsorteado){

                     //pedra
                     case 0:{
                         imgMaquina.setImageDrawable(ContextCompat.getDrawable(tela2.this,R.drawable.pedra));
                         imgJogador.setImageDrawable(ContextCompat.getDrawable(tela2.this,R.drawable.pedra));
                         txtResultado.setText("EMPATE!");
                         break;
                     }

                     //papel
                     case 1:{
                         imgMaquina.setImageDrawable(ContextCompat.getDrawable(tela2.this,R.drawable.papel));
                         imgJogador.setImageDrawable(ContextCompat.getDrawable(tela2.this,R.drawable.dpedra));
                         txtResultado.setText("VOCÊ PERDEU!");
                         break;
                     }

                     case 2:{
                         imgMaquina.setImageDrawable(ContextCompat.getDrawable(tela2.this,R.drawable.dtesoura));
                         imgJogador.setImageDrawable(ContextCompat.getDrawable(tela2.this,R.drawable.pedra));
                         txtResultado.setText("VOCÊ GANHOU!");
                         break;
                     }

                 }
            }
        });



        btPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //chamando a classe Random para sorteio aleatorio
                Random randomico= new Random();

                //bound 3 = 0-pedra, 1-papel,2-tesoura
                int numsorteado=randomico.nextInt(3);

                //Fazendo a seleção para setar a imagem de acordo com a imagem
                switch(numsorteado){

                    //pedra
                    case 0:{
                        imgMaquina.setImageDrawable(ContextCompat.getDrawable(tela2.this,R.drawable.dpedra));
                        imgJogador.setImageDrawable(ContextCompat.getDrawable(tela2.this,R.drawable.papel));
                        txtResultado.setText("VOCÊ GANHOU!");
                        break;
                    }

                    //papel
                    case 1:{
                        imgMaquina.setImageDrawable(ContextCompat.getDrawable(tela2.this,R.drawable.papel));
                        imgJogador.setImageDrawable(ContextCompat.getDrawable(tela2.this,R.drawable.papel));
                        txtResultado.setText("EMPATE!");
                        break;
                    }

                    case 2:{
                        imgMaquina.setImageDrawable(ContextCompat.getDrawable(tela2.this,R.drawable.tesoura));
                        imgJogador.setImageDrawable(ContextCompat.getDrawable(tela2.this,R.drawable.dpapel));
                        txtResultado.setText("VOCÊ PERDEU!");
                        break;
                    }

                }
            }
        });



        btTesoura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //chamando a classe Random para sorteio aleatorio
                Random randomico= new Random();

                //bound 3 = 0-pedra, 1-papel,2-tesoura
                int numsorteado=randomico.nextInt(3);

                //Fazendo a seleção para setar a imagem de acordo com a imagem
                switch(numsorteado){

                    //pedra
                    case 0:{
                        imgMaquina.setImageDrawable(ContextCompat.getDrawable(tela2.this,R.drawable.pedra));
                        imgJogador.setImageDrawable(ContextCompat.getDrawable(tela2.this,R.drawable.dtesoura));
                        txtResultado.setText("VOCÊ PERDEU!");
                        break;
                    }

                    //papel
                    case 1:{
                        imgMaquina.setImageDrawable(ContextCompat.getDrawable(tela2.this,R.drawable.dpapel));
                        imgJogador.setImageDrawable(ContextCompat.getDrawable(tela2.this,R.drawable.tesoura));
                        txtResultado.setText("VOCÊ GANHOU!");
                        break;
                    }

                    case 2:{
                        imgMaquina.setImageDrawable(ContextCompat.getDrawable(tela2.this,R.drawable.tesoura));
                        imgJogador.setImageDrawable(ContextCompat.getDrawable(tela2.this,R.drawable.tesoura));
                        txtResultado.setText("EMPATE!");
                        break;
                    }

                }
            }
        });
    }
}

