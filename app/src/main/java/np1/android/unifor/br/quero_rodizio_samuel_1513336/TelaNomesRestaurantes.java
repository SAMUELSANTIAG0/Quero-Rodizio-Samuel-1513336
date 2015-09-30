package np1.android.unifor.br.quero_rodizio_samuel_1513336;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Samuel Santiago on 29/09/2015.
 */


public class TelaNomesRestaurantes extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_nomes_restaurantes);

        Intent intent = getIntent();
        Bundle args = intent.getExtras();

        String nome = args.getString("nome");

        TextView viewNome = (TextView) findViewById(R.id.textView2);
        viewNome.setText(nome);


    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View arg0) {

            finish();
        }
    };
}
