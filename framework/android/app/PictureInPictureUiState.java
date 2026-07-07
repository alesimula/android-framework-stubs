package android.app;

public final class PictureInPictureUiState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.PictureInPictureUiState> CREATOR = null;
    private final boolean mIsStashed = false;
    private final boolean mIsTransitioningToPip = false;
    PictureInPictureUiState(android.os.Parcel p0) {}
    public PictureInPictureUiState(boolean p0) {}
    private PictureInPictureUiState(boolean p0, boolean p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isStashed() { return false; }
    public boolean isTransitioningToPip() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mIsStashed;
        private boolean mIsTransitioningToPip;
        public Builder() {}
        public android.app.PictureInPictureUiState build() { return null; }
        public android.app.PictureInPictureUiState.Builder setStashed(boolean p0) { return null; }
        public android.app.PictureInPictureUiState.Builder setTransitioningToPip(boolean p0) { return null; }
    }
}
