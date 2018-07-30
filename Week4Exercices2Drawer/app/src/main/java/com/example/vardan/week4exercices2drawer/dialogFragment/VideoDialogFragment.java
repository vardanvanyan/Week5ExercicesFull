package com.example.vardan.week4exercices2drawer.dialogFragment;

import android.app.DialogFragment;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.vardan.week4exercices2drawer.R;
import com.example.vardan.week4exercices2drawer.provider.MyProvider;


public class VideoDialogFragment extends DialogFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.item_video_dialog,container,false);
       setUpVideoView(view);
       return view;
    }
    private void setUpVideoView(View view) {
        final VideoView videoView = view.findViewById(R.id.video_view);
        videoView.setVideoURI(Uri.parse(MyProvider.getItemPosition().getVideoUrl()));
        MediaController mediaController = new MediaController(getDialog().getContext());
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}
