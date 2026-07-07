package android.hardware.usb;

public final class PowerProfileMatchInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.usb.PowerProfileMatchInfo> CREATOR = null;
    private final int mMaxCurrentMa = 0;
    private final int mMaxPowerMw = 0;
    private final int mMaxVoltageMv = 0;
    private final int mMinCurrentMa = 0;
    private final int mMinVoltageMv = 0;
    private final int mPartnerIndex = 0;
    private final int mPortIndex = 0;
    public PowerProfileMatchInfo(android.hardware.usb.PowerProfileMatchInfo.Builder p0) {}
    public int describeContents() { return 0; }
    public int getMaxCurrentMa() { return 0; }
    public int getMaxPowerMw() { return 0; }
    public int getMaxVoltageMv() { return 0; }
    public int getMinCurrentMa() { return 0; }
    public int getMinVoltageMv() { return 0; }
    public int getPartnerIndex() { return 0; }
    public int getPortIndex() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mMaxCurrentMa;
        private int mMaxPowerMw;
        private int mMaxVoltageMv;
        private int mMinCurrentMa;
        private int mMinVoltageMv;
        private int mPartnerIndex;
        private int mPortIndex;
        public Builder() {}
        public android.hardware.usb.PowerProfileMatchInfo build() { return null; }
        public android.hardware.usb.PowerProfileMatchInfo.Builder setMaxCurrentMa(int p0) { return null; }
        public android.hardware.usb.PowerProfileMatchInfo.Builder setMaxPowerMw(int p0) { return null; }
        public android.hardware.usb.PowerProfileMatchInfo.Builder setMaxVoltageMv(int p0) { return null; }
        public android.hardware.usb.PowerProfileMatchInfo.Builder setMinCurrentMa(int p0) { return null; }
        public android.hardware.usb.PowerProfileMatchInfo.Builder setMinVoltageMv(int p0) { return null; }
        public android.hardware.usb.PowerProfileMatchInfo.Builder setPartnerIndex(int p0) { return null; }
        public android.hardware.usb.PowerProfileMatchInfo.Builder setPortIndex(int p0) { return null; }
    }
}
