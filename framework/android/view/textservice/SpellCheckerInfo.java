package android.view.textservice;

public final class SpellCheckerInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.textservice.SpellCheckerInfo> CREATOR = null;
    private static final int MAX_METADATA_SIZE_BYTES = 204800;
    private static final int STRING_MAX_LENGTH = 1000;
    private static final int STRING_MAX_TOTAL_LENGTH = 204800;
    private static final java.lang.String TAG = "SpellCheckerInfo";
    private final java.lang.String mId = null;
    private final int mLabel = 0;
    private final android.content.pm.ResolveInfo mService = null;
    private final java.lang.String mSettingsActivityName = null;
    private java.util.ArrayList<android.view.textservice.SpellCheckerSubtype> mSubtypes;
    public SpellCheckerInfo(android.content.Context p0, android.content.pm.ResolveInfo p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public SpellCheckerInfo(android.os.Parcel p0) {}
    private static void validateXmlMetaData(android.content.pm.ServiceInfo p0, android.content.res.Resources p1) throws java.io.IOException, android.content.pm.PackageManager.NameNotFoundException, org.xmlpull.v1.XmlPullParserException {}
    public int describeContents() { return 0; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    public android.content.ComponentName getComponent() { return null; }
    public java.lang.String getId() { return null; }
    public java.lang.String getPackageName() { return null; }
    public android.content.pm.ServiceInfo getServiceInfo() { return null; }
    public java.lang.String getSettingsActivity() { return null; }
    public android.view.textservice.SpellCheckerSubtype getSubtypeAt(int p0) { return null; }
    public int getSubtypeCount() { return 0; }
    public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager p0) { return null; }
    public java.lang.CharSequence loadLabel(android.content.pm.PackageManager p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class TypedArrayWrapper implements java.lang.AutoCloseable {
        private final android.view.textservice.SpellCheckerInfo.MetadataReadBytesTracker mReadTracker = null;
        private final android.content.res.TypedArray mTypedArray = null;
        public TypedArrayWrapper(android.content.res.TypedArray p0, android.view.textservice.SpellCheckerInfo.MetadataReadBytesTracker p1) {}
        public void close() {}
        public int getInt(int p0, int p1) throws org.xmlpull.v1.XmlPullParserException { return 0; }
        public int getResourceId(int p0, int p1) throws org.xmlpull.v1.XmlPullParserException { return 0; }
        public java.lang.String getString(int p0) throws org.xmlpull.v1.XmlPullParserException { return null; }
    }

    public static final class MetadataReadBytesTracker {
        private int mRemainingBytes;
        public MetadataReadBytesTracker() {}
        private void onReadBytes(int p0) throws org.xmlpull.v1.XmlPullParserException {}
    }
}
