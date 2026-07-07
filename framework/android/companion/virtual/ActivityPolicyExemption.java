package android.companion.virtual;

@android.annotation.SystemApi
public final class ActivityPolicyExemption implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.companion.virtual.ActivityPolicyExemption> CREATOR = null;
    private final android.content.ComponentName mComponentName = null;
    private final int mDisplayId = 0;
    private final java.lang.String mPackageName = null;
    private ActivityPolicyExemption(android.content.ComponentName p0, java.lang.String p1, int p2) {}
    private ActivityPolicyExemption(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.content.ComponentName getComponentName() { return null; }
    public int getDisplayId() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.content.ComponentName mComponentName;
        private int mDisplayId;
        private java.lang.String mPackageName;
        public Builder() {}
        public android.companion.virtual.ActivityPolicyExemption build() { return null; }
        public android.companion.virtual.ActivityPolicyExemption.Builder setComponentName(android.content.ComponentName p0) { return null; }
        public android.companion.virtual.ActivityPolicyExemption.Builder setDisplayId(int p0) { return null; }
        public android.companion.virtual.ActivityPolicyExemption.Builder setPackageName(java.lang.String p0) { return null; }
    }
}
