package android.telephony;

public final class CellIdentityLte extends android.telephony.CellIdentity {
    public static final android.os.Parcelable.Creator<android.telephony.CellIdentityLte> CREATOR = null;
    private static final boolean DBG = false;
    private static final int MAX_BANDWIDTH = 20000;
    private static final int MAX_CI = 268435455;
    private static final int MAX_EARFCN = 262143;
    private static final int MAX_PCI = 503;
    private static final int MAX_TAC = 65535;
    private static final java.lang.String TAG = null;
    private final android.util.ArraySet<java.lang.String> mAdditionalPlmns = null;
    private final int[] mBands = null;
    private final int mBandwidth = 0;
    private final int mCi = 0;
    private android.telephony.ClosedSubscriberGroupInfo mCsgInfo;
    private final int mEarfcn = 0;
    private final int mPci = 0;
    private final int mTac = 0;
    public CellIdentityLte() { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityLte(int p0, int p1, int p2, int p3, int p4) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityLte(int p0, int p1, int p2, int p3, int[] p4, int p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9, java.util.Collection<java.lang.String> p10, android.telephony.ClosedSubscriberGroupInfo p11) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    private CellIdentityLte(android.os.Parcel p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    private CellIdentityLte(android.telephony.CellIdentityLte p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    protected static android.telephony.CellIdentityLte createFromParcelBody(android.os.Parcel p0) { return null; }
    public android.telephony.gsm.GsmCellLocation asCellLocation() { return null; }
    android.telephony.CellIdentityLte copy() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Set<java.lang.String> getAdditionalPlmns() { return null; }
    public int[] getBands() { return null; }
    public int getBandwidth() { return 0; }
    public int getChannelNumber() { return 0; }
    public int getCi() { return 0; }
    public android.telephony.ClosedSubscriberGroupInfo getClosedSubscriberGroupInfo() { return null; }
    public int getEarfcn() { return 0; }
    @java.lang.Deprecated
    public int getMcc() { return 0; }
    public java.lang.String getMccString() { return null; }
    @java.lang.Deprecated
    public int getMnc() { return 0; }
    public java.lang.String getMncString() { return null; }
    public java.lang.String getMobileNetworkOperator() { return null; }
    public int getPci() { return 0; }
    public int getTac() { return 0; }
    public int hashCode() { return 0; }
    public android.telephony.CellIdentityLte sanitizeLocationInfo() { return null; }
    public java.lang.String toString() { return null; }
    protected void updateGlobalCellId() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
