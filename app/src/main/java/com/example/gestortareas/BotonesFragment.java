package com.example.gestortareas;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BotonesFragment extends Fragment {

    public BotonesFragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_botones, container, false);

        Button btnColor = view.findViewById(R.id.btn_color);
        Button btnToast = view.findViewById(R.id.btn_toast);
        Button btnReset = view.findViewById(R.id.btn_reset);

        btnColor.setOnClickListener(v -> view.setBackgroundColor(Color.YELLOW));

        btnToast.setOnClickListener(v -> Toast.makeText(getContext(), "¡Botón presionado!", Toast.LENGTH_SHORT).show());

        btnReset.setOnClickListener(v -> view.setBackgroundColor(Color.WHITE));

        return view;
    }
}