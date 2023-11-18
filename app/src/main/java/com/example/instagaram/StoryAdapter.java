package com.example.instagaram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryViewHolder> {

    List<StoryModel> list;

    public StoryAdapter(List<StoryModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public StoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.story_instagaram,parent,false);
        return new StoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryViewHolder holder, int position) {
        holder.story_avatar.setImageResource(list.get(position).getPicture());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class StoryViewHolder extends  RecyclerView.ViewHolder {

        ImageView story_avatar;
        public StoryViewHolder(@NonNull View itemView) {
            super(itemView);
            story_avatar = itemView.findViewById(R.id.story_Avatar);
        }
    }
}
