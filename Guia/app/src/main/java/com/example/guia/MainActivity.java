package com.example.guia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imageView1 = findViewById(R.id.imageView1);
        imageView1.setImageResource(R.drawable.zoologico);
        TextView textView1 = findViewById(R.id.textView1);
        textView1.setText("Zoológico de Sorocaba");

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtra("local", "zoologico");
                startActivity(intent);
            }
        });


        ImageView imageView2 = findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.iguatemi);
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText("Shopping Iguatemi Esplanada");

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtra("local", "iguatemi");
                startActivity(intent);

            }
        });


        ImageView imageView3 = findViewById(R.id.imageView3);
        imageView3.setImageResource(R.drawable.chico_mendes1);
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText("Parque natural Chico Mendes");

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtra("local", "parque_chico_mendes");
                startActivity(intent);
            }
        });
    }
}
