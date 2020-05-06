package com.hidsterichdev.customtogglebutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.jackandphantom.customtogglebutton.CustomToggle;

public class MainActivity extends AppCompatActivity {

    private CustomToggle customToggle1, customToggle2, customToggle3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customToggle1 = (CustomToggle) findViewById(R.id.toggle_custom1);
        customToggle2 = (CustomToggle) findViewById(R.id.toggle_custom2);
        customToggle3 = (CustomToggle) findViewById(R.id.toggle_custom3);

        customToggle1.setOnToggleClickListener(new CustomToggle.OnToggleClickListener() {
            @Override
            public void onLefToggleEnabled(boolean enabled) {
                Toast.makeText(MainActivity.this, "Kamu dibagian Kiri", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onRightToggleEnabled(boolean enabled) {
                Toast.makeText(MainActivity.this, "Kamu dibagian Kanan", Toast.LENGTH_SHORT).show();
            }
        });

        customToggle2.setOnToggleClickListener(new CustomToggle.OnToggleClickListener() {
            @Override
            public void onLefToggleEnabled(boolean enabled) {
                Toast.makeText(MainActivity.this, "Kamu dibagian Kiri", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onRightToggleEnabled(boolean enabled) {
                Toast.makeText(MainActivity.this, "Kamu dibagian Kanan", Toast.LENGTH_SHORT).show();
            }
        });

        customToggle3.setOnToggleClickListener(new CustomToggle.OnToggleClickListener() {
            @Override
            public void onLefToggleEnabled(boolean enabled) {
                Toast.makeText(MainActivity.this, "Kamu dibagian Kiri", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onRightToggleEnabled(boolean enabled) {
                Toast.makeText(MainActivity.this, "Kamu dibagian Kanan", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
