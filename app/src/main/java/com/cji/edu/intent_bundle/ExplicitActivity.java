package com.cji.edu.intent_bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExplicitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);

        //번들 받아옴
        Bundle bundle = getIntent().getExtras();
        TextView textView = findViewById(R.id.singleName);
        textView.setText(bundle.getString("singleName", "No Data"));
    }
}
