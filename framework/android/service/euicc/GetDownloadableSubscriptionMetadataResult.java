package android.service.euicc;

@android.annotation.SystemApi
public final class GetDownloadableSubscriptionMetadataResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.euicc.GetDownloadableSubscriptionMetadataResult> CREATOR = null;
    private final android.telephony.euicc.DownloadableSubscription mSubscription = null;
    @java.lang.Deprecated
    public final int result = 0;
    public GetDownloadableSubscriptionMetadataResult(int p0, android.telephony.euicc.DownloadableSubscription p1) {}
    private GetDownloadableSubscriptionMetadataResult(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.telephony.euicc.DownloadableSubscription getDownloadableSubscription() { return null; }
    public int getResult() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
