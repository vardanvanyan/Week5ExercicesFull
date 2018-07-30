package com.example.vardan.week4exercices2drawer.adapter;

import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.vardan.week4exercices2drawer.R;
import com.example.vardan.week4exercices2drawer.activity.GoodsDescriptionActivity;
import com.example.vardan.week4exercices2drawer.dialogFragment.ViewPagerDialogFragment;
import com.squareup.picasso.Picasso;

public class DescriptionAdapter extends RecyclerView.Adapter<DescriptionAdapter.ListViewHolder> {

    public static final String IMAGE_KEY = "image";
    private static final String IMAGE_PAGER = "imagePager";
    private Context context;
    private String[] listModels;

    public DescriptionAdapter(Context context, String[] listModels) {
        this.context = context;
        this.listModels = listModels;
    }

    @Override
    public DescriptionAdapter.ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater =
                (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        final View view = inflater.inflate(R.layout.list_description, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DescriptionAdapter.ListViewHolder holder, int position) {
        Picasso.get().load(listModels[position]).into(holder.img);
    }

    @Override
    public int getItemCount() {
        return listModels.length;
    }

    class ListViewHolder extends RecyclerView.ViewHolder {

        private ImageView img;

        ListViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.image_description);

            final FragmentManager fragmentManager = ((GoodsDescriptionActivity)context).getFragmentManager();
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    DialogFragment dialogFragment = new ViewPagerDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt(IMAGE_KEY,getAdapterPosition());
                    dialogFragment.setArguments(bundle);
                    dialogFragment.show(fragmentManager,IMAGE_PAGER);
                }
            });
        }
    }
}
