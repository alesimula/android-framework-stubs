package com.android.internal.widget.remotecompose.player.platform;

public class SensorSupport {
    android.hardware.Sensor mAcc;
    android.hardware.Sensor mGyro;
    android.hardware.Sensor mLight;
    android.hardware.SensorEventListener mListener;
    android.hardware.Sensor mMag;
    com.android.internal.widget.remotecompose.player.platform.RemoteComposeView mRemoteComposeView;
    android.hardware.SensorManager mSensorManager;
    public SensorSupport() {}
    private void registerListener() {}
    public void setupSensors(android.content.Context p0, com.android.internal.widget.remotecompose.player.platform.RemoteComposeView p1) {}
    public void unregisterListener() {}
}
