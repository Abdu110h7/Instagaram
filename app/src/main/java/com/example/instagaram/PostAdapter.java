package com.example.instagaram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder>{

    List<PostModel>list;

    public PostAdapter(List<PostModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_instagaram,parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.like.setText(String.valueOf(list.get(position).getLike()));
       holder.personName.setText(list.get(position).getPersonName());
       holder.actionTime.setText(list.get(position).getAction_Time());
       holder.avatar.setImageResource(list.get(position).getAvatar());
       holder.mainPicture.setImageResource(list.get(position).getMainPicture());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
        CircleImageView avatar;
        ImageView mainPicture;
        TextView like,personName,actionTime;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);

            avatar = itemView.findViewById(R.id.circleImageView);
            like = itemView.findViewById(R.id.like);
            personName = itemView.findViewById(R.id.personName);
            actionTime = itemView.findViewById(R.id.time);
            mainPicture = itemView.findViewById(R.id.mainImage);
        }
    }

}

