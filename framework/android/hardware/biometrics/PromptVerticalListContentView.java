package android.hardware.biometrics;

public final class PromptVerticalListContentView implements android.hardware.biometrics.PromptContentViewParcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.PromptVerticalListContentView> CREATOR = null;
    static final int MAX_DESCRIPTION_CHARACTER_NUMBER = 225;
    static final int MAX_EACH_ITEM_CHARACTER_NUMBER = 640;
    static final int MAX_ITEM_NUMBER = 20;
    private static final java.lang.String TAG = "PromptVerticalListContentView";
    private final java.util.List<android.hardware.biometrics.PromptContentItemParcelable> mContentList = null;
    private final java.lang.String mDescription = null;
    private PromptVerticalListContentView(android.os.Parcel p0) {}
    private PromptVerticalListContentView(java.util.List<android.hardware.biometrics.PromptContentItemParcelable> p0, java.lang.String p1) {}
    public static int getMaxEachItemCharacterNumber() { return 0; }
    public static int getMaxItemCount() { return 0; }
    public int describeContents() { return 0; }
    public java.lang.String getDescription() { return null; }
    public java.util.List<android.hardware.biometrics.PromptContentItem> getListItems() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final java.util.List<android.hardware.biometrics.PromptContentItemParcelable> mContentList = null;
        private java.lang.String mDescription;
        public Builder() {}
        private void checkItemLimits(android.hardware.biometrics.PromptContentItem p0) {}
        private boolean doesListItemExceedsCharLimit(android.hardware.biometrics.PromptContentItem p0) { return false; }
        public android.hardware.biometrics.PromptVerticalListContentView.Builder addListItem(android.hardware.biometrics.PromptContentItem p0) { return null; }
        public android.hardware.biometrics.PromptVerticalListContentView.Builder addListItem(android.hardware.biometrics.PromptContentItem p0, int p1) { return null; }
        public android.hardware.biometrics.PromptVerticalListContentView build() { return null; }
        public android.hardware.biometrics.PromptVerticalListContentView.Builder setDescription(java.lang.String p0) { return null; }
    }
}
