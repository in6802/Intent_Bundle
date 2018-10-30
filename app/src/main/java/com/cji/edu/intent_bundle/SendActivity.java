package com.cji.edu.intent_bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SendActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

        Bundle bundle = getIntent().getExtras();
        textView = findViewById(R.id.textViewName);
        textView.setText(bundle.getString("singleName", "NO DATA"));
    }
}
