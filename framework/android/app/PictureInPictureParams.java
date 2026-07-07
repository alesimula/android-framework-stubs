package android.app;

public final class PictureInPictureParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.PictureInPictureParams> CREATOR = null;
    private android.util.Rational mAspectRatio;
    private java.lang.Boolean mAutoEnterEnabled;
    private android.app.RemoteAction mCloseAction;
    private android.util.Rational mExpandedAspectRatio;
    private java.lang.Boolean mIsLaunchIntoPip;
    private android.app.RemoteAction mPrimaryAction;
    private java.lang.Boolean mSeamlessResizeEnabled;
    private android.graphics.Rect mSourceRectHint;
    private java.lang.CharSequence mSubtitle;
    private java.lang.CharSequence mTitle;
    private java.util.List<android.app.RemoteAction> mUserActions;
    PictureInPictureParams() {}
    public PictureInPictureParams(android.app.PictureInPictureParams p0) {}
    PictureInPictureParams(android.os.Parcel p0) {}
    PictureInPictureParams(android.util.Rational p0, android.util.Rational p1, java.util.List<android.app.RemoteAction> p2, android.app.RemoteAction p3, android.app.RemoteAction p4, android.graphics.Rect p5, java.lang.Boolean p6, java.lang.Boolean p7, java.lang.CharSequence p8, java.lang.CharSequence p9, java.lang.Boolean p10) {}
    public static boolean isSameAspectRatio(android.graphics.Rect p0, android.util.Rational p1) { return false; }
    private android.util.Rational readRationalFromParcel(android.os.Parcel p0) { return null; }
    private void sanitizePrimaryAction() {}
    private void writeRationalToParcel(android.util.Rational p0, android.os.Parcel p1) {}
    public void copyOnlySet(android.app.PictureInPictureParams p0) {}
    public int describeContents() { return 0; }
    public boolean empty() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.app.RemoteAction> getActions() { return null; }
    public android.util.Rational getAspectRatio() { return null; }
    public float getAspectRatioFloat() { return 0.0f; }
    public android.app.RemoteAction getCloseAction() { return null; }
    public android.util.Rational getExpandedAspectRatio() { return null; }
    public float getExpandedAspectRatioFloat() { return 0.0f; }
    public android.app.RemoteAction getPrimaryAction() { return null; }
    public android.graphics.Rect getSourceRectHint() { return null; }
    public java.lang.CharSequence getSubtitle() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public boolean hasSetActions() { return false; }
    public boolean hasSetAspectRatio() { return false; }
    public boolean hasSetCloseAction() { return false; }
    public boolean hasSetExpandedAspectRatio() { return false; }
    public boolean hasSetPrimaryAction() { return false; }
    public boolean hasSetSubtitle() { return false; }
    public boolean hasSetTitle() { return false; }
    public boolean hasSourceBoundsHint() { return false; }
    public int hashCode() { return 0; }
    public boolean isAutoEnterEnabled() { return false; }
    public boolean isLaunchIntoPip() { return false; }
    public boolean isSeamlessResizeEnabled() { return false; }
    public java.lang.String toString() { return null; }
    public void truncateActions(int p0) {}
    public boolean truncateTitleAndSubtitle(int p0, int p1) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private android.util.Rational mAspectRatio;
        private java.lang.Boolean mAutoEnterEnabled;
        private android.app.RemoteAction mCloseAction;
        private android.util.Rational mExpandedAspectRatio;
        private java.lang.Boolean mIsLaunchIntoPip;
        private android.app.RemoteAction mPrimaryAction;
        private java.lang.Boolean mSeamlessResizeEnabled;
        private android.graphics.Rect mSourceRectHint;
        private java.lang.CharSequence mSubtitle;
        private java.lang.CharSequence mTitle;
        private java.util.List<android.app.RemoteAction> mUserActions;
        public Builder() {}
        public Builder(android.app.PictureInPictureParams p0) {}
        public android.app.PictureInPictureParams build() { return null; }
        public android.app.PictureInPictureParams.Builder setActions(java.util.List<android.app.RemoteAction> p0) { return null; }
        public android.app.PictureInPictureParams.Builder setActions(java.util.List<android.app.RemoteAction> p0, android.app.RemoteAction p1) { return null; }
        public android.app.PictureInPictureParams.Builder setAspectRatio(android.util.Rational p0) { return null; }
        public android.app.PictureInPictureParams.Builder setAutoEnterEnabled(boolean p0) { return null; }
        public android.app.PictureInPictureParams.Builder setCloseAction(android.app.RemoteAction p0) { return null; }
        public android.app.PictureInPictureParams.Builder setExpandedAspectRatio(android.util.Rational p0) { return null; }
        android.app.PictureInPictureParams.Builder setIsLaunchIntoPip(boolean p0) { return null; }
        public android.app.PictureInPictureParams.Builder setSeamlessResizeEnabled(boolean p0) { return null; }
        public android.app.PictureInPictureParams.Builder setSourceRectHint(android.graphics.Rect p0) { return null; }
        public android.app.PictureInPictureParams.Builder setSubtitle(java.lang.CharSequence p0) { return null; }
        public android.app.PictureInPictureParams.Builder setTitle(java.lang.CharSequence p0) { return null; }
    }
}
