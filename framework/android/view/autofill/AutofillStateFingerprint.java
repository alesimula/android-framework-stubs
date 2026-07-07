package android.view.autofill;

public final class AutofillStateFingerprint {
    private static final java.lang.String TAG = "AutofillStateFingerprint";
    private java.util.ArrayList<android.view.autofill.AutofillValue> mFailedAutofillValues;
    private java.util.ArrayList<android.view.autofill.AutofillId> mFailedIds;
    java.util.Map<java.lang.Integer, android.view.autofill.AutofillId> mHashToAutofillIdMap;
    boolean mHideHighlight;
    java.util.Map<android.view.autofill.AutofillId, android.view.autofill.AutofillId> mOldIdsToCurrentAutofillIdMap;
    java.util.ArrayList<android.view.autofill.AutofillId> mPriorAutofillIds;
    private int mSessionId;
    private boolean mUseRelativePosition;
    java.util.ArrayList<java.lang.Integer> mViewHashCodes;
    private AutofillStateFingerprint() {}
    private int compareBottom(android.view.View p0, android.view.View p1) { return 0; }
    private int compareLeft(android.view.View p0, android.view.View p1) { return 0; }
    private int compareRight(android.view.View p0, android.view.View p1) { return 0; }
    private int compareTop(android.view.View p0, android.view.View p1) { return 0; }
    public static android.view.autofill.AutofillStateFingerprint createInstance() { return null; }
    private void dumpCurrentState() {}
    boolean attemptRefill(java.util.List<android.view.View> p0, android.view.autofill.AutofillManager p1) { return false; }
    public int getEphemeralFingerprintId(android.view.View p0, int p1) { return 0; }
    android.util.ArrayMap<java.lang.Integer, android.view.View> getFingerprintIds(java.util.List<android.view.View> p0) { return null; }
    void setSessionId(int p0) {}
    void setUseRelativePosition(boolean p0) {}
    void storeFailedIdsAndValues(java.util.ArrayList<android.view.autofill.AutofillId> p0, java.util.ArrayList<android.view.autofill.AutofillValue> p1, boolean p2) {}
    void storeStatePriorToAuthentication(android.view.autofill.AutofillManager.AutofillClient p0, java.util.Set<android.view.autofill.AutofillId> p1) {}
}
