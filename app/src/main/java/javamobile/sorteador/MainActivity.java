package javamobile.sorteador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.util.Random;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarBotao(View v) {
        int num = new Random().nextInt(101);
        TextView texto = findViewById(R.id.textoResultado);
        texto.setText("O NUMERO SORTEADO FOI: " +num);

    }

}



