package android.app.admin;

public final class PolicyValueTransport implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.admin.PolicyValueTransport> CREATOR = null;
    public static final int booleanField = 0;
    public static final int integerField = 1;
    public static final int listOfPackageField = 2;
    public static final int listOfStringField = 3;
    public static final int longField = 4;
    public static final int packageField = 5;
    public static final int stringField = 6;
    private int _tag;
    private java.lang.Object _value;
    public PolicyValueTransport() {}
    private PolicyValueTransport(int p0, java.lang.Object p1) {}
    private PolicyValueTransport(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.app.admin.PolicyValueTransport booleanField(boolean p0) { return null; }
    private int describeContents(java.lang.Object p0) { return 0; }
    public static android.app.admin.PolicyValueTransport integerField(int p0) { return null; }
    public static android.app.admin.PolicyValueTransport listOfPackageField(java.util.List<android.app.admin.PackageIdentifierTransport> p0) { return null; }
    public static android.app.admin.PolicyValueTransport listOfStringField(java.util.List<java.lang.String> p0) { return null; }
    public static android.app.admin.PolicyValueTransport longField(long p0) { return null; }
    public static android.app.admin.PolicyValueTransport packageField(android.app.admin.PackageIdentifierTransport p0) { return null; }
    public static android.app.admin.PolicyValueTransport stringField(java.lang.String p0) { return null; }
    public int describeContents() { return 0; }
    public boolean getBooleanField() { return false; }
    public int getIntegerField() { return 0; }
    public java.util.List<android.app.admin.PackageIdentifierTransport> getListOfPackageField() { return null; }
    public java.util.List<java.lang.String> getListOfStringField() { return null; }
    public long getLongField() { return 0L; }
    public android.app.admin.PackageIdentifierTransport getPackageField() { return null; }
    public java.lang.String getStringField() { return null; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setBooleanField(boolean p0) {}
    public void setIntegerField(int p0) {}
    public void setListOfPackageField(java.util.List<android.app.admin.PackageIdentifierTransport> p0) {}
    public void setListOfStringField(java.util.List<java.lang.String> p0) {}
    public void setLongField(long p0) {}
    public void setPackageField(android.app.admin.PackageIdentifierTransport p0) {}
    public void setStringField(java.lang.String p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int booleanField = 0;
        public static final int integerField = 1;
        public static final int listOfPackageField = 2;
        public static final int listOfStringField = 3;
        public static final int longField = 4;
        public static final int packageField = 5;
        public static final int stringField = 6;
    }
}
