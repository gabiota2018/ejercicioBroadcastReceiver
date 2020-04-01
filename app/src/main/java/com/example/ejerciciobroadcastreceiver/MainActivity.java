package com.example.ejerciciobroadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && checkSelfPermission(Manifest.permission.CALL_PHONE) !=
                (PackageManager.PERMISSION_GRANTED)) {
            requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 1000);
        }
        Intent i;
        i = new Intent(this,Llamada.class);
        startActivity(i);
    }


}
