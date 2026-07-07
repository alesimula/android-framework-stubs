package android.content;

public final class AttributionSource implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.AttributionSource> CREATOR = null;
    private static final java.lang.String DESCRIPTOR = "android.content.AttributionSource";
    private static final java.lang.String TAG = "AttributionSource";
    private static final android.os.Binder sDefaultToken = null;
    private final android.content.AttributionSourceState mAttributionSourceState = null;
    private android.content.AttributionSource mNextCached;
    private java.util.Set<java.lang.String> mRenouncedPermissionsCached;
    public AttributionSource(int p0, int p1, java.lang.String p2, java.lang.String p3) {}
    public AttributionSource(int p0, int p1, java.lang.String p2, java.lang.String p3, android.os.IBinder p4) {}
    public AttributionSource(int p0, int p1, java.lang.String p2, java.lang.String p3, android.os.IBinder p4, java.lang.String[] p5, int p6, android.content.AttributionSource p7) {}
    public AttributionSource(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String[] p4, int p5, android.content.AttributionSource p6) {}
    public AttributionSource(int p0, java.lang.String p1, java.lang.String p2) {}
    public AttributionSource(int p0, java.lang.String p1, java.lang.String p2, int p3) {}
    public AttributionSource(int p0, java.lang.String p1, java.lang.String p2, android.os.IBinder p3) {}
    public AttributionSource(int p0, java.lang.String p1, java.lang.String p2, java.util.Set<java.lang.String> p3, android.content.AttributionSource p4) {}
    public AttributionSource(android.content.AttributionSource p0, android.content.AttributionSource p1) {}
    public AttributionSource(android.content.AttributionSourceState p0) {}
    AttributionSource(android.os.Parcel p0) {}
    private boolean checkCallingPid() { return false; }
    public static android.content.AttributionSource myAttributionSource() { return null; }
    public android.content.AttributionSource.ScopedParcelState asScopedParcelState() { return null; }
    public android.content.AttributionSourceState asState() { return null; }
    public boolean checkCallingUid() { return false; }
    public int describeContents() { return 0; }
    public void enforceCallingPid() {}
    public void enforceCallingUid() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean equalsExceptToken(android.content.AttributionSource p0) { return false; }
    public java.lang.String getAttributionTag() { return null; }
    public int getDeviceId() { return 0; }
    public android.content.AttributionSource getNext() { return null; }
    public java.lang.String getNextAttributionTag() { return null; }
    public int getNextDeviceId() { return 0; }
    public java.lang.String getNextPackageName() { return null; }
    public android.os.IBinder getNextToken() { return null; }
    public int getNextUid() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public int getPid() { return 0; }
    @android.annotation.SystemApi
    public java.util.Set<java.lang.String> getRenouncedPermissions() { return null; }
    public android.os.IBinder getToken() { return null; }
    public int getUid() { return 0; }
    public int hashCode() { return 0; }
    public boolean isTrusted(android.content.Context p0) { return false; }
    public java.lang.String toString() { return null; }
    public android.content.AttributionSource withDefaultToken() { return null; }
    public android.content.AttributionSource withDeviceId(int p0) { return null; }
    public android.content.AttributionSource withNextAttributionSource(android.content.AttributionSource p0) { return null; }
    public android.content.AttributionSource withPackageName(java.lang.String p0) { return null; }
    public android.content.AttributionSource withPid(int p0) { return null; }
    public android.content.AttributionSource withToken(android.os.IBinder p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.content.AttributionSourceState mAttributionSourceState = null;
        private boolean mHasBeenUsed;
        public Builder(int p0) {}
        public Builder(android.content.AttributionSource p0) {}
        private void checkNotUsed() {}
        public android.content.AttributionSource build() { return null; }
        public android.content.AttributionSource.Builder setAttributionTag(java.lang.String p0) { return null; }
        public android.content.AttributionSource.Builder setDeviceId(int p0) { return null; }
        public android.content.AttributionSource.Builder setNext(android.content.AttributionSource p0) { return null; }
        public android.content.AttributionSource.Builder setNextAttributionSource(android.content.AttributionSource p0) { return null; }
        public android.content.AttributionSource.Builder setPackageName(java.lang.String p0) { return null; }
        public android.content.AttributionSource.Builder setPid(int p0) { return null; }
        @android.annotation.SystemApi
        public android.content.AttributionSource.Builder setRenouncedPermissions(java.util.Set<java.lang.String> p0) { return null; }
    }

    public static class ScopedParcelState implements java.lang.AutoCloseable {
        private final android.os.Parcel mParcel = null;
        public ScopedParcelState(android.content.AttributionSource p0) {}
        public void close() {}
        public android.os.Parcel getParcel() { return null; }
    }
}
