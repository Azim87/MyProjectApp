package com.kubatov.testwork.ActivitiesFolder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.kubatov.testwork.R;

public class Main2Activity extends AppCompatActivity {

    Button buttonToTripActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonToTripActivity = (Button) findViewById(R.id.go_btn);
        buttonToTripActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);
            }
        });
    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }
}
