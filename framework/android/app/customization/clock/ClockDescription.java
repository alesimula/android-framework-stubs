package android.app.customization.clock;

public final class ClockDescription implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.customization.clock.ClockDescription> CREATOR = null;
    private static final java.lang.String TAG = "ClockDescription";
    private static final java.lang.String XML_TAG_ASSET = "asset";
    private static final java.lang.String XML_TAG_CONTENT = "content";
    private final java.util.List<java.lang.String> mAssetNames = null;
    private final android.content.ComponentName mComponentName = null;
    private final android.os.PersistableBundle mContent = null;
    private final java.lang.String mDescription = null;
    private final java.lang.String mId = null;
    private final java.lang.Integer mSeedColor = null;
    private final java.lang.String mTitle = null;
    public ClockDescription(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.Integer p4, java.util.List<java.lang.String> p5, android.os.PersistableBundle p6) {}
    ClockDescription(android.os.Parcel p0) {}
    public static android.app.customization.clock.ClockDescription restoreFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<java.lang.String> getAssetNames() { return null; }
    public android.content.ComponentName getComponentName() { return null; }
    public android.os.PersistableBundle getContent() { return null; }
    public java.lang.String getDescription() { return null; }
    public java.lang.String getId() { return null; }
    public java.lang.Integer getSeedColor() { return null; }
    public java.lang.String getTitle() { return null; }
    public int hashCode() { return 0; }
    public void saveToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
