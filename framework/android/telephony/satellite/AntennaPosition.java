package android.telephony.satellite;

@android.annotation.SystemApi
public final class AntennaPosition implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.AntennaPosition> CREATOR = null;
    private android.telephony.satellite.AntennaDirection mAntennaDirection;
    private int mSuggestedHoldPosition;
    private AntennaPosition(android.os.Parcel p0) {}
    public AntennaPosition(android.telephony.satellite.AntennaDirection p0, int p1) {}
    private void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.telephony.satellite.AntennaDirection getAntennaDirection() { return null; }
    public int getSuggestedHoldPosition() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
