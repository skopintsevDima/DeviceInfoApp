package com.mypet.deviceinfoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvDeviceInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        tvDeviceInfo = findViewById(R.id.tv_device_info);
        String deviceInfo =
                "OS_NAME: " + Utils.OS_NAME + "\n" +
                "OS_VERSION: " + Utils.OS_VERSION + "\n" +
                "RELEASE: " + Utils.RELEASE + "\n" +
                "DEVICE: " + Utils.DEVICE + "\n" +
                "MODEL: " + Utils.MODEL + "\n" +
                "PRODUCT: " + Utils.PRODUCT + "\n" +
                "BRAND: " + Utils.BRAND + "\n" +
                "DISPLAY: " + Utils.DISPLAY + "\n" +
                "CPU_ABI: " + Utils.CPU_ABI + "\n" +
                "CPU_ABI2: " + Utils.CPU_ABI2 + "\n" +
                "UNKNOWN: " + Utils.UNKNOWN + "\n" +
                "HARDWARE: " + Utils.HARDWARE + "\n" +
                "ID: " + Utils.ID + "\n" +
                "MANUFACTURER: " + Utils.MANUFACTURER + "\n" +
                "SERIAL: " + Utils.SERIAL + "\n" +
                "USER: " + Utils.USER + "\n" +
                "HOST: " + Utils.HOST;
        tvDeviceInfo.setText(deviceInfo);
    }
}
