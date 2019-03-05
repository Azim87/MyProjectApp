package com.kubatov.testwork.ActivitiesFolder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.kubatov.testwork.ActivitiesFolder.TripsActivity.Trekking;
import com.kubatov.testwork.R;

public class Main3Activity extends AppCompatActivity {

    TextView trekking;
    TextView horseRiding;
    TextView offRoad;
    TextView aDayTrip;
    TextView combined;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        trekking = (TextView)findViewById(R.id.textView);
        horseRiding = (TextView)findViewById(R.id.textView_1);
        offRoad = (TextView)findViewById(R.id.textView_2);
        combined = (TextView)findViewById(R.id.textView_3);
        aDayTrip = (TextView)findViewById(R.id.textView_4);

        trekking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, Trekking.class);
                startActivity(intent);
            }
        });
        horseRiding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        offRoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        combined.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        aDayTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
