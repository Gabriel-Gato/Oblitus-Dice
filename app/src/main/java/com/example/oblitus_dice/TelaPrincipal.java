package com.example.oblitus_dice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

import com.example.oblitus_dice.R;

public class TelaPrincipal extends AppCompatActivity {


    Random dado = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        View telaPrincipal = findViewById(R.id.TelaPrincipal);
        telaPrincipal.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                ImageView resposta = findViewById(R.id.resposta);
                TextView total = findViewById(R.id.respostaTotal);
                TextView dados = findViewById(R.id.dadoTotal);
                TextView modificador = findViewById(R.id.dadoModificador);

                resposta.setVisibility(View.INVISIBLE);
                total.setVisibility(View.INVISIBLE);
                dados.setVisibility(View.INVISIBLE);
                modificador.setVisibility(View.INVISIBLE);
            }
        });

        ImageButton d2 = findViewById(R.id.d2_button);

        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView resposta = findViewById(R.id.resposta);

                resposta.setVisibility(View.VISIBLE);


                TextView total = findViewById(R.id.respostaTotal);
                TextView dadoTotal = findViewById(R.id.dadoTotal);
                TextView dadoModificador = findViewById(R.id.dadoModificador);

                total.setVisibility(View.VISIBLE);
                dadoTotal.setVisibility(View.VISIBLE);
                dadoModificador.setVisibility(View.VISIBLE);

                EditText modificador = findViewById(R.id.Modificador);
                EditText numeroDados = findViewById(R.id.numeroDeDados);

                int numeroDeDados;
                try {
                    numeroDeDados = Integer.parseInt(numeroDados.getText().toString().replaceAll("[^0-9]", ""));
                } catch (NumberFormatException e) {
                    numeroDeDados = 1;
                }

                int modificadorFinal;
                try {
                    modificadorFinal = Integer.parseInt(modificador.getText().toString().replaceAll("[^0-9-]", ""));

                } catch (NumberFormatException e) {
                    modificadorFinal = 0;
                }




                ArrayList<Integer> resultadoModificador = new ArrayList<>();
                ArrayList<Integer> resultadoDado = new ArrayList<>();

                int controladorDado = 0;

                while (controladorDado != numeroDeDados){
                    int dado = 0;
                    dado = new Random().nextInt(2)  + 1;
                    int dadoComModificador = dado + modificadorFinal;
                    resultadoModificador.add(dadoComModificador);
                    resultadoDado.add(dado);
                    controladorDado++;

                }

                int soma = 0;

                for (int resultado : resultadoDado) {
                    soma += resultado;
                }
                soma += modificadorFinal;

                total.setText(Integer.toString(soma));

                StringBuilder dadoTotalString = new StringBuilder();
                for (int resultado : resultadoDado) {
                    dadoTotalString.append(resultado).append(", ");
                }
                dadoTotal.setText(dadoTotalString.toString().substring(0, dadoTotalString.length() - 2));


                StringBuilder dadoModificadorString = new StringBuilder();
                for (int resultado : resultadoModificador) {
                    dadoModificadorString.append(resultado).append(", ");
                }
                dadoModificador.setText(dadoModificadorString.toString().substring(0, dadoModificadorString.length() - 2));


            }

        });

        ImageButton d4 = findViewById(R.id.d4_button);

        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView resposta = findViewById(R.id.resposta);
                resposta.setVisibility(View.VISIBLE);

                TextView total = findViewById(R.id.respostaTotal);
                TextView dadoTotal = findViewById(R.id.dadoTotal);
                TextView dadoModificador = findViewById(R.id.dadoModificador);

                total.setVisibility(View.VISIBLE);
                dadoTotal.setVisibility(View.VISIBLE);
                dadoModificador.setVisibility(View.VISIBLE);

                EditText modificador = findViewById(R.id.Modificador);
                EditText numeroDados = findViewById(R.id.numeroDeDados);

                int numeroDeDados;
                try {
                    numeroDeDados = Integer.parseInt(numeroDados.getText().toString().replaceAll("[^0-9]", ""));
                } catch (NumberFormatException e) {
                    numeroDeDados = 1;
                }

                int modificadorFinal;
                try {
                    modificadorFinal = Integer.parseInt(modificador.getText().toString().replaceAll("[^0-9-]", ""));

                } catch (NumberFormatException e) {
                    modificadorFinal = 0;
                }

                ArrayList<Integer> resultadoModificador = new ArrayList<>();
                ArrayList<Integer> resultadoDado = new ArrayList<>();

                int controladorDado = 0;

                while (controladorDado != numeroDeDados){
                    int dado = 0;
                    dado = new Random().nextInt(4)  + 1;
                    int dadoComModificador = dado + modificadorFinal;
                    resultadoModificador.add(dadoComModificador);
                    resultadoDado.add(dado);
                    controladorDado++;

                }

                int soma = 0;

                for (int resultado : resultadoDado) {
                    soma += resultado;
                }
                soma += modificadorFinal;

                total.setText(Integer.toString(soma));

                StringBuilder dadoTotalString = new StringBuilder();
                for (int resultado : resultadoDado) {
                    dadoTotalString.append(resultado).append(", ");
                }
                dadoTotal.setText(dadoTotalString.toString().substring(0, dadoTotalString.length() - 2));


                StringBuilder dadoModificadorString = new StringBuilder();
                for (int resultado : resultadoModificador) {
                    dadoModificadorString.append(resultado).append(", ");
                }
                dadoModificador.setText(dadoModificadorString.toString().substring(0, dadoModificadorString.length() - 2));


            }

        });

        ImageButton d6 = findViewById(R.id.d6_button);

        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView resposta = findViewById(R.id.resposta);
                resposta.setVisibility(View.VISIBLE);

                TextView total = findViewById(R.id.respostaTotal);
                TextView dadoTotal = findViewById(R.id.dadoTotal);
                TextView dadoModificador = findViewById(R.id.dadoModificador);

                total.setVisibility(View.VISIBLE);
                dadoTotal.setVisibility(View.VISIBLE);
                dadoModificador.setVisibility(View.VISIBLE);

                EditText modificador = findViewById(R.id.Modificador);
                EditText numeroDados = findViewById(R.id.numeroDeDados);

                int numeroDeDados;
                try {
                    numeroDeDados = Integer.parseInt(numeroDados.getText().toString().replaceAll("[^0-9]", ""));
                } catch (NumberFormatException e) {
                    numeroDeDados = 1;
                }

                int modificadorFinal;
                try {
                    modificadorFinal = Integer.parseInt(modificador.getText().toString().replaceAll("[^0-9-]", ""));

                } catch (NumberFormatException e) {
                    modificadorFinal = 0;
                }

                ArrayList<Integer> resultadoModificador = new ArrayList<>();
                ArrayList<Integer> resultadoDado = new ArrayList<>();

                int controladorDado = 0;

                while (controladorDado != numeroDeDados){
                    int dado = 0;
                    dado = new Random().nextInt(6)  + 1;
                    int dadoComModificador = dado + modificadorFinal;
                    resultadoModificador.add(dadoComModificador);
                    resultadoDado.add(dado);
                    controladorDado++;

                }

                int soma = 0;

                for (int resultado : resultadoDado) {
                    soma += resultado;
                }
                soma += modificadorFinal;

                total.setText(Integer.toString(soma));

                StringBuilder dadoTotalString = new StringBuilder();
                for (int resultado : resultadoDado) {
                    dadoTotalString.append(resultado).append(", ");
                }
                dadoTotal.setText(dadoTotalString.toString().substring(0, dadoTotalString.length() - 2));


                StringBuilder dadoModificadorString = new StringBuilder();
                for (int resultado : resultadoModificador) {
                    dadoModificadorString.append(resultado).append(", ");
                }
                dadoModificador.setText(dadoModificadorString.toString().substring(0, dadoModificadorString.length() - 2));


            }

        });

        ImageButton d8 = findViewById(R.id.d8_button);

        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView resposta = findViewById(R.id.resposta);
                resposta.setVisibility(View.VISIBLE);

                TextView total = findViewById(R.id.respostaTotal);
                TextView dadoTotal = findViewById(R.id.dadoTotal);
                TextView dadoModificador = findViewById(R.id.dadoModificador);

                total.setVisibility(View.VISIBLE);
                dadoTotal.setVisibility(View.VISIBLE);
                dadoModificador.setVisibility(View.VISIBLE);

                EditText modificador = findViewById(R.id.Modificador);
                EditText numeroDados = findViewById(R.id.numeroDeDados);

                int numeroDeDados;
                try {
                    numeroDeDados = Integer.parseInt(numeroDados.getText().toString().replaceAll("[^0-9]", ""));
                } catch (NumberFormatException e) {
                    numeroDeDados = 1;
                }

                int modificadorFinal;
                try {
                    modificadorFinal = Integer.parseInt(modificador.getText().toString().replaceAll("[^0-9-]", ""));

                } catch (NumberFormatException e) {
                    modificadorFinal = 0;
                }

                ArrayList<Integer> resultadoModificador = new ArrayList<>();
                ArrayList<Integer> resultadoDado = new ArrayList<>();

                int controladorDado = 0;

                while (controladorDado != numeroDeDados){
                    int dado = 0;
                    dado = new Random().nextInt(8)  + 1;
                    int dadoComModificador = dado + modificadorFinal;
                    resultadoModificador.add(dadoComModificador);
                    resultadoDado.add(dado);
                    controladorDado++;

                }

                int soma = 0;

                for (int resultado : resultadoDado) {
                    soma += resultado;
                }
                soma += modificadorFinal;

                total.setText(Integer.toString(soma));

                StringBuilder dadoTotalString = new StringBuilder();
                for (int resultado : resultadoDado) {
                    dadoTotalString.append(resultado).append(", ");
                }
                dadoTotal.setText(dadoTotalString.toString().substring(0, dadoTotalString.length() - 2));


                StringBuilder dadoModificadorString = new StringBuilder();
                for (int resultado : resultadoModificador) {
                    dadoModificadorString.append(resultado).append(", ");
                }
                dadoModificador.setText(dadoModificadorString.toString().substring(0, dadoModificadorString.length() - 2));


            }

        });

        ImageButton d10 = findViewById(R.id.d10_button);

        d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView resposta = findViewById(R.id.resposta);
                resposta.setVisibility(View.VISIBLE);

                TextView total = findViewById(R.id.respostaTotal);
                TextView dadoTotal = findViewById(R.id.dadoTotal);
                TextView dadoModificador = findViewById(R.id.dadoModificador);

                total.setVisibility(View.VISIBLE);
                dadoTotal.setVisibility(View.VISIBLE);
                dadoModificador.setVisibility(View.VISIBLE);

                EditText modificador = findViewById(R.id.Modificador);
                EditText numeroDados = findViewById(R.id.numeroDeDados);

                int numeroDeDados;
                try {
                    numeroDeDados = Integer.parseInt(numeroDados.getText().toString().replaceAll("[^0-9]", ""));
                } catch (NumberFormatException e) {
                    numeroDeDados = 1;
                }

                int modificadorFinal;
                try {
                    modificadorFinal = Integer.parseInt(modificador.getText().toString().replaceAll("[^0-9-]", ""));

                } catch (NumberFormatException e) {
                    modificadorFinal = 0;
                }

                ArrayList<Integer> resultadoModificador = new ArrayList<>();
                ArrayList<Integer> resultadoDado = new ArrayList<>();

                int controladorDado = 0;

                while (controladorDado != numeroDeDados){
                    int dado = 0;
                    dado = new Random().nextInt(10)  + 1;
                    int dadoComModificador = dado + modificadorFinal;
                    resultadoModificador.add(dadoComModificador);
                    resultadoDado.add(dado);
                    controladorDado++;

                }

                int soma = 0;

                for (int resultado : resultadoDado) {
                    soma += resultado;
                }
                soma += modificadorFinal;

                total.setText(Integer.toString(soma));

                StringBuilder dadoTotalString = new StringBuilder();
                for (int resultado : resultadoDado) {
                    dadoTotalString.append(resultado).append(", ");
                }
                dadoTotal.setText(dadoTotalString.toString().substring(0, dadoTotalString.length() - 2));


                StringBuilder dadoModificadorString = new StringBuilder();
                for (int resultado : resultadoModificador) {
                    dadoModificadorString.append(resultado).append(", ");
                }
                dadoModificador.setText(dadoModificadorString.toString().substring(0, dadoModificadorString.length() - 2));


            }

        });

        ImageButton d12 = findViewById(R.id.d12_button);

        d12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView resposta = findViewById(R.id.resposta);
                resposta.setVisibility(View.VISIBLE);

                TextView total = findViewById(R.id.respostaTotal);
                TextView dadoTotal = findViewById(R.id.dadoTotal);
                TextView dadoModificador = findViewById(R.id.dadoModificador);

                total.setVisibility(View.VISIBLE);
                dadoTotal.setVisibility(View.VISIBLE);
                dadoModificador.setVisibility(View.VISIBLE);

                EditText modificador = findViewById(R.id.Modificador);
                EditText numeroDados = findViewById(R.id.numeroDeDados);

                int numeroDeDados;
                try {
                    numeroDeDados = Integer.parseInt(numeroDados.getText().toString().replaceAll("[^0-9]", ""));
                } catch (NumberFormatException e) {
                    numeroDeDados = 1;
                }

                int modificadorFinal;
                try {
                    modificadorFinal = Integer.parseInt(modificador.getText().toString().replaceAll("[^0-9-]", ""));

                } catch (NumberFormatException e) {
                    modificadorFinal = 0;
                }

                ArrayList<Integer> resultadoModificador = new ArrayList<>();
                ArrayList<Integer> resultadoDado = new ArrayList<>();

                int controladorDado = 0;

                while (controladorDado != numeroDeDados){
                    int dado = 0;
                    dado = new Random().nextInt(12)  + 1;
                    int dadoComModificador = dado + modificadorFinal;
                    resultadoModificador.add(dadoComModificador);
                    resultadoDado.add(dado);
                    controladorDado++;

                }

                int soma = 0;

                for (int resultado : resultadoDado) {
                    soma += resultado;
                }
                soma += modificadorFinal;

                total.setText(Integer.toString(soma));

                StringBuilder dadoTotalString = new StringBuilder();
                for (int resultado : resultadoDado) {
                    dadoTotalString.append(resultado).append(", ");
                }
                dadoTotal.setText(dadoTotalString.toString().substring(0, dadoTotalString.length() - 2));


                StringBuilder dadoModificadorString = new StringBuilder();
                for (int resultado : resultadoModificador) {
                    dadoModificadorString.append(resultado).append(", ");
                }
                dadoModificador.setText(dadoModificadorString.toString().substring(0, dadoModificadorString.length() - 2));


            }

        });

        ImageButton d20 = findViewById(R.id.d20_button);

        d20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView resposta = findViewById(R.id.resposta);
                resposta.setVisibility(View.VISIBLE);

                TextView total = findViewById(R.id.respostaTotal);
                TextView dadoTotal = findViewById(R.id.dadoTotal);
                TextView dadoModificador = findViewById(R.id.dadoModificador);

                total.setVisibility(View.VISIBLE);
                dadoTotal.setVisibility(View.VISIBLE);
                dadoModificador.setVisibility(View.VISIBLE);

                EditText modificador = findViewById(R.id.Modificador);
                EditText numeroDados = findViewById(R.id.numeroDeDados);

                int numeroDeDados;
                try {
                    numeroDeDados = Integer.parseInt(numeroDados.getText().toString().replaceAll("[^0-9]", ""));
                } catch (NumberFormatException e) {
                    numeroDeDados = 1;
                }

                int modificadorFinal;
                try {
                    modificadorFinal = Integer.parseInt(modificador.getText().toString().replaceAll("[^0-9-]", ""));

                } catch (NumberFormatException e) {
                    modificadorFinal = 0;
                }

                ArrayList<Integer> resultadoModificador = new ArrayList<>();
                ArrayList<Integer> resultadoDado = new ArrayList<>();

                int controladorDado = 0;

                while (controladorDado != numeroDeDados){
                    int dado = 0;
                    dado = new Random().nextInt(20)  + 1;
                    int dadoComModificador = dado + modificadorFinal;
                    resultadoModificador.add(dadoComModificador);
                    resultadoDado.add(dado);
                    controladorDado++;

                }

                int soma = 0;

                for (int resultado : resultadoDado) {
                    soma += resultado;
                }
                soma += modificadorFinal;

                total.setText(Integer.toString(soma));

                StringBuilder dadoTotalString = new StringBuilder();
                for (int resultado : resultadoDado) {
                    dadoTotalString.append(resultado).append(", ");
                }
                dadoTotal.setText(dadoTotalString.toString().substring(0, dadoTotalString.length() - 2));


                StringBuilder dadoModificadorString = new StringBuilder();
                for (int resultado : resultadoModificador) {
                    dadoModificadorString.append(resultado).append(", ");
                }
                dadoModificador.setText(dadoModificadorString.toString().substring(0, dadoModificadorString.length() - 2));


            }

        });

        ImageButton d100 = findViewById(R.id.d100_button);

        d100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView resposta = findViewById(R.id.resposta);
                resposta.setVisibility(View.VISIBLE);

                TextView total = findViewById(R.id.respostaTotal);
                TextView dadoTotal = findViewById(R.id.dadoTotal);
                TextView dadoModificador = findViewById(R.id.dadoModificador);

                total.setVisibility(View.VISIBLE);
                dadoTotal.setVisibility(View.VISIBLE);
                dadoModificador.setVisibility(View.VISIBLE);

                EditText modificador = findViewById(R.id.Modificador);
                EditText numeroDados = findViewById(R.id.numeroDeDados);

                int numeroDeDados;
                try {
                    numeroDeDados = Integer.parseInt(numeroDados.getText().toString().replaceAll("[^0-9]", ""));
                } catch (NumberFormatException e) {
                    numeroDeDados = 1;
                }

                int modificadorFinal;
                try {
                    modificadorFinal = Integer.parseInt(modificador.getText().toString().replaceAll("[^0-9-]", ""));

                } catch (NumberFormatException e) {
                    modificadorFinal = 0;
                }

                ArrayList<Integer> resultadoModificador = new ArrayList<>();
                ArrayList<Integer> resultadoDado = new ArrayList<>();

                int controladorDado = 0;

                while (controladorDado != numeroDeDados){
                    int dado = 0;
                    dado = new Random().nextInt(100)  + 1;
                    int dadoComModificador = dado + modificadorFinal;
                    resultadoModificador.add(dadoComModificador);
                    resultadoDado.add(dado);
                    controladorDado++;

                }

                int soma = 0;

                for (int resultado : resultadoDado) {
                    soma += resultado;
                }
                soma += modificadorFinal;

                total.setText(Integer.toString(soma));

                StringBuilder dadoTotalString = new StringBuilder();
                for (int resultado : resultadoDado) {
                    dadoTotalString.append(resultado).append(", ");
                }
                dadoTotal.setText(dadoTotalString.toString().substring(0, dadoTotalString.length() - 2));


                StringBuilder dadoModificadorString = new StringBuilder();
                for (int resultado : resultadoModificador) {
                    dadoModificadorString.append(resultado).append(", ");
                }
                dadoModificador.setText(dadoModificadorString.toString().substring(0, dadoModificadorString.length() - 2));


            }

        });

        EditText numeroDados =  findViewById(R.id.numeroDeDados);

        numeroDados.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if(hasFocus){
                    numeroDados.setText("");
                }
            }
        });
        EditText modificador = findViewById(R.id.Modificador);
        modificador.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if(hasFocus){
                    modificador.setText("");
                }

            }
        });


    }

}