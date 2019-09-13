package com.example.exercciopontoturistco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.exercciopontoturistco.Modelos.Locais;
import com.example.exercciopontoturistco.adapter.MeuAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    private ListView listView;
    private List<Locais> locais = new ArrayList<>();
    private ArrayAdapter<Locais> arrayAdapterLocais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        criarLocais();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view_locais);

        arrayAdapterLocais = new MeuAdapter(MainActivity.this,
                (ArrayList<Locais>) locais);
        listView.setAdapter(arrayAdapterLocais);
    }

    public void criarLocais (){
        this.locais.add(new Locais("Catedral","0.7M"));
        this.locais.add(new Locais("Parque Ecológico","5KM"));
    }
}
