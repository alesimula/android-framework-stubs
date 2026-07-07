package android.media;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public final class BluetoothProfileConnectionInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.BluetoothProfileConnectionInfo> CREATOR = null;
    private final boolean mIsLeOutput = false;
    private final int mProfile = 0;
    private final boolean mSupprNoisy = false;
    private final int mVolume = 0;
    public BluetoothProfileConnectionInfo(int p0) {}
    private BluetoothProfileConnectionInfo(int p0, boolean p1, int p2, boolean p3) {}
    public static android.media.BluetoothProfileConnectionInfo createA2dpInfo(boolean p0, int p1) { return null; }
    public static android.media.BluetoothProfileConnectionInfo createA2dpSinkInfo(int p0) { return null; }
    public static android.media.BluetoothProfileConnectionInfo createHearingAidInfo(boolean p0) { return null; }
    public static android.media.BluetoothProfileConnectionInfo createHfpInfo() { return null; }
    public static android.media.BluetoothProfileConnectionInfo createLeAudioInfo(boolean p0, boolean p1) { return null; }
    public static android.media.BluetoothProfileConnectionInfo createLeAudioOutputInfo(boolean p0, int p1) { return null; }
    public static android.media.BluetoothProfileConnectionInfo createLeAudioPeripheralInfo(boolean p0) { return null; }
    public int describeContents() { return 0; }
    public int getProfile() { return 0; }
    public int getVolume() { return 0; }
    public boolean isLeOutput() { return false; }
    public boolean isSuppressNoisyIntent() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
