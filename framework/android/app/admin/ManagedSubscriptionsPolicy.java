package android.app.admin;

public final class ManagedSubscriptionsPolicy implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.admin.ManagedSubscriptionsPolicy> CREATOR = null;
    private static final java.lang.String KEY_POLICY_TYPE = "policy_type";
    private static final java.lang.String TAG = "ManagedSubscriptionsPolicy";
    public static final int TYPE_ALL_MANAGED_SUBSCRIPTIONS = 1;
    public static final int TYPE_ALL_PERSONAL_SUBSCRIPTIONS = 0;
    private final int mPolicyType = 0;
    public ManagedSubscriptionsPolicy(int p0) {}
    public static android.app.admin.ManagedSubscriptionsPolicy readFromXml(com.android.modules.utils.TypedXmlPullParser p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getPolicyType() { return 0; }
    public int hashCode() { return 0; }
    public void saveToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ManagedSubscriptionsPolicyType {
    }
}
