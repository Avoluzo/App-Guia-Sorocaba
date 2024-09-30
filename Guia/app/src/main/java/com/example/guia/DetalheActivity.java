package com.example.guia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetalheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        ImageView imageViewDetail1 = findViewById(R.id.imageViewDetail1);
        ImageView imageViewDetail2 = findViewById(R.id.imageViewDetail2);
        TextView descriptionText = findViewById(R.id.descriptionText);


        Intent intent = getIntent();
        String local = intent.getStringExtra("local");


        String siteUrl = "";
        String telefone = "";
        String geoUri = "";


        if (local.equals("zoologico")) {
            imageViewDetail1.setImageResource(R.drawable.zoologico);
            imageViewDetail2.setImageResource(R.drawable.zoologico2);
            descriptionText.setText("O Zoológico de Sorocaba é um dos mais antigos e renomados do país...");
            siteUrl = "https://www.zoologico.com.br";
            telefone = "tel:+551532211234";
            geoUri = "geo:0,0?q=Zoológico de Sorocaba";
        } else if (local.equals("iguatemi")) {
            imageViewDetail1.setImageResource(R.drawable.iguatemi);
            imageViewDetail2.setImageResource(R.drawable.iguatemi2);
            descriptionText.setText("O Iguatemi Esplanada é um dos maiores e mais modernos shoppings da região de Sorocaba");
            siteUrl = "https://iguatemi.com.br/esplanada";
            telefone = "tel:+551532413000";
            geoUri = "geo:0,0?q=Iguatemi Esplanada";
        } else if (local.equals("parque_chico_mendes")) {
            imageViewDetail1.setImageResource(R.drawable.chico_mendes1);
            imageViewDetail2.setImageResource(R.drawable.chico_mendes2);
            descriptionText.setText("O Parque Natural Municipal Chico Mendes é um local de preservação ambiental e lazer");
            siteUrl = "https://www.sorocaba.sp.gov.br/parques";
            telefone = "tel:+551533211242";
            geoUri = "geo:0,0?q=Parque Natural Municipal Chico Mendes";
        }

        // Botão para abrir o mapa
        Button buttonMap = findViewById(R.id.buttonMap);
        String finalGeoUri = geoUri;
        buttonMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse(finalGeoUri));
                intentMap.setPackage("com.google.android.apps.maps");
                startActivity(intentMap);
            }
        });


        Button buttonWebsite = findViewById(R.id.buttonWebsite);
        String finalSiteUrl = siteUrl;
        buttonWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse(finalSiteUrl));
                startActivity(intentBrowser);
            }
        });


        Button buttonCall = findViewById(R.id.buttonCall);
        String finalTelefone = telefone;
        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse(finalTelefone));
                startActivity(intentCall);
            }
        });
    }
}

