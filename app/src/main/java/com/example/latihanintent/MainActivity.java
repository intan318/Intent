package com.example.latihanintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnMove)
    Button btnMove;
    @BindView(R.id.btnData)
    Button btnData;
    @BindView(R.id.btnObject)
    Button btnObject;
    @BindView(R.id.btnCallback)
    Button btnCallback;
    @BindView(R.id.btnWeb)
    Button btnWeb;
    @BindView(R.id.btnDial)
    Button btnDial;

    public static Integer REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btnMove, R.id.btnData, R.id.btnObject, R.id.btnCallback, R.id.btnWeb, R.id.btnDial})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnMove:
                moveActivity();
                break;
            case R.id.btnData:
                moveData();
                break;
            case R.id.btnObject:
                moveObject();
                break;
            case R.id.btnCallback:
                moveCallback();
                break;
            case R.id.btnWeb:
                moveWeb();
                break;
            case R.id.btnDial:
                moveDial();
                break;
        }
    }

    private void moveDial() {

        Intent i = new Intent (this, DialActivity.class);
        startActivity(i);
//        EditText etNoTelp;
//        Button btnTelp;
//
//        etNoTelp = findViewById(R.id.etPhoneNo);
//        btnTelp = findViewById(R.id.btnDial);
//
//        btnTelp.setOnClickListener(view -> {
//            String number = etNoTelp.getText().toString();
//            Intent callIntent = new Intent(Intent.ACTION_CALL);
//            callIntent.setData(Uri.parse("tel:"+number));
////            Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", number, null));
//            startActivity(callIntent);
//        });
    }

    private void moveWeb() {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(browserIntent);

    }

    private void moveCallback() {
        Intent i = new Intent (this, CallbackActivity.class);
        startActivityForResult(i, REQUEST_CODE);
    }

    private void moveObject() {
        DataPerson data = new DataPerson("Intan", 19, "Cinere");
        Intent i = new Intent (this, ObjectActivity.class);
        i.putExtra("data",data);
        startActivity(i);
    }

    private void moveData() {
        Intent i = new Intent(MainActivity.this, DataActivity.class);
        i.putExtra("nama", "Intan");
        i.putExtra("umur", "20tahun");
        i.putExtra("alamat", "Cinere");
        startActivity(i);

    }

    private void moveActivity() {
        Intent i = new Intent(this, MoveActivity.class);
        startActivity(i);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //di method ini melakukan pengecekan
        if (requestCode == REQUEST_CODE){
            if (resultCode == RESULT_OK){
                Toast.makeText(this, data.getStringExtra("RESULT"), Toast.LENGTH_SHORT).show();


            }
        }
    }
}
