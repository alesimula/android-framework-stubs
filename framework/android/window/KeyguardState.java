package android.window;

public final class KeyguardState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.KeyguardState> CREATOR = null;
    private final boolean mAodShowing = false;
    private final boolean mKeyguardShowing = false;
    private KeyguardState(android.os.Parcel p0) {}
    private KeyguardState(boolean p0, boolean p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean getAodShowing() { return false; }
    public boolean getKeyguardShowing() { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mAodShowing;
        private boolean mKeyguardShowing;
        public Builder() {}
        public android.window.KeyguardState build() { return null; }
        public android.window.KeyguardState.Builder setAodShowing(boolean p0) { return null; }
        public android.window.KeyguardState.Builder setKeyguardShowing(boolean p0) { return null; }
    }
}
