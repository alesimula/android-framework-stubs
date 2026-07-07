package android.os;

@android.annotation.SystemApi
public final class RemoteCallback implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.RemoteCallback> CREATOR = null;
    private final android.os.IRemoteCallback mCallback = null;
    private final android.os.Handler mHandler = null;
    private final android.os.RemoteCallback.OnResultListener mListener = null;
    RemoteCallback(android.os.Parcel p0) {}
    public RemoteCallback(android.os.RemoteCallback.OnResultListener p0) {}
    public RemoteCallback(android.os.RemoteCallback.OnResultListener p0, android.os.Handler p1) {}
    public int describeContents() { return 0; }
    public android.os.IRemoteCallback getInterface() { return null; }
    public void sendResult(android.os.Bundle p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static interface OnResultListener {
        public void onResult(android.os.Bundle p0);
    }
}
