package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickHandler(View view) {

        EditText sampleTextField = (EditText) findViewById(R.id.sampleTextField);
        Toast.makeText(MainActivity.this, sampleTextField.getText().toString(), Toast.LENGTH_LONG).show();

        Log.i("Info", "Button pressed");
    }
}
