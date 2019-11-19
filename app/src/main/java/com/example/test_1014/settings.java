package com.example.test_1014;

import android.bluetooth.le.AdvertiseSettings;

public class settings {
    public AdvertiseSettings generateADSettings() {
        AdvertiseSettings.Builder builder = new AdvertiseSettings.Builder();
        builder.setConnectable(false);
        builder.setAdvertiseMode(AdvertiseSettings.ADVERTISE_MODE_LOW_POWER);
        builder.setTxPowerLevel(AdvertiseSettings.ADVERTISE_TX_POWER_MEDIUM);
        builder.setTimeout(0);  //A value of 0 will disable the time limit.
        return builder.build();
    }
}
