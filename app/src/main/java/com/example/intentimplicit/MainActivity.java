package com.example.intentimplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void call (View view) {
        String number = "085794866964";
        Intent call = new Intent(Intent. ACTION_DIAL);
        call.setData(Uri.fromParts("tel",number,null));
        startActivity(call);
    }

    public void open (View view) {
        String url = "https://www.linkedin.com/in/fathimah-azzahro-hasni-537a8a15b" ;
        Intent openbrowser = new Intent(Intent. ACTION_VIEW);
        openbrowser.setData(Uri. parse(url));
        startActivity(openbrowser);
    }
}
