package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Button btnok;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        num1 = (EditText) findViewById(R.id.input1);
        num2 = (EditText) findViewById(R.id.input2);
        btnok = (Button) findViewById(R.id.buttonok);

        btnok.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                //set the values pass to the next act
                intent.putExtra("NUMBER1",num1.getText().toString());
                intent.putExtra("NUMBER2",num2.getText().toString());

                //implement toast message in application
                Context context = getApplicationContext();
                CharSequence message = "Saved Successfully";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context,message,duration);
                startActivity(intent);

            }
        }));
    }
}
