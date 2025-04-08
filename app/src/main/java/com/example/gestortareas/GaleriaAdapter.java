package com.example.gestortareas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GaleriaAdapter extends RecyclerView.Adapter<GaleriaAdapter.ViewHolder> {

    private final String[] imagenes;

    public GaleriaAdapter(String[] imagenes) {
        this.imagenes = imagenes;
    }

    @NonNull
    @Override
    public GaleriaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_imagen, parent, false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull GaleriaAdapter.ViewHolder holder, int position) {
        holder.texto.setText(imagenes[position]);
    }

    @Override
    public int getItemCount() {
        return imagenes.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView texto;

        public ViewHolder(View itemView) {
            super(itemView);
            texto = itemView.findViewById(R.id.texto_imagen);
        }
    }
}
