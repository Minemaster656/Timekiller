package com.dti.timekiller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.widget.Button;

public class GameMainActivity extends AppCompatActivity {


    Button play3InARowutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_main);
        play3InARowutton = findViewById(R.id.play3InARow); // замените R.id.your_button_id на реальный идентификатор кнопки
        play3InARowutton.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.play_button)));
        play3InARowutton.setOnClickListener(v->{

            Intent intent = new Intent(GameMainActivity.this, Game3InARow.class);
            startActivity(intent);
        });
    }
}