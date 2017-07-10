package com.example.brandellpetty.brandell2017summer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.brandellpetty.brandell2017summer.controller.TestAudioController;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TestAudioActivity extends BaseActivity {

    private TestAudioController controller;
    private String audioURL = "http://other.web.rh01.sycdn.kuwo.cn/resource/n3/77/1/1061700123.mp3";

    @BindView(R.id.activity_test_audio_play)
    Button playBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_audio);
        ButterKnife.bind(this);
        controller = new TestAudioController(this, new TestAudioController.AudioListener(){
            @Override
            public void onPlaying() {
                playBT.setText("Pause");
                playBT.setClickable(true);
            }

            @Override
            public void onLoading() {
                playBT.setText("Loading");
                playBT.setClickable(false);
            }

            @Override
            public void onPaused() {
                playBT.setText("Play");
                playBT.setClickable(true);

            }
        });

        playBT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                switch (TestAudioController.STATUS){
                    case TestAudioController.AudioPlaying:
                        controller.pause(audioURL);
                        break;
                    case TestAudioController.AudioPaused:
                        controller.play(audioURL);
                        break;
                    default:

                }
                if (TestAudioController.STATUS == TestAudioController.AudioPaused){
                    controller.play(audioURL);
                }
            }
        });
    }
}
