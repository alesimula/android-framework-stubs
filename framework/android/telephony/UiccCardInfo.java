package android.telephony;

public final class UiccCardInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.UiccCardInfo> CREATOR = null;
    private final int mCardId = 0;
    private final java.lang.String mEid = null;
    private final java.lang.String mIccId = null;
    private boolean mIccIdAccessRestricted;
    private final boolean mIsEuicc = false;
    private final boolean mIsMultipleEnabledProfilesSupported = false;
    private final boolean mIsRemovable = false;
    private final int mPhysicalSlotIndex = 0;
    private final java.util.List<android.telephony.UiccPortInfo> mPortList = null;
    private UiccCardInfo(android.os.Parcel p0) {}
    public UiccCardInfo(boolean p0, int p1, java.lang.String p2, int p3, boolean p4, boolean p5, java.util.List<android.telephony.UiccPortInfo> p6) {}
    public android.telephony.UiccCardInfo createSensitiveInfoSanitizedCopy(boolean p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getCardId() { return 0; }
    public java.lang.String getEid() { return null; }
    @java.lang.Deprecated
    public java.lang.String getIccId() { return null; }
    public int getPhysicalSlotIndex() { return 0; }
    public java.util.Collection<android.telephony.UiccPortInfo> getPorts() { return null; }
    @java.lang.Deprecated
    public int getSlotIndex() { return 0; }
    public int hashCode() { return 0; }
    public boolean isEuicc() { return false; }
    public boolean isMultipleEnabledProfilesSupported() { return false; }
    public boolean isRemovable() { return false; }
    public void setIccIdAccessRestricted(boolean p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
