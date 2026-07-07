package android.nfc.cardemulation;

@android.annotation.SystemApi
public final class AidGroup implements android.os.Parcelable {
    private static final java.util.regex.Pattern AID_PATTERN = null;
    public static final android.os.Parcelable.Creator<android.nfc.cardemulation.AidGroup> CREATOR = null;
    private static final int MAX_NUM_AIDS = 256;
    private static final java.lang.String TAG = "AidGroup";
    private final java.util.List<java.lang.String> mAids = null;
    private final java.lang.String mCategory = null;
    private final java.lang.String mDescription = null;
    AidGroup(java.lang.String p0, java.lang.String p1) {}
    public AidGroup(java.util.List<java.lang.String> p0, java.lang.String p1) {}
    public static android.nfc.cardemulation.AidGroup createFromXml(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static boolean isValidAid(java.lang.String p0) { return false; }
    private static boolean isValidCategory(java.lang.String p0) { return false; }
    public int describeContents() { return 0; }
    public void dump(android.util.proto.ProtoOutputStream p0) {}
    public java.util.List<java.lang.String> getAids() { return null; }
    public java.lang.String getCategory() { return null; }
    public java.lang.String toString() { return null; }
    public void writeAsXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
