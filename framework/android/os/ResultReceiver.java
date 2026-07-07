package android.os;

public class ResultReceiver implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.ResultReceiver> CREATOR = null;
    final android.os.Handler mHandler = null;
    final boolean mLocal = false;
    com.android.internal.os.IResultReceiver mReceiver;
    public ResultReceiver(android.os.Handler p0) {}
    ResultReceiver(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    protected void onReceiveResult(int p0, android.os.Bundle p1) {}
    public void send(int p0, android.os.Bundle p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    class MyResultReceiver extends com.android.internal.os.IResultReceiver.Stub {
        MyResultReceiver(android.os.ResultReceiver p0) { super(); }
        public void send(int p0, android.os.Bundle p1) {}
    }

    class MyRunnable implements java.lang.Runnable {
        final int mResultCode = 0;
        final android.os.Bundle mResultData = null;
        MyRunnable(android.os.ResultReceiver p0, int p1, android.os.Bundle p2) {}
        public void run() {}
    }
}
