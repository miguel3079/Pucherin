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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MainActivity extends ActionBarActivity {
    //

    Random randomA = new Random();
    Random randomB = new Random();
    int numPlayers, contTurnoJugador=0;
    ArrayList<Player> players;
    int A, B;
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
    int Puchero;


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
        Puchero = 0;
        textContador.setText(String.valueOf(Contador));
        hasficha2.put(1,1);
        hasficha3.put(1,1);
        hasficha4.put(1,1);
        hasficha5.put(1,1);
        hasficha6.put(1,1);
        hasficha8.put(1,1);
        hasficha9.put(1,1);
        hasficha10.put(1,1);
        hasficha11.put(1,1);
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


        A = (int) ((Math.random()* 6)  + 1);
        B = (int) ((Math.random()* 6)  + 1);

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

        if(A+B==2) {
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
            }else{

                Log.i("Completo","se lleba fichas");
            }
        }

        //logica 3
        if(A+B==3) {
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
        if(A+B==4) {
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
        if(A+B==5) {
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
                imagen5.setImageResource(R.drawable.pucherito55fichas);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 5", "imagen5");
            }
        }

        //logica 6
        if(A+B==6) {
            if(hasficha6.containsKey(1)&&hasficha6.containsValue(1)){
                imagen6.setImageResource(R.drawable.pucherito61fichas);
                hasficha6.remove(1);
                hasficha6.put(2,2);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("puesto 6", "2");
                Log.i("imagen 6", "imagen1");
            }
            else if(hasficha6.containsKey(2)&&hasficha6.containsValue(2)){
                imagen6.setImageResource(R.drawable.pucherito62fichas);
                hasficha6.remove(2);
                hasficha6.put(3,3);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("puesto 6", "3");
                Log.i("imagen 6", "imagen2");
            }
            else if(hasficha6.containsKey(3)&&hasficha6.containsValue(3)){
                imagen6.setImageResource(R.drawable.pucherito63fichas);
                hasficha6.remove(3);
                hasficha6.put(4,4);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 6", "imagen3");
            }
            else if(hasficha6.containsKey(4)&&hasficha6.containsValue(4)){
                imagen6.setImageResource(R.drawable.pucherito64fichas);
                hasficha6.remove(4);
                hasficha6.put(5,5);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 6", "imagen4");
            }
            else if(hasficha6.containsKey(5)&&hasficha6.containsValue(5)){
                imagen6.setImageResource(R.drawable.pucherito66fichas);
                hasficha6.remove(5);
                hasficha6.put(6,6);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 6", "imagen6");
            }
            else if(hasficha6.containsKey(6)&&hasficha6.containsValue(6)){
                imagen6.setImageResource(R.drawable.pucherito67fichas);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 6", "imagen6");
            }
        }
        //logica 8
        if(A+B==8) {
            if(hasficha8.containsKey(1)&&hasficha8.containsValue(1)){
                imagen8.setImageResource(R.drawable.pucherito81fichas);
                hasficha8.remove(1);
                hasficha8.put(2,2);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("puesto 8", "2");
                Log.i("imagen 8", "imagen1");
            }
            else if(hasficha8.containsKey(2)&&hasficha8.containsValue(2)){
                imagen8.setImageResource(R.drawable.pucherito82fichas);
                hasficha8.remove(2);
                hasficha8.put(3,3);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("puesto 8", "3");
                Log.i("imagen 8", "imagen2");
            }
            else if(hasficha8.containsKey(3)&&hasficha8.containsValue(3)){
                imagen8.setImageResource(R.drawable.pucherito83fichas);
                hasficha8.remove(3);
                hasficha8.put(4,4);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 8", "imagen3");
            }
            else if(hasficha8.containsKey(4)&&hasficha8.containsValue(4)){
                imagen8.setImageResource(R.drawable.pucherito84fichas);
                hasficha8.remove(4);
                hasficha8.put(5,5);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 8", "imagen4");
            }
            else if(hasficha8.containsKey(5)&&hasficha8.containsValue(5)){
                imagen8.setImageResource(R.drawable.pucherito85fichas);
                hasficha8.remove(5);
                hasficha8.put(6,6);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 8", "imagen5");
            }
            else if(hasficha8.containsKey(6)&&hasficha8.containsValue(6)){
                imagen8.setImageResource(R.drawable.pucherito86fichas);
                hasficha8.remove(6);
                hasficha8.put(7, 7);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 8", "imagen6");
            }
            else if(hasficha8.containsKey(7)&&hasficha8.containsValue(7)){
                imagen8.setImageResource(R.drawable.pucherito87fichas);
                hasficha8.remove(7);
                hasficha8.put(8,8);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 8", "imagen7");
            }
            else if(hasficha8.containsKey(8)&&hasficha8.containsValue(8)){
                imagen8.setImageResource(R.drawable.pucherito88fichas);
                hasficha8.put(8,8);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 8", "imagen8");
            }
        }
        //logica 9
        if(A+B==9) {
            if(hasficha9.containsKey(1)&&hasficha9.containsValue(1)){
                imagen9.setImageResource(R.drawable.pucherito91fichas);
                hasficha9.remove(1);
                hasficha9.put(2,2);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("puesto 9", "2");
                Log.i("imagen 9", "imagen1");
            }
            else if(hasficha9.containsKey(2)&&hasficha9.containsValue(2)){
                imagen9.setImageResource(R.drawable.pucherito92fichas);
                hasficha9.remove(2);
                hasficha9.put(3,3);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("puesto 9", "3");
                Log.i("imagen 9", "imagen2");
            }
            else if(hasficha9.containsKey(3)&&hasficha9.containsValue(3)){
                imagen9.setImageResource(R.drawable.pucherito93fichas);
                hasficha9.remove(3);
                hasficha9.put(4,4);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 9", "imagen3");
            }
            else if(hasficha9.containsKey(4)&&hasficha9.containsValue(4)){
                imagen9.setImageResource(R.drawable.pucherito94fichas);
                hasficha9.remove(4);
                hasficha9.put(5,5);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 9", "imagen4");
            }
            else if(hasficha9.containsKey(5)&&hasficha9.containsValue(5)){
                imagen9.setImageResource(R.drawable.pucherito95fichas);
                hasficha9.remove(5);
                hasficha9.put(6,6);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 9", "imagen5");
            }
            else if(hasficha9.containsKey(6)&&hasficha9.containsValue(6)){
                imagen9.setImageResource(R.drawable.pucherito86fichas);
                hasficha9.remove(6);
                hasficha9.put(7,7);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 9", "imagen6");
            }
            else if(hasficha9.containsKey(7)&&hasficha9.containsValue(7)){
                imagen9.setImageResource(R.drawable.pucherito97fichas);
                hasficha9.remove(7);
                hasficha9.put(8,8);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 9", "imagen7");
            }
            else if(hasficha9.containsKey(8)&&hasficha9.containsValue(8)){
                imagen9.setImageResource(R.drawable.pucherito98fichas);
                hasficha9.remove(8);
                hasficha9.put(9,9);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 9", "imagen8");
            }
            else if(hasficha9.containsKey(9)&&hasficha9.containsValue(9)){
                imagen9.setImageResource(R.drawable.pucherito99fichas);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 9", "imagen9");
            }
        }
        //logica 10
        if(A+B==10) {
            if(hasficha10.containsKey(1)&&hasficha10.containsValue(1)){
                imagen10.setImageResource(R.drawable.pucherito101fichas);
                hasficha10.remove(1);
                hasficha10.put(2,2);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("puesto 10", "2");
                Log.i("imagen 10", "imagen1");
            }
            else if(hasficha10.containsKey(2)&&hasficha10.containsValue(2)){
                imagen10.setImageResource(R.drawable.pucherito102fichas);
                hasficha10.remove(2);
                hasficha10.put(3,3);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("puesto 10", "3");
                Log.i("imagen 10", "imagen2");
            }
            else if(hasficha10.containsKey(3)&&hasficha10.containsValue(3)){
                imagen10.setImageResource(R.drawable.pucherito103fichas);
                hasficha10.remove(3);
                hasficha10.put(4,4);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 10", "imagen3");
            }
            else if(hasficha10.containsKey(4)&&hasficha10.containsValue(4)){
                imagen10.setImageResource(R.drawable.pucherito104fichas);
                hasficha10.remove(4);
                hasficha10.put(5,5);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 10", "imagen4");
            }
            else if(hasficha10.containsKey(5)&&hasficha10.containsValue(5)){
                imagen10.setImageResource(R.drawable.pucherito105fichas);
                hasficha10.remove(5);
                hasficha10.put(6,6);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 10", "imagen5");
            }
            else if(hasficha10.containsKey(6)&&hasficha10.containsValue(6)){
                imagen10.setImageResource(R.drawable.pucherito106fichas);
                hasficha10.remove(6);
                hasficha10.put(7,7);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 10", "imagen6");
            }
            else if(hasficha10.containsKey(7)&&hasficha10.containsValue(7)){
                imagen10.setImageResource(R.drawable.pucherito107fichas);
                hasficha10.remove(7);
                hasficha10.put(8,8);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 10", "imagen7");
            }
            else if(hasficha10.containsKey(8)&&hasficha10.containsValue(8)){
                imagen10.setImageResource(R.drawable.pucherito108fichas);
                hasficha10.remove(8);
                hasficha10.put(9,9);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 10", "imagen8");
            }
            else if(hasficha10.containsKey(9)&&hasficha10.containsValue(9)){
                imagen10.setImageResource(R.drawable.pucherito109fichas);
                hasficha10.remove(9);
                hasficha10.put(10,10);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 10", "imagen9");
            }
            else if(hasficha10.containsKey(10)&&hasficha10.containsValue(10)){
                imagen10.setImageResource(R.drawable.pucherito1010fichas);
                hasficha10.remove(9);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 10", "imagen10");
            }
        }
        //logica 11
        if(A+B==11) {
            if(hasficha11.containsKey(1)&&hasficha11.containsValue(1)){
                imagen11.setImageResource(R.drawable.pucherito111fichas);
                hasficha11.remove(1);
                hasficha11.put(2,2);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("puesto 11", "2");
                Log.i("imagen 11", "imagen1");
            }
            else if(hasficha11.containsKey(2)&&hasficha11.containsValue(2)){
                imagen11.setImageResource(R.drawable.pucherito112fichas);
                hasficha11.remove(2);
                hasficha11.put(3,3);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("puesto 11", "3");
                Log.i("imagen 11", "imagen2");
            }
            else if(hasficha11.containsKey(3)&&hasficha11.containsValue(3)){
                imagen11.setImageResource(R.drawable.pucherito113fichas);
                hasficha11.remove(3);
                hasficha11.put(4,4);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 11", "imagen3");
            }
            else if(hasficha11.containsKey(4)&&hasficha11.containsValue(4)){
                imagen11.setImageResource(R.drawable.pucherito114fichas);
                hasficha11.remove(4);
                hasficha11.put(5,5);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 11", "imagen4");
            }
            else if(hasficha11.containsKey(5)&&hasficha11.containsValue(5)){
                imagen11.setImageResource(R.drawable.pucherito115fichas);
                hasficha11.remove(5);
                hasficha11.put(6,6);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 11", "imagen5");
            }
            else if(hasficha11.containsKey(6)&&hasficha11.containsValue(6)){
                imagen11.setImageResource(R.drawable.pucherito116fichas);
                hasficha11.remove(6);
                hasficha11.put(7,7);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 11", "imagen6");
            }
            else if(hasficha11.containsKey(7)&&hasficha11.containsValue(7)){
                imagen11.setImageResource(R.drawable.pucherito117fichas);
                hasficha11.remove(7);
                hasficha11.put(8,8);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 11", "imagen7");
            }
            else if(hasficha11.containsKey(8)&&hasficha11.containsValue(8)){
                imagen11.setImageResource(R.drawable.pucherito108fichas);
                hasficha11.remove(8);
                hasficha11.put(9,9);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 11", "imagen8");
            }
            else if(hasficha11.containsKey(9)&&hasficha11.containsValue(9)){
                imagen11.setImageResource(R.drawable.pucherito119fichas);
                hasficha11.remove(9);
                hasficha11.put(10,10);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 11", "imagen9");
            }
            else if(hasficha11.containsKey(10)&&hasficha11.containsValue(10)){
                imagen11.setImageResource(R.drawable.pucherito1110fichas);
                hasficha11.remove(10);
                hasficha11.put(11,11);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 11", "imagen10");
            }
            else if(hasficha11.containsKey(11)&&hasficha11.containsValue(11)){
                imagen11.setImageResource(R.drawable.pucherito1110fichas);
                Contador=Contador-1;
                textContador.setText(String.valueOf(Contador));
                Log.i("imagen 11", "imagen11");
            }

            if(A+B==7) {
             Puchero = Puchero + 1;
                Log.i("Puecherooooo","Puchero + 1");
             Contador = Contador -1;
            }
        }
    }
}
