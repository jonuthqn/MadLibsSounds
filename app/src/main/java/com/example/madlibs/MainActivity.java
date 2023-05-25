package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnRing;

    private Button btnWildGeese;

    private Button btnArcade;

    private Button btnDonkeyScream;

    private Button btnSword;

    private Button btnMonkey;

    private Button btnRobot;

    private Button btnThunder;

    private Button btnGuitar;

    private Button btnWhistle;

    private Button btnToy;

    private Button btnBird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRing = findViewById(R.id.btn_ring);
        btnWildGeese = findViewById(R.id.btn_wildgeese);
        btnArcade = findViewById(R.id.btn_arcade);
        btnDonkeyScream = findViewById(R.id.btn_donkeyscream);
        btnSword = findViewById(R.id.btn_sword);
        btnMonkey = findViewById(R.id.btn_monkey);
        btnRobot = findViewById(R.id.btn_robot);
        btnThunder = findViewById(R.id.btn_thunder);
        btnGuitar = findViewById(R.id.btn_guitar);
        btnWhistle = findViewById(R.id.btn_whistle);
        btnToy = findViewById(R.id.btn_toy);
        btnBird = findViewById(R.id.btn_bird);

        btnRing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playRing();

            }
        });


    }
}

