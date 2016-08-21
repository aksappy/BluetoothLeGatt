package com.example.android.bluetoothlegatt;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by AK00472758 on 8/21/2016.
 */
public class DeviceDataObject implements Serializable {
    private String deviceId;
    private byte[] data;

    @Override
    public String toString() {
        return "DeviceDataObject{" +
                "deviceId='" + deviceId + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
