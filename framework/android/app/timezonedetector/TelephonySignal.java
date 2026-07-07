package android.app.timezonedetector;

public final class TelephonySignal implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.timezonedetector.TelephonySignal> CREATOR = null;
    private final java.util.Set<java.lang.String> mCountryIsoCodes = null;
    private final java.lang.String mDefaultCountryIsoCode = null;
    private final java.lang.String mMcc = null;
    private final java.lang.String mMnc = null;
    private final android.app.timezonedetector.NitzSignal mNitzSignal = null;
    public TelephonySignal(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Set<java.lang.String> p3, android.app.timezonedetector.NitzSignal p4) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Set<java.lang.String> getCountryIsoCodes() { return null; }
    public java.lang.String getDefaultCountryIsoCode() { return null; }
    public java.lang.String getMcc() { return null; }
    public java.lang.String getMnc() { return null; }
    public android.app.timezonedetector.NitzSignal getNitzSignal() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
