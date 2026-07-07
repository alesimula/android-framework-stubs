package android.telephony;

@android.annotation.SystemApi
public class CellBroadcastIntents {
    public static final java.lang.String ACTION_AREA_INFO_UPDATED = "android.telephony.action.AREA_INFO_UPDATED";
    private static final java.lang.String EXTRA_MESSAGE = "message";
    private static final java.lang.String LOG_TAG = "CellBroadcastIntents";
    private CellBroadcastIntents() {}
    private static void putPhoneIdAndSubIdExtra(android.content.Context p0, android.content.Intent p1, int p2) {}
    public static void sendSmsCbReceivedBroadcast(android.content.Context p0, android.os.UserHandle p1, android.telephony.SmsCbMessage p2, android.content.BroadcastReceiver p3, android.os.Handler p4, int p5, int p6) {}
}
