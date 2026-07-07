package android.app.admin;

public final class ParcelableResource implements android.os.Parcelable {
    private static final java.lang.String ATTR_PACKAGE_NAME = "package-name";
    private static final java.lang.String ATTR_RESOURCE_ID = "resource-id";
    private static final java.lang.String ATTR_RESOURCE_NAME = "resource-name";
    private static final java.lang.String ATTR_RESOURCE_TYPE = "resource-type";
    public static final android.os.Parcelable.Creator<android.app.admin.ParcelableResource> CREATOR = null;
    public static final int RESOURCE_TYPE_DRAWABLE = 1;
    public static final int RESOURCE_TYPE_STRING = 2;
    private static java.lang.String TAG;
    private final java.lang.String mPackageName = null;
    private final int mResourceId = 0;
    private final java.lang.String mResourceName = null;
    private final int mResourceType = 0;
    private ParcelableResource(int p0, java.lang.String p1, java.lang.String p2, int p3) {}
    public ParcelableResource(android.content.Context p0, int p1, int p2) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException {}
    public static android.app.admin.ParcelableResource createFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private android.content.res.Resources getAppResourcesWithCallersConfiguration(android.content.Context p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    private static boolean hasDrawableInCallingPackage(android.content.Context p0, int p1) { return false; }
    private static boolean hasStringInCallingPackage(android.content.Context p0, int p1) { return false; }
    public static android.graphics.drawable.Drawable loadDefaultDrawable(java.util.function.Supplier<android.graphics.drawable.Drawable> p0) { return null; }
    public static java.lang.String loadDefaultString(java.util.function.Supplier<java.lang.String> p0) { return null; }
    private static void verifyResourceExistsInCallingPackage(android.content.Context p0, int p1, int p2) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException {}
    private void verifyResourceName(android.content.res.Resources p0) throws java.lang.IllegalStateException {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.graphics.drawable.Drawable getDrawable(android.content.Context p0, int p1, java.util.function.Supplier<android.graphics.drawable.Drawable> p2) { return null; }
    public java.lang.String getPackageName() { return null; }
    public int getResourceId() { return 0; }
    public java.lang.String getResourceName() { return null; }
    public int getResourceType() { return 0; }
    public java.lang.String getString(android.content.Context p0, java.util.function.Supplier<java.lang.String> p1) { return null; }
    public java.lang.String getString(android.content.Context p0, java.util.function.Supplier<java.lang.String> p1, java.lang.Object... p2) { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToXmlFile(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResourceType {
    }
}
