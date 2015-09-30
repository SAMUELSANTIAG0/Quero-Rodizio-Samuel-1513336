package np1.android.unifor.br.quero_rodizio_samuel_1513336;
/**
 * @author Samuel Santiago
 * @version 1.0
 * Class Activity: Esta é a atividade principal <Escolha do Tipo de serviço>
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class TelaOpcoesRestaurante extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_opcoes_restaurante);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tela_opcoes_restaurante, menu);
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

    public void cliqueMassas(View view) {
        Intent intencao = new Intent(TelaOpcoesRestaurante.this,TelaNomesRestaurantes.class);
        String nome = "Massas";
        Bundle parametros = new Bundle();
        parametros.putString("nome", nome);
        intencao.putExtras(parametros);
        startActivity(intencao);
    }

    public void cliquePizza(View view) {
        Intent intencao = new Intent(TelaOpcoesRestaurante.this,TelaNomesRestaurantes.class);
        String nome = "Pizza";
        Bundle parametros = new Bundle();
        parametros.putString("nome", nome);
        intencao.putExtras(parametros);
        startActivity(intencao);
    }

    public void cliqueSushi(View view) {
        Intent intencao = new Intent(TelaOpcoesRestaurante.this,TelaNomesRestaurantes.class);
        String nome = "Sushi";
        Bundle parametros = new Bundle();
        parametros.putString("nome", nome);
        intencao.putExtras(parametros);
        startActivity(intencao);
    }
}
