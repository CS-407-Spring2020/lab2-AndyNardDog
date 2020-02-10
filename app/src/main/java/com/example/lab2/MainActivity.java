package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickHandler(View view) {

        EditText sampleTextField = (EditText) findViewById(R.id.sampleTextField);
//        Toast.makeText(MainActivity.this, sampleTextField.getText().toString(), Toast.LENGTH_LONG).show();

        String textFieldString = sampleTextField.getText().toString();
        goToActivity2(textFieldString);


        Log.i("Info", "Button pressed");
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
}
