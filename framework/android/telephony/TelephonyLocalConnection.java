package android.telephony;

public class TelephonyLocalConnection {
    private static android.telephony.TelephonyLocalConnection.ConnectionImpl sInstance;
    public TelephonyLocalConnection() {}
    private static void checkInstance() {}
    public static java.lang.String getCallComposerServerUrlForHandle(int p0, java.util.UUID p1) { return null; }
    public static void setInstance(android.telephony.TelephonyLocalConnection.ConnectionImpl p0) {}

    public static interface ConnectionImpl {
        public java.lang.String getCallComposerServerUrlForHandle(int p0, java.util.UUID p1);
    }
}
