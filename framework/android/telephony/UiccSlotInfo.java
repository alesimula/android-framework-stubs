package android.telephony;

@android.annotation.SystemApi
public class UiccSlotInfo implements android.os.Parcelable {
    public static final int CARD_STATE_INFO_ABSENT = 1;
    public static final int CARD_STATE_INFO_ERROR = 3;
    public static final int CARD_STATE_INFO_PRESENT = 2;
    public static final int CARD_STATE_INFO_RESTRICTED = 4;
    public static final android.os.Parcelable.Creator<android.telephony.UiccSlotInfo> CREATOR = null;
    private final java.lang.String mCardId = null;
    private final int mCardStateInfo = 0;
    private final boolean mIsActive = false;
    private final boolean mIsEuicc = false;
    private final boolean mIsExtendedApduSupported = false;
    private final boolean mIsRemovable = false;
    private boolean mLogicalSlotAccessRestricted;
    private final int mLogicalSlotIdx = 0;
    private final java.util.List<android.telephony.UiccPortInfo> mPortList = null;
    private final int mSimType = 0;
    private final int[] mSupportedSimTypes = null;
    private UiccSlotInfo(android.os.Parcel p0) {}
    public UiccSlotInfo(boolean p0, java.lang.String p1, int p2, boolean p3, boolean p4, java.util.List<android.telephony.UiccPortInfo> p5) {}
    public UiccSlotInfo(boolean p0, java.lang.String p1, int p2, boolean p3, boolean p4, java.util.List<android.telephony.UiccPortInfo> p5, int p6, int[] p7) {}
    @java.lang.Deprecated
    public UiccSlotInfo(boolean p0, boolean p1, java.lang.String p2, int p3, int p4, boolean p5) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getCardId() { return null; }
    public int getCardStateInfo() { return 0; }
    @java.lang.Deprecated
    public boolean getIsActive() { return false; }
    public boolean getIsEuicc() { return false; }
    public boolean getIsExtendedApduSupported() { return false; }
    @java.lang.Deprecated
    public int getLogicalSlotIdx() { return 0; }
    public java.util.Collection<android.telephony.UiccPortInfo> getPorts() { return null; }
    public int getSimType() { return 0; }
    public int[] getSupportedSimTypes() { return null; }
    public int hashCode() { return 0; }
    public boolean isRemovable() { return false; }
    public void setLogicalSlotAccessRestricted(boolean p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CardStateInfo {
    }
}
