package com.example.instagaram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<PostModel>postModelList;
    List<StoryModel>storyModelList;
    List<ShortsModel>shortsModelList;
    RecyclerView postReci, storyReci, shortsReci;
    PostAdapter postAdapter;
    StoryAdapter storyAdapter;
    ShortsAdapter shortsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setList();
        initViews();
        postAdapter = new PostAdapter(postModelList);
        storyAdapter = new StoryAdapter(storyModelList);
        shortsAdapter = new ShortsAdapter(shortsModelList);

        postReci.setAdapter(postAdapter);
        storyReci.setAdapter(storyAdapter);
        shortsReci.setAdapter(shortsAdapter);

    }

    private void initViews() {

        postReci = findViewById(R.id.recyclerView2);
        storyReci = findViewById(R.id.recyclerView);
        shortsReci = findViewById(R.id.shortsReci);
    }

    private void setList() {
        postModelList = new ArrayList<>();
        postModelList.add(new PostModel(R.drawable.fase_1,R.drawable.land_1,"Abdulloh","3 days ago","24"));
        postModelList.add(new PostModel(R.drawable.baby_1,R.drawable.land_2,"Muhammad Iso","2 days ago","23"));
        postModelList.add(new PostModel(R.drawable.baby_2,R.drawable.land_3,"Zafarbek","1 days ago","23"));
        postModelList.add(new PostModel(R.drawable.baby_3,R.drawable.land_4,"Asadbek","5 days ago","24"));
        postModelList.add(new PostModel(R.drawable.baby_2,R.drawable.face,"Muhammad Aziz","3 days ago","24"));
        postModelList.add(new PostModel(R.drawable.baby_1,R.drawable.land_3,"Ahmadillo","3 days ago","24"));

        storyModelList = new ArrayList<>();
        storyModelList.add(new StoryModel(R.drawable.plus,true));
        storyModelList.add(new StoryModel(R.drawable.face_2,true));
        storyModelList.add(new StoryModel(R.drawable.face_3,true));
        storyModelList.add(new StoryModel(R.drawable.face_4,true));
        storyModelList.add(new StoryModel(R.drawable.fase_1,true));
        storyModelList.add(new StoryModel(R.drawable.face_2,true));
        storyModelList.add(new StoryModel(R.drawable.face_3,true));
        storyModelList.add(new StoryModel(R.drawable.face_4,true));
        storyModelList.add(new StoryModel(R.drawable.fase_1,true));

        shortsModelList = new ArrayList<>();
        shortsModelList.add(new ShortsModel("Rocky Mountian",R.drawable.mountain));
        shortsModelList.add(new ShortsModel("Nature",R.drawable.nature));
        shortsModelList.add(new ShortsModel("The Ocean",R.drawable.ocean));
        shortsModelList.add(new ShortsModel("The beach",R.drawable.beach));
        shortsModelList.add(new ShortsModel("Rocky Mountian",R.drawable.mountain));
    }
}