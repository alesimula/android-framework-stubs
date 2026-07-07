package android.service.autofill;

public final class SaveRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.autofill.SaveRequest> CREATOR = null;
    private final android.os.Bundle mClientState = null;
    private final java.util.ArrayList<java.lang.String> mDatasetIds = null;
    private final java.util.ArrayList<android.service.autofill.FillContext> mFillContexts = null;
    private SaveRequest(android.os.Parcel p0) {}
    public SaveRequest(java.util.ArrayList<android.service.autofill.FillContext> p0, android.os.Bundle p1, java.util.ArrayList<java.lang.String> p2) {}
    public int describeContents() { return 0; }
    public android.os.Bundle getClientState() { return null; }
    public java.util.List<java.lang.String> getDatasetIds() { return null; }
    public java.util.List<android.service.autofill.FillContext> getFillContexts() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
