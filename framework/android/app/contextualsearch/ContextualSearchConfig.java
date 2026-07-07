package android.app.contextualsearch;

@android.annotation.SystemApi
public final class ContextualSearchConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.contextualsearch.ContextualSearchConfig> CREATOR = null;
    public static final android.app.contextualsearch.ContextualSearchConfig DEFAULT_CONFIG = null;
    private final int mDisplayId = 0;
    private final android.os.Bundle mIntentExtras = null;
    private final int mLaunchFlags = 0;
    private final android.graphics.Rect mSourceBounds = null;
    private ContextualSearchConfig(android.app.contextualsearch.ContextualSearchConfig.Builder p0) {}
    ContextualSearchConfig(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getDisplayId() { return 0; }
    public android.os.Bundle getIntentExtras() { return null; }
    public int getLaunchFlags() { return 0; }
    public android.graphics.Rect getSourceBounds() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mDisplayId;
        private final android.os.Bundle mIntentExtras = null;
        private int mLaunchFlags;
        private android.graphics.Rect mSourceBounds;
        public Builder() {}
        public Builder(android.app.contextualsearch.ContextualSearchConfig p0) {}
        public android.app.contextualsearch.ContextualSearchConfig build() { return null; }
        public android.app.contextualsearch.ContextualSearchConfig.Builder setDisplayId(int p0) { return null; }
        public android.app.contextualsearch.ContextualSearchConfig.Builder setIntentExtras(android.os.Bundle p0) { return null; }
        public android.app.contextualsearch.ContextualSearchConfig.Builder setLaunchFlags(int p0) { return null; }
        public android.app.contextualsearch.ContextualSearchConfig.Builder setSourceBounds(android.graphics.Rect p0) { return null; }
    }
}
