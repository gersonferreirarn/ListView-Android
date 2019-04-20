package br.com.caicosoft.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lvLocais;
    String[] itens = {
            "Caicó",
            "Alagoa Grande",
            "Salvador",
            "Belem do Brejo",
            "Fortaleza",
            "Natal",
            "Currais Novos",
            "Carnauba",
            "Pau dos Ferros",
            "Acari",
            "Sousa",
            "Junco",
            "Parelhas",
            "Areia",
            "Campina Grande"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvLocais = findViewById(R.id.lvLocais);

        // cria adaptador para a lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        // adiciona adaptador na lista
        lvLocais.setAdapter(adaptador);

        // adiciona clique na lista
        lvLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String valorSelecionado = lvLocais.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), valorSelecionado, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
