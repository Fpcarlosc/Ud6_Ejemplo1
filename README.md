# Ud6_Ejemplo1
_Ejemplo 1 de la Unidad 6._

Vamos a crear una aplicación que use la clase _MediaPlayer_ para reproducir música. Tendrá dos botones, uno para reproducir y otro para
pausar la canción.

El primer paso será crear un _Android Resource Directory_ llamado _raw_ dentro del directorio _res_ del proyecto. 
Ahí deberemos copiar la canción (importante que el nombre sólo tenga letras minúsculas, dígitos o '_', sino dará error al compilar).

El fichero _activity_main.xml_ será el siguiente:
```
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/botonPlay"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/play" />

    <Button
        android:id="@+id/botonPause"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/pause" />

</LinearLayout>
```

Y el _MainActivity.java_:
```
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
```
En él, primero cargamos la canción con el método _create_ donde le pasamos el contexto y el fichero a reproducir y en cada uno de los eventos de los botones, la reproducimos o la pausamos con los métodos 
_start_ o _pause_ de la clase _MediaPlayer_.

_Canción de jamendo.com: Eames, Always Find U feat. Matt Rose (2019) (Licencia CC BY-NC-ND)_
