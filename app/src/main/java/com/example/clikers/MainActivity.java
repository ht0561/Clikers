package com.example.clikers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button sarbach;
    int sarbach2=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sarbach= (Button) findViewById(R.id.button2 );

    }

    public void go(View view) {
        sarbach2++;
        if (sarbach2<6){
            sarbach.setText ("this is click number:"+ sarbach2);

        }
        else{
            sarbach.setText("Enough to click. Go to new start!");
            sarbach2=0;
        }



    }
}