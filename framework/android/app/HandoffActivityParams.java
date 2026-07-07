package android.app;

public final class HandoffActivityParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.HandoffActivityParams> CREATOR = null;
    private final boolean mAllowHandoffWithoutPackageInstalled = false;
    private HandoffActivityParams(android.app.HandoffActivityParams.Builder p0) {}
    private HandoffActivityParams(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isAllowHandoffWithoutPackageInstalled() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mAllowHandoffWithoutPackageInstalled;
        public Builder() {}
        public android.app.HandoffActivityParams build() { return null; }
        public android.app.HandoffActivityParams.Builder setAllowHandoffWithoutPackageInstalled(boolean p0) { return null; }
    }
}
