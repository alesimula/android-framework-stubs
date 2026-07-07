package android.telephony.gba;

public final class GbaAuthRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.gba.GbaAuthRequest> CREATOR = null;
    private static java.util.concurrent.atomic.AtomicInteger sUniqueToken;
    private int mAppType;
    private android.telephony.IBootstrapAuthenticationCallback mCallback;
    private boolean mForceBootStrapping;
    private android.net.Uri mNafUrl;
    private byte[] mSecurityProtocol;
    private int mSubId;
    private int mToken;
    public GbaAuthRequest(int p0, int p1, int p2, android.net.Uri p3, byte[] p4, boolean p5, android.telephony.IBootstrapAuthenticationCallback p6) {}
    public GbaAuthRequest(int p0, int p1, android.net.Uri p2, byte[] p3, boolean p4, android.telephony.IBootstrapAuthenticationCallback p5) {}
    public GbaAuthRequest(android.telephony.gba.GbaAuthRequest p0) {}
    private static int nextUniqueToken() { return 0; }
    public int describeContents() { return 0; }
    public int getAppType() { return 0; }
    public android.telephony.IBootstrapAuthenticationCallback getCallback() { return null; }
    public android.net.Uri getNafUrl() { return null; }
    public byte[] getSecurityProtocol() { return null; }
    public int getSubId() { return 0; }
    public int getToken() { return 0; }
    public boolean isForceBootStrapping() { return false; }
    public void setCallback(android.telephony.IBootstrapAuthenticationCallback p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
