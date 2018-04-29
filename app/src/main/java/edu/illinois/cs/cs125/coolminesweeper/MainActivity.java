package edu.illinois.cs.cs125.coolminesweeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import edu.illinois.cs.cs125.coolminesweeper.GameEngine;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickReStart();
    }

    public Button reStart;

    public void clickReStart() {
        reStart = findViewById(R.id.reStart);
        reStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GameEngine.createGrid(GameEngine.context);
            }
        });


    }
}
