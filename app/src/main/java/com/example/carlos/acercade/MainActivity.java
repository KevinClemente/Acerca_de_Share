package com.example.carlos.acercade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button boton_compartir;
    private String facebook_enviar;
    private ImageView imagen_perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton_compartir = (Button) findViewById(R.id.boton_compartir_layout);
        facebook_enviar = getResources().getString(R.string.facebook);
        imagen_perfil = (ImageView) findViewById(R.id.perfil_layout);

        boton_compartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent compartir = new Intent(Intent.ACTION_SEND);
                compartir.putExtra(Intent.EXTRA_TEXT,facebook_enviar);
                compartir.setType("text/plain");
                compartir.createChooser(compartir, "Comparte mi informacion");
                startActivity(compartir);
            }
        });


    }
}
