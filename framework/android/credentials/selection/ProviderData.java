package android.credentials.selection;

public abstract class ProviderData implements android.os.Parcelable {
    public static final java.lang.String EXTRA_DISABLED_PROVIDER_DATA_LIST = "android.credentials.selection.extra.DISABLED_PROVIDER_DATA_LIST";
    public static final java.lang.String EXTRA_ENABLED_PROVIDER_DATA_LIST = "android.credentials.selection.extra.ENABLED_PROVIDER_DATA_LIST";
    private final java.lang.String mProviderFlattenedComponentName = null;
    protected ProviderData(android.os.Parcel p0) {}
    public ProviderData(java.lang.String p0) {}
    public int describeContents() { return 0; }
    public java.lang.String getProviderFlattenedComponentName() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
