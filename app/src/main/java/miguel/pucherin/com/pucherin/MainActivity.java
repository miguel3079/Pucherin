package miguel.pucherin.com.pucherin;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Random;

public class MainActivity extends ActionBarActivity {
    //

    Random randomA = new Random();
    Random randomB = new Random();
    ImageView imagencentro, imagen2, imagen3, imagen4, imagen5, imagen6, imagen8, imagen9, imagen10,
            imagen11, dadoA, dadoB;
    TextView textContador;
    HashMap<Integer,Integer>hasficha2 = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer>hasficha3 = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer>hasficha4 = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer>hasficha5 = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer>hasficha6 = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer>hasficha8 = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer>hasficha9 = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer>hasficha10 = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer>hasficha11 = new HashMap<Integer,Integer>();

    int Contador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // Hide the action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        ///
        //Inicializacion de los metodos
        inicializarImagenes();
        Contador = 60;
        textContador.setText(String.valueOf(Contador));
        hasficha2.put(1,1);
        hasficha3.put(1,1);
        hasficha4.put(1,1);
        hasficha5.put(1,1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void inicializarImagenes() {
        imagencentro = (ImageView) findViewById(R.id.imagencentro);
        imagen2 = (ImageView) findViewById(R.id.imagen2);
        imagen3 = (ImageView) findViewById(R.id.imagen3);
        imagen4 = (ImageView) findViewById(R.id.imagen4);
        imagen5 = (ImageView) findViewById(R.id.imagen5);
        imagen6 = (ImageView) findViewById(R.id.imagen6);
        imagen8 = (ImageView) findViewById(R.id.imagen8);
        imagen9 = (ImageView) findViewById(R.id.imagen9);
        imagen10 = (ImageView) findViewById(R.id.imagen10);
        imagen11 = (ImageView) findViewById(R.id.imagen11);
        textContador = (TextView) findViewById(R.id.textContador);

        dadoA = (ImageView) findViewById(R.id.dadoA);
        dadoB = (ImageView) findViewById(R.id.dadoB);

    }


    public void lanzarDados(View view) {
        int A, B;

        A = randomA.nextInt(6);
        B = randomB.nextInt(6);

        //dadoA
        if (A == 1) {
            dadoA.setImageResource(R.drawable.dado1);
        }else if(A ==2){
            dadoA.setImageResource(R.drawable.dado2);
        }
        else if(A ==3){
            dadoA.setImageResource(R.drawable.dado3);
        }
        else if(A ==4){
            dadoA.setImageResource(R.drawable.dado4);
        }
        else if(A ==5){
            dadoA.setImageResource(R.drawable.dado5);
        }
        else if(A ==6){
            dadoA.setImageResource(R.drawable.dado6);
        }

        ///dadoB
        if (B == 1) {
            dadoB.setImageResource(R.drawable.dado1);
        }else if(B ==2){
            dadoB.setImageResource(R.drawable.dado2);
        }
        else if(B ==3){
            dadoB.setImageResource(R.drawable.dado3);
        }
        else if(B ==4){
            dadoB.setImageResource(R.drawable.dado4);
        }
        else if(B ==5){
            dadoB.setImageResource(R.drawable.dado5);
        }
        else if(B ==6){
            dadoB.setImageResource(R.drawable.dado6);
        }
        //logica ficha 2

        if(A == 1 && B == 1) {
            if(hasficha2.containsKey(1)&&hasficha2.containsValue(1)){
                imagen2.setImageResource(R.drawable.pucherito21fichas);
                hasficha2.remove(1);
                hasficha2.put(2,2);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("puesto 2", "2");
            }
            else if(hasficha2.containsKey(2)&&hasficha2.containsValue(2)){
                imagen2.setImageResource(R.drawable.pucherito22fichas);
                Log.i("Mostrado imagen2","imagen2");
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
            }
        }

        //logica 3
        if(A == 2 && B == 1||A == 1 && B == 2) {
            if(hasficha3.containsKey(1)&&hasficha3.containsValue(1)){
                imagen3.setImageResource(R.drawable.pucherito31fichas);
                hasficha3.remove(1);
                hasficha3.put(2,2);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("puesto 2", "2");
                Log.i("imagen 1", "imagen1");
            }
            else if(hasficha3.containsKey(2)&&hasficha3.containsValue(2)){
                imagen3.setImageResource(R.drawable.pucherito32fichas);
                hasficha3.remove(2);
                hasficha3.put(3,3);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("puesto 3", "3");
                Log.i("imagen 2", "imagen2");
            }
            else if(hasficha3.containsKey(3)&&hasficha3.containsValue(3)){
                imagen3.setImageResource(R.drawable.pucherito33fichas);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 3", "imagen3");
            }
        }
            //logica 4
        if(A == 2 && B == 2||A == 1 && B == 3||A == 3 && B == 1) {
            if(hasficha4.containsKey(1)&&hasficha4.containsValue(1)){
                imagen4.setImageResource(R.drawable.pucherito41fichas);
                hasficha4.remove(1);
                hasficha4.put(2,2);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("puesto 4", "2");
                Log.i("imagen 4", "imagen1");
            }
            else if(hasficha4.containsKey(2)&&hasficha4.containsValue(2)){
                imagen4.setImageResource(R.drawable.pucherito42fichas);
                hasficha4.remove(2);
                hasficha4.put(3,3);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("puesto 4", "3");
                Log.i("imagen 4", "imagen2");
            }
            else if(hasficha4.containsKey(3)&&hasficha4.containsValue(3)){
                imagen4.setImageResource(R.drawable.pucherito43fichas);
                hasficha4.remove(3);
                hasficha4.put(4,4);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 3", "imagen3");
            }
            else if(hasficha4.containsKey(4)&&hasficha4.containsValue(4)){
                imagen4.setImageResource(R.drawable.pucherito44fichas);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 4", "imagen4");
            }
        }
        //logica 5
        if(A == 3 && B == 2||A == 2 && B == 3||A == 4 && B == 1||A == 1 && B == 4) {
            if(hasficha5.containsKey(1)&&hasficha5.containsValue(1)){
                imagen5.setImageResource(R.drawable.pucherito51fichas);
                hasficha5.remove(1);
                hasficha5.put(2,2);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("puesto 5", "2");
                Log.i("imagen 5", "imagen1");
            }
            else if(hasficha5.containsKey(2)&&hasficha5.containsValue(2)){
                imagen5.setImageResource(R.drawable.pucherito52fichas);
                hasficha5.remove(2);
                hasficha5.put(3,3);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("puesto 5", "3");
                Log.i("imagen 5", "imagen2");
            }
            else if(hasficha5.containsKey(3)&&hasficha5.containsValue(3)){
                imagen5.setImageResource(R.drawable.pucherito53fichas);
                hasficha5.remove(3);
                hasficha5.put(4,4);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 5", "imagen3");
            }
            else if(hasficha5.containsKey(4)&&hasficha5.containsValue(4)){
                imagen5.setImageResource(R.drawable.pucherito54fichas);
                hasficha5.remove(4);
                hasficha5.put(5,5);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 4", "imagen4");
            }
            else if(hasficha5.containsKey(5)&&hasficha5.containsValue(5)){
                imagen5.setImageResource(R.drawable.pucherito54fichas);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 5", "imagen5");
            }
        }
    }
}
