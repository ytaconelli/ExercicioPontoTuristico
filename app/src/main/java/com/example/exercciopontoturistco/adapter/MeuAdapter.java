package com.example.exercciopontoturistco.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.exercciopontoturistco.Modelos.Locais;
import com.example.exercciopontoturistco.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MeuAdapter extends ArrayAdapter<Locais> {

    private Context context;
    private List<Locais> locais;

    public MeuAdapter(Context context, ArrayList<Locais> list) {
        super(context, 0, list);
        this.context = context;
        locais = list;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(context).
                    inflate(R.layout.layout_lista, parent, false);

        }

        Locais nomeLocal = locais.get(position);
        TextView nome = listItem.findViewById(R.id.text_view_nome);
        nome.setText(nomeLocal.getNome());

        TextView distancia = listItem.findViewById(R.id.text_view_distancia);
        distancia.setText(nomeLocal.getDistancia());

        ImageView imageLocal = listItem.findViewById(R.id.imageView);
        Picasso.get().load(nomeLocal.getImgScr()).resize(120,100).centerCrop().into(imageLocal);

        return listItem;
    }

}