package com.chrisantusbagus202102312.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tampilTelepon(View view) {
        Intent TeleponIntent = new Intent(Intent.ACTION_DIAL);
        startActivity(TeleponIntent);
    }

    public void tampilSms(View view) {
        Intent smsIntent = new Intent(Intent.ACTION_DIAL);
        smsIntent.addCategory(Intent.CATEGORY_APP_MESSAGING);
        startActivity(smsIntent);
    }

    public void tampilKalender (View view) {
        Intent KalenderIntent = new Intent(Intent.ACTION_MAIN);
        KalenderIntent.addCategory(Intent.CATEGORY_APP_CALENDAR);
        startActivity(KalenderIntent);
    }

    public void tampilbrowser (View view) {
        Intent BrowserIntent = new Intent(Intent.ACTION_MAIN);
        BrowserIntent.addCategory(Intent.CATEGORY_APP_BROWSER);
        startActivity(BrowserIntent);
    }

    public void tampilKalkulator (View view)
    {
        try {
            Intent KalkulatorIntent = new Intent(Intent.ACTION_MAIN);
            KalkulatorIntent.addCategory(Intent.CATEGORY_LAUNCHER);

            ComponentName cn = new ComponentName("com.android.calculator2", "com.android.calculator2.calculator");
            KalkulatorIntent.setComponent(cn);

            startActivity(KalkulatorIntent);
        }
        catch (ActivityNotFoundException anfe)
        {
            Toast.makeText(getApplicationContext(), "Aplikasi Tidak Ditemukan", Toast.LENGTH_LONG).show();
        }
    }

    public void tampilKontak(View view) {
        Intent KontakIntent = new Intent(Intent.ACTION_MAIN);
        KontakIntent.addCategory(Intent.CATEGORY_APP_CONTACTS);
        startActivity(KontakIntent);
    }

    public void tampilGaleri(View view) {
        Intent galeriIntent = new Intent(Intent.ACTION_MAIN);
        galeriIntent.addCategory(Intent.CATEGORY_APP_GALLERY);
        startActivity(galeriIntent);
    }

    public void tampilWifi (View view) {
        Intent WifiIntent = new Intent(Settings.ACTION_WIFI_SETTINGS);
        startActivity(WifiIntent);
    }

    public void tampilSound (View view) {
        Intent SoundIntent = new Intent(Settings.ACTION_SOUND_SETTINGS);
        startActivity(SoundIntent);
    }

    public void tampilAirplane (View view) {
        Intent AirplaneIntent = new Intent(Settings.ACTION_AIRPLANE_MODE_SETTINGS);
        startActivity(AirplaneIntent);
    }

    public void tampilAplikasi (View view) {
        Intent AplikasiIntent = new Intent(Settings.ACTION_APPLICATION_SETTINGS);
        startActivity(AplikasiIntent);
    }

    public void tampilBluetooth (View view) {
        Intent BluetoothIntent = new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
        startActivity(BluetoothIntent);
    }
}