package com.cji.edu.intent_bundle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonExplicitIntent, buttonSend;
    EditText editTextName, editTextAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonExplicitIntent = findViewById(R.id.buttonExplicitIntent);
        buttonExplicitIntent.setOnClickListener(this);

        buttonSend = findViewById(R.id.buttonSend);
        buttonSend.setOnClickListener(this);

        editTextName = findViewById(R.id.editTextName);
        editTextAge = findViewById(R.id.editTextAge);
    }

    @Override
    public void onClick(View view) {

        //번들 생성
        Bundle bundle = new Bundle();

        switch( view.getId() ) {
            case R.id.buttonExplicitIntent:
            String text = ((Button) view).getText().toString();

            //번들에 넣기
            bundle.putString("singleName", text);
            break;

            case R.id.buttonSend:
                String name = editTextName.getText().toString();
                //Integer age = editTextAge.getText();

                //번들에 넣기
                bundle.putString("name", name);
                //bundle.putInt("age", age);


                break;

        }

        //인텐트에 번들 넣기
        Intent intent = new Intent(this, ExplicitActivity.class);
        intent.putExtras(bundle);

        //액티비티 시작
        startActivity(intent);
    }
}
