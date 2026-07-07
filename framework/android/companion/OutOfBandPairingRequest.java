package android.companion;

public final class OutOfBandPairingRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.companion.OutOfBandPairingRequest> CREATOR = null;
    private final boolean mBluetooth = false;
    private OutOfBandPairingRequest(android.companion.OutOfBandPairingRequest.Builder p0) {}
    private OutOfBandPairingRequest(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isBluetoothPairingRequested() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mBluetooth;
        public Builder() {}
        public android.companion.OutOfBandPairingRequest build() { return null; }
        public android.companion.OutOfBandPairingRequest.Builder setBluetooth(boolean p0) { return null; }
    }
}
