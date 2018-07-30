package com.example.vardan.week4exercices2drawer.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.vardan.week4exercices2drawer.R;
import com.example.vardan.week4exercices2drawer.provider.MyProvider;
import com.squareup.picasso.Picasso;

public class ImagePagerAdapter extends PagerAdapter {

    private Context context;
    private String[] array = MyProvider.getItemPosition().getImageUrl();

    public ImagePagerAdapter(Context context) {
        this.context = context;

    }

    @Override
    public int getCount() {
        return array.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.image_pager, container, false);
        ImageView imageView = view.findViewById(R.id.image_for_pager);
        Picasso.get().load(array[position]).into(imageView);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
