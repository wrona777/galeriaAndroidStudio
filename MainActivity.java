package com.example.aplikacja1;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });

        time();
        galeria();
        setTitle("Galeria");
    }
    void time(){
        TextView Clocker = findViewById(R.id.paton);
        SimpleDateFormat simpleTime = new SimpleDateFormat("HH:mm:ss");

        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                Date date = new Date();
                String t = simpleTime.format(date);
                Clocker.setText(t);
                handler.postDelayed(this, 1000);
            }
        });
    }

    void galeria(){
        View leftBtn = findViewById(R.id.leftbtn);
        View rightBtn = findViewById(R.id.rightbtn);


    }
}