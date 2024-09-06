package com.example.myone;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.skydoves.colorpickerview.ColorPickerView;

public class MainActivity extends AppCompatActivity {

    private ColorPickerView colorPickerView;
    private boolean FLAG_PALETTE = false;
    private boolean FLAG_SELECTOR = false;

    private PowerMenu powerMenu;
    private final OnMenuItemClickListener<PowerMenuItem> powerMenuItemClickListener =
            new OnMenuItemClickListener<>() {
                @Override
                public void onItemClick(int position, PowerMenuItem item) {
                    switch (position) {
                        case 1:
                            palette();
                            break;
                        case 2:
                            paletteFromGallery();
                            break;
                        case 3:
                            selector();
                            break;
                        case 4:
                            dialog();
                            break;
                    }
                    powerMenu.dismiss();
                }
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}