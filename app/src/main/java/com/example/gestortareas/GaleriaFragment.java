package com.example.gestortareas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GaleriaFragment extends Fragment {

    public GaleriaFragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_galeria, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_galeria);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        String[] imagenes = {"Foto 1", "Foto 2", "Foto 3"};
        GaleriaAdapter adapter = new GaleriaAdapter(imagenes);
        recyclerView.setAdapter(adapter);

        return view;
    }
}