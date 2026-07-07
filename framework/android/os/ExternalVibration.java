package android.os;

public class ExternalVibration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.ExternalVibration> CREATOR = null;
    private static final java.lang.String TAG = "ExternalVibration";
    private android.media.AudioAttributes mAttrs;
    private android.os.IExternalVibrationController mController;
    private java.lang.String mPkg;
    private android.os.IBinder mToken;
    private int mUid;
    public ExternalVibration(int p0, java.lang.String p1, android.media.AudioAttributes p2, android.os.IExternalVibrationController p3) {}
    public ExternalVibration(int p0, java.lang.String p1, android.media.AudioAttributes p2, android.os.IExternalVibrationController p3, android.os.IBinder p4) {}
    private ExternalVibration(android.os.Parcel p0) {}
    private static android.media.AudioAttributes readAudioAttributes(android.os.Parcel p0) { return null; }
    private static void writeAudioAttributes(android.media.AudioAttributes p0, android.os.Parcel p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    public java.lang.String getPackage() { return null; }
    public android.os.IBinder getToken() { return null; }
    public int getUid() { return 0; }
    public android.os.VibrationAttributes getVibrationAttributes() { return null; }
    public void linkToDeath(android.os.IBinder.DeathRecipient p0) {}
    public boolean mute() { return false; }
    public java.lang.String toString() { return null; }
    public void unlinkToDeath(android.os.IBinder.DeathRecipient p0) {}
    public boolean unmute() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
