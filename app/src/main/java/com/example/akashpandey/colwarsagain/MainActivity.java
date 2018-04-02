package com.example.akashpandey.colwarsagain;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    int sprite = 0;
    int coke = 0;
    VideoView video;
    MediaController mediac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        video =(VideoView)findViewById(R.id.videoView2);
        mediac = new MediaController(this);
    }
    public void videoplay(View view) {
        String path = "android.resource://com.example.akashpandey.colwarsagain/"+R.raw.laee;
        /**
         * Uri standends for uniform resouce identifier
         * I use this because it is a string of characters used for identifing the resource*/
        Uri uri = Uri.parse(path);
        video.setVideoURI(uri);
        video.setMediaController(mediac);
        mediac.setAnchorView(video);
        video.start();
    }

    public void spriteincrease(View view) {

        sprite=sprite+1;
    }

    public void cokeincrease(View view) {
        coke =coke+1;
            }

    public void printresult(View view)
    {
        display(sprite,coke);
    }
    private void display(int sprite,int coke){
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(" Sprite is :"+sprite+" Coke is : "+coke);

    }
}
