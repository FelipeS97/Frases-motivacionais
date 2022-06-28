package com.example.frasesmotivacionais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mudarFrase(View view){

        TextView textFrases;

        textFrases = (findViewById(R.id.textFrases));

        String[] frases = {"A persistência é o caminho do êxito.",
        "As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente.",
        "Motivação é a arte de fazer as pessoas fazerem o que você quer que elas façam porque elas o querem fazer.",
        "Toda ação humana, quer se torne positiva ou negativa, precisa depender de motivação.",
        "No meio da dificuldade encontra-se a oportunidade.",
        "Lute. Acredite. Conquiste. Perca. Deseje. Espere. Alcance. Invada. Caia. Seja tudo o quiser ser, mas, acima de tudo, seja você sempre.",
        "Eu faço da dificuldade a minha motivação. A volta por cima vem na continuação.",
        "A verdadeira motivação vem de realização, desenvolvimento pessoal, satisfação no trabalho e reconhecimento.",
        "Pedras no caminho? Eu guardo todas. Um dia vou construir um castelo.",
        "É parte da cura o desejo de ser curado.",
        "Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado."};

        int n = new Random().nextInt(frases.length);

        textFrases.setText(frases[n]);


    }

}