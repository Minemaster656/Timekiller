package com.dti.timekiller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Game3InARow extends AppCompatActivity {
    Button[][] cells = new Button[7][7];
    int[][] cellGemTypes = new int[7][7];
    String TAG = "Game3InARow";
    Resources res ;
    String packageName ;
    public int colorRed=R.color.gem_red;
    public int colorGreen=R.color.gem_blue;
    public int colorBlue=R.color.gem_green;
    public int colorCyan=R.color.gem_cyan;
    public int colorPink=R.color.gem_pink;
    public int colorPurple=R.color.gem_purple;
    public int colorYellow=R.color.gem_yellow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_3_in_arow);
        res = getResources();
        packageName = getPackageName();


//        for (int i = 0; i < 7; i++) {
//            for (int j = 0; j < 7; i++) {
//                cellGemTypes[i][j]=0;
//            }
//        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                String viewIdName = "cell_" + i + "_" + j;
                int viewId = res.getIdentifier(viewIdName, "id", packageName);

                if (viewId != 0) {
                    cells[i][j] = findViewById(viewId);
                    cells[i][j].setVisibility(View.VISIBLE);
                    cells[i][j].setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.android)));
                    cellGemTypes[i][j]=1;
                }

            }
            String layer= "";
            for (int h:cellGemTypes[i]
                 ) {
                layer+=h+" ";
            }
            Log.d(TAG, layer);
        }
        updateCells();
    }
    public void updateCells(){
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                String viewIdName = "cell_" + i + "_" + j;
                int viewId = res.getIdentifier(viewIdName, "id", packageName);

                if (viewId != 0) {
                    int clr = 0;
                    switch (cellGemTypes[i][j]){
                        case 1:clr=colorRed;
                            break;
                        case 2:clr=colorGreen;

                            break;
                        case 3:clr=colorBlue;

                            break;
                        case 4:clr=colorCyan;

                            break;
                        case 5:clr=colorPink;

                            break;
                        case 6:clr=colorPurple;

                            break;
                        case 7:clr=colorYellow;

                            break; default:clr=R.color.android;break;
                    }
                    cells[i][j].setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, clr)));

                }

            }
            String layer= "";
            for (int h:cellGemTypes[i]
            ) {
                layer+=h+" ";
            }
            Log.d(TAG, layer);
        }
    }
}