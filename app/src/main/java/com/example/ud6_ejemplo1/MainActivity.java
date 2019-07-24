package com.example.ud6_ejemplo1;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Cargamos la canción
        mediaPlayer = MediaPlayer.create(this, R.raw.cancion);

        // Buscamos los botones y configuramos sus eventos
        Button botonPlay = findViewById(R.id.botonPlay);

        botonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Reproducimos la canción.
                mediaPlayer.start();
            }
        });

        Button botonPause = findViewById(R.id.botonPause);

        botonPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pausamos la canción
                mediaPlayer.pause();
            }
        });
    }
}
