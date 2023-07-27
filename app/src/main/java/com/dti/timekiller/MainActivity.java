package com.dti.timekiller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button playButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playButton = findViewById(R.id.buttonPlay); // замените R.id.your_button_id на реальный идентификатор кнопки
        playButton.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.play_button)));
        playButton.setOnClickListener(v->{

            Intent intent = new Intent(MainActivity.this, GameMainActivity.class);
            startActivity(intent);
        });


    }
}