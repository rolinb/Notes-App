package com.example.android.shortnotes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView math = (TextView) findViewById(R.id.math);

        // Set a click listener on that View
        math.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent mathIntent = new Intent(MainActivity.this, MathActivity.class);

                // Start the new activity
                startActivity(mathIntent);
            }
        });

        TextView astronomy = (TextView) findViewById(R.id.astronomy);

        astronomy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent astroIntent = new Intent(MainActivity.this, AstroActivity.class);
                startActivity(astroIntent);
            }
        });
    }
}
