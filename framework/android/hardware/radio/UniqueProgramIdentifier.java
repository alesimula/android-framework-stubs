package android.hardware.radio;

public final class UniqueProgramIdentifier implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.UniqueProgramIdentifier> CREATOR = null;
    private final android.hardware.radio.ProgramSelector.Identifier[] mCriticalSecondaryIds = null;
    private final android.hardware.radio.ProgramSelector.Identifier mPrimaryId = null;
    public UniqueProgramIdentifier(android.hardware.radio.ProgramSelector.Identifier p0) {}
    public UniqueProgramIdentifier(android.hardware.radio.ProgramSelector p0) {}
    private UniqueProgramIdentifier(android.os.Parcel p0) {}
    public static boolean requireCriticalSecondaryIds(int p0) { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.hardware.radio.ProgramSelector.Identifier> getCriticalSecondaryIds() { return null; }
    public android.hardware.radio.ProgramSelector.Identifier getPrimaryId() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
