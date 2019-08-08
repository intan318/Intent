package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dial);


        EditText etNoTelp;
        Button btnCall;

        etNoTelp = findViewById(R.id.etPhoneNo);
        btnCall = findViewById(R.id.btnTelp);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                String number = etNoTelp.getText().toString();
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", number,null));
                startActivity(i);


            }
        });

//        String number = etNoTelp.getText().toString();
//        Intent i = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", number,null));
//        startActivity(i);

    }


}
