package com.example.shahajalalsamrat.myvideoview;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView=findViewById(R.id.videoviewid);


        Uri uri= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.mosharaf);
        videoView.setVideoURI(uri);

        MediaController mediaController=new MediaController(this);

        videoView.setMediaController(mediaController);

        videoView.start();
    }
}
