package com.example.vardan.week4exercices2drawer.dialogFragment;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vardan.week4exercices2drawer.R;
import com.example.vardan.week4exercices2drawer.adapter.DescriptionAdapter;
import com.example.vardan.week4exercices2drawer.adapter.ImagePagerAdapter;


public class ViewPagerDialogFragment extends DialogFragment {
    private static int position;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        if (getArguments() != null) {
            position = getArguments().getInt(DescriptionAdapter.IMAGE_KEY);
        }
        View view = inflater.inflate(R.layout.view_pager_item, container, false);
        final ViewPager viewPager = view.findViewById(R.id.view_pager);
        ImagePagerAdapter imagePagerAdapter = new ImagePagerAdapter(getDialog().getContext());
        viewPager.setAdapter(imagePagerAdapter);
        viewPager.setCurrentItem(position);
        return view;
    }
}
