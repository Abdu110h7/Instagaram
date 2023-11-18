package com.example.instagaram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ShortsAdapter extends RecyclerView.Adapter<ShortsAdapter.ShortsViewHolder> {

    List<ShortsModel>list;

    public ShortsAdapter(List<ShortsModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ShortsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shorts_instagaram,parent,false);
        return new ShortsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShortsViewHolder holder, int position) {
        holder.shortsImage.setImageResource(list.get(position).getAvatar());
        holder.name.setText(String.valueOf(list.get(position).getName()));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ShortsViewHolder extends  RecyclerView.ViewHolder {
        ImageView shortsImage;
        TextView name;

        public ShortsViewHolder(@NonNull View itemView) {
            super(itemView);
            shortsImage = itemView.findViewById(R.id.shortsImage);
            name = itemView.findViewById(R.id.name);
        }
    }
}
