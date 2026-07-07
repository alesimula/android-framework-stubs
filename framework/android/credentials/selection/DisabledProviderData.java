package android.credentials.selection;

public final class DisabledProviderData extends android.credentials.selection.ProviderData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.selection.DisabledProviderData> CREATOR = null;
    private DisabledProviderData(android.os.Parcel p0) { super((android.os.Parcel)null); }
    public DisabledProviderData(java.lang.String p0) { super((android.os.Parcel)null); }
    public int describeContents() { return 0; }
    public android.credentials.selection.DisabledProviderInfo toDisabledProviderInfo() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
