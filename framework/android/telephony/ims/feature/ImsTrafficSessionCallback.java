package android.telephony.ims.feature;

@android.annotation.SystemApi
public interface ImsTrafficSessionCallback {
    public void onError(android.telephony.ims.feature.ConnectionFailureInfo p0);
    public void onReady();
}
