package com.example.exercciopontoturistco.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.exercciopontoturistco.Modelos.Locais;
import com.example.exercciopontoturistco.R;

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
        return listItem;
    }
}