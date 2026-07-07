package android.app.search;

@android.annotation.SystemApi
public final class SearchContext implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.search.SearchContext> CREATOR = null;
    private final android.os.Bundle mExtras = null;
    private java.lang.String mPackageName;
    private final int mResultTypes = 0;
    private final int mTimeoutMillis = 0;
    public SearchContext(int p0, int p1) {}
    public SearchContext(int p0, int p1, android.os.Bundle p2) {}
    private SearchContext(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.os.Bundle getExtras() { return null; }
    public java.lang.String getPackageName() { return null; }
    public int getResultTypes() { return 0; }
    public int getTimeoutMillis() { return 0; }
    void setPackageName(java.lang.String p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
