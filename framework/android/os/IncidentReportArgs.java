package android.os;

@android.annotation.SystemApi
public final class IncidentReportArgs implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.IncidentReportArgs> CREATOR = null;
    private boolean mAll;
    private final java.util.ArrayList<byte[]> mHeaders = null;
    private int mPrivacyPolicy;
    private java.lang.String mReceiverCls;
    private java.lang.String mReceiverPkg;
    private final android.util.IntArray mSections = null;
    public IncidentReportArgs() {}
    public IncidentReportArgs(android.os.Parcel p0) {}
    public void addHeader(byte[] p0) {}
    public void addSection(int p0) {}
    public boolean containsSection(int p0) { return false; }
    public int describeContents() { return 0; }
    public boolean isAll() { return false; }
    public void readFromParcel(android.os.Parcel p0) {}
    public int sectionCount() { return 0; }
    public void setAll(boolean p0) {}
    public void setPrivacyPolicy(int p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
