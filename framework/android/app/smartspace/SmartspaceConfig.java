package android.app.smartspace;

@android.annotation.SystemApi
public final class SmartspaceConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.smartspace.SmartspaceConfig> CREATOR = null;
    private final android.os.Bundle mExtras = null;
    private java.lang.String mPackageName;
    private final int mSmartspaceTargetCount = 0;
    private final java.lang.String mUiSurface = null;
    private SmartspaceConfig(android.os.Parcel p0) {}
    private SmartspaceConfig(java.lang.String p0, int p1, java.lang.String p2, android.os.Bundle p3) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.os.Bundle getExtras() { return null; }
    public java.lang.String getPackageName() { return null; }
    public int getSmartspaceTargetCount() { return 0; }
    public java.lang.String getUiSurface() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private android.os.Bundle mExtras;
        private final java.lang.String mPackageName = null;
        private int mSmartspaceTargetCount;
        private final java.lang.String mUiSurface = null;
        @android.annotation.SystemApi
        public Builder(android.content.Context p0, java.lang.String p1) {}
        public android.app.smartspace.SmartspaceConfig build() { return null; }
        public android.app.smartspace.SmartspaceConfig.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.app.smartspace.SmartspaceConfig.Builder setSmartspaceTargetCount(int p0) { return null; }
    }
}
