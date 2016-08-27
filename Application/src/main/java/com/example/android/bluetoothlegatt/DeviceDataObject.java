package com.example.android.bluetoothlegatt;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Created by AK00472758 on 8/21/2016.
 */
public class DeviceDataObject implements Serializable {
    private String deviceId;
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
