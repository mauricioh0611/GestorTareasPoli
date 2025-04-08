package com.example.gestortareas;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ListView listaOpciones;
    private String[] opciones = {"Perfil", "Fotos", "Video", "Web", "Botones"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        listaOpciones = findViewById(R.id.lista_opciones);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, opciones);
        listaOpciones.setAdapter(adapter);

        listaOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment fragmento = null;

                switch (position) {
                    case 0:
                        fragmento = new PerfilFragment();
                        break;
                    case 1:
                        fragmento = new GaleriaFragment();
                        break;
                    case 2:
                        fragmento = new VideoFragment();
                        break;
                    case 3:
                        fragmento = new WebFragment();
                        break;
                    case 4:
                        fragmento = new BotonesFragment();
                        break;
                }

                if (fragmento != null) {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragment_derecho, fragmento)
                            .addToBackStack(null)
                            .commit();
                }

                drawerLayout.closeDrawer(listaOpciones);
            }
        });

        // Mostrar fragmento inicial
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_derecho, new PerfilFragment())
                .commit();
    }
}
