package android.hardware.biometrics.common;

public final class AuthenticateReason implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.common.AuthenticateReason> CREATOR = null;
    public static final int faceAuthenticateReason = 1;
    public static final int fingerprintAuthenticateReason = 2;
    public static final int vendorAuthenticateReason = 0;
    private int _tag;
    private java.lang.Object _value;
    public AuthenticateReason() {}
    private AuthenticateReason(int p0, java.lang.Object p1) {}
    private AuthenticateReason(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    private int describeContents(java.lang.Object p0) { return 0; }
    public static android.hardware.biometrics.common.AuthenticateReason faceAuthenticateReason(int p0) { return null; }
    public static android.hardware.biometrics.common.AuthenticateReason fingerprintAuthenticateReason(int p0) { return null; }
    public static android.hardware.biometrics.common.AuthenticateReason vendorAuthenticateReason(android.hardware.biometrics.common.AuthenticateReason.Vendor p0) { return null; }
    public int describeContents() { return 0; }
    public int getFaceAuthenticateReason() { return 0; }
    public int getFingerprintAuthenticateReason() { return 0; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public android.hardware.biometrics.common.AuthenticateReason.Vendor getVendorAuthenticateReason() { return null; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setFaceAuthenticateReason(int p0) {}
    public void setFingerprintAuthenticateReason(int p0) {}
    public void setVendorAuthenticateReason(android.hardware.biometrics.common.AuthenticateReason.Vendor p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Face {
        public static final int ALTERNATE_BIOMETRIC_BOUNCER_SHOWN = 4;
        public static final int ASSISTANT_VISIBLE = 3;
        public static final int NOTIFICATION_PANEL_CLICKED = 5;
        public static final int OCCLUDING_APP_REQUESTED = 6;
        public static final int PICK_UP_GESTURE_TRIGGERED = 7;
        public static final int PRIMARY_BOUNCER_SHOWN = 2;
        public static final int QS_EXPANDED = 8;
        public static final int STARTED_WAKING_UP = 1;
        public static final int SWIPE_UP_ON_BOUNCER = 9;
        public static final int UDFPS_POINTER_DOWN = 10;
        public static final int UNKNOWN = 0;
    }

    public static @interface Fingerprint {
        public static final int UNKNOWN = 0;
    }

    public static @interface Tag {
        public static final int faceAuthenticateReason = 1;
        public static final int fingerprintAuthenticateReason = 2;
        public static final int vendorAuthenticateReason = 0;
    }

    public static class Vendor implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.biometrics.common.AuthenticateReason.Vendor> CREATOR = null;
        public final android.os.ParcelableHolder extension = null;
        public Vendor() {}
        private int describeContents(java.lang.Object p0) { return 0; }
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
