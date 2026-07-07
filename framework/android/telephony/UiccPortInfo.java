package android.telephony;

public final class UiccPortInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.UiccPortInfo> CREATOR = null;
    public static final java.lang.String ICCID_REDACTED = "FFFFFFFFFFFFFFFFFFFF";
    private final java.lang.String mIccId = null;
    private final boolean mIsActive = false;
    private final int mLogicalSlotIndex = 0;
    private final int mPortIndex = 0;
    private UiccPortInfo(android.os.Parcel p0) {}
    public UiccPortInfo(java.lang.String p0, int p1, int p2, boolean p3) {}
    public android.telephony.UiccPortInfo createSensitiveInfoSanitizedCopy() { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getIccId() { return null; }
    public int getLogicalSlotIndex() { return 0; }
    public int getPortIndex() { return 0; }
    public int hashCode() { return 0; }
    public boolean isActive() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
