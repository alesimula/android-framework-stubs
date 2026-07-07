package android.hardware.biometrics.common;

public final class OperationState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.common.OperationState> CREATOR = null;
    public static final int faceOperationState = 1;
    public static final int fingerprintOperationState = 0;
    private int _tag;
    private java.lang.Object _value;
    public OperationState() {}
    private OperationState(int p0, java.lang.Object p1) {}
    private OperationState(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    private int describeContents(java.lang.Object p0) { return 0; }
    public static android.hardware.biometrics.common.OperationState faceOperationState(android.hardware.biometrics.common.OperationState.FaceOperationState p0) { return null; }
    public static android.hardware.biometrics.common.OperationState fingerprintOperationState(android.hardware.biometrics.common.OperationState.FingerprintOperationState p0) { return null; }
    public int describeContents() { return 0; }
    public android.hardware.biometrics.common.OperationState.FaceOperationState getFaceOperationState() { return null; }
    public android.hardware.biometrics.common.OperationState.FingerprintOperationState getFingerprintOperationState() { return null; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setFaceOperationState(android.hardware.biometrics.common.OperationState.FaceOperationState p0) {}
    public void setFingerprintOperationState(android.hardware.biometrics.common.OperationState.FingerprintOperationState p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class FaceOperationState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.biometrics.common.OperationState.FaceOperationState> CREATOR = null;
        public final android.os.ParcelableHolder extension = null;
        public FaceOperationState() {}
        private int describeContents(java.lang.Object p0) { return 0; }
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class FingerprintOperationState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.biometrics.common.OperationState.FingerprintOperationState> CREATOR = null;
        public final android.os.ParcelableHolder extension = null;
        public boolean isHardwareIgnoringTouches;
        public FingerprintOperationState() {}
        private int describeContents(java.lang.Object p0) { return 0; }
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static @interface Tag {
        public static final int faceOperationState = 1;
        public static final int fingerprintOperationState = 0;
    }
}
