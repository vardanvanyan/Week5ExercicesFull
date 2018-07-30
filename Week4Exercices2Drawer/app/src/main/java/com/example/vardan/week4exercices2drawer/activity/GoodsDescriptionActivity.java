package com.example.vardan.week4exercices2drawer.activity;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vardan.week4exercices2drawer.R;
import com.example.vardan.week4exercices2drawer.adapter.DescriptionAdapter;
import com.example.vardan.week4exercices2drawer.dialogFragment.VideoDialogFragment;
import com.example.vardan.week4exercices2drawer.model.ListModel;
import com.example.vardan.week4exercices2drawer.provider.MyProvider;
import com.squareup.picasso.Picasso;


public class GoodsDescriptionActivity extends AppCompatActivity {


    private static final String VIDEO_TAG = "video";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_description);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getVideoDialog();


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        final ListModel listModel = MyProvider.getItemPosition();
        RecyclerView recycler = findViewById(R.id.goods_recycler);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        DescriptionAdapter adapter = new DescriptionAdapter(this, listModel.getImageUrl());
        recycler.setAdapter(adapter);

        ImageView background = findViewById(R.id.col_image_id);
        Picasso.get().load(listModel.getImageUrl()[0]).into(background);

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setTitle(listModel.getTitle());


        TextView textView = findViewById(R.id.item_description_id);
        textView.setText(listModel.getDescription());
    }

    private void getVideoDialog() {
        final android.app.FragmentManager fragmentManager = getFragmentManager();
        ImageButton imageButton = findViewById(R.id.video_button);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.app.DialogFragment dialogFragment = new VideoDialogFragment();
                dialogFragment.show(fragmentManager,VIDEO_TAG);
            }
        });
    }
}
