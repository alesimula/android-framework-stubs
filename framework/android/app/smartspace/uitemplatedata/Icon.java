package android.app.smartspace.uitemplatedata;

@android.annotation.SystemApi
public final class Icon implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.smartspace.uitemplatedata.Icon> CREATOR = null;
    private final java.lang.CharSequence mContentDescription = null;
    private final android.graphics.drawable.Icon mIcon = null;
    private final boolean mShouldTint = false;
    private Icon(android.graphics.drawable.Icon p0, java.lang.CharSequence p1, boolean p2) {}
    Icon(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.CharSequence getContentDescription() { return null; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public int hashCode() { return 0; }
    public boolean shouldTint() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private java.lang.CharSequence mContentDescription;
        private android.graphics.drawable.Icon mIcon;
        private boolean mShouldTint;
        public Builder(android.graphics.drawable.Icon p0) {}
        public android.app.smartspace.uitemplatedata.Icon build() { return null; }
        public android.app.smartspace.uitemplatedata.Icon.Builder setContentDescription(java.lang.CharSequence p0) { return null; }
        public android.app.smartspace.uitemplatedata.Icon.Builder setShouldTint(boolean p0) { return null; }
    }
}
