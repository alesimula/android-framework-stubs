package android.app.wallpaper;

public final class PreviewConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.wallpaper.PreviewConfig> CREATOR = null;
    private static final java.lang.String TAG = "PreviewConfig";
    public final android.app.wallpaper.PreviewConfig.Option effectsButton = null;
    public final java.util.List<android.app.wallpaper.PreviewConfig.OptionGroup> optionGroups = null;
    public final android.app.wallpaper.PreviewConfig.Option optionsButton = null;
    private PreviewConfig(android.app.wallpaper.PreviewConfig.Option p0, android.app.wallpaper.PreviewConfig.Option p1, java.util.List<android.app.wallpaper.PreviewConfig.OptionGroup> p2) {}
    private PreviewConfig(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.app.wallpaper.PreviewConfig.Option getEffectsButton() { return null; }
    public java.util.List<android.app.wallpaper.PreviewConfig.OptionGroup> getOptionGroups() { return null; }
    public android.app.wallpaper.PreviewConfig.Option getOptionsButton() { return null; }
    public android.app.wallpaper.PreviewConfig.Builder toBuilder() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.app.wallpaper.PreviewConfig.Option mEffectsButton;
        private java.util.List<android.app.wallpaper.PreviewConfig.OptionGroup> mOptionGroups;
        private android.app.wallpaper.PreviewConfig.Option mOptionsButton;
        public Builder() {}
        public android.app.wallpaper.PreviewConfig.Builder addOptionGroup(android.app.wallpaper.PreviewConfig.OptionGroup p0) { return null; }
        public android.app.wallpaper.PreviewConfig build() { return null; }
        public android.app.wallpaper.PreviewConfig.Builder setEffectsButton(android.app.wallpaper.PreviewConfig.Option p0) { return null; }
        public android.app.wallpaper.PreviewConfig.Builder setOptionGroups(java.util.List<android.app.wallpaper.PreviewConfig.OptionGroup> p0) { return null; }
        public android.app.wallpaper.PreviewConfig.Builder setOptionsButton(android.app.wallpaper.PreviewConfig.Option p0) { return null; }
    }

    public static class Option implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.wallpaper.PreviewConfig.Option> CREATOR = null;
        public final android.os.PersistableBundle content = null;
        public final int iconId = 0;
        public final int labelId = 0;
        public final java.lang.String value = null;
        Option(android.os.Parcel p0) {}
        public Option(java.lang.String p0, int p1, int p2, android.os.PersistableBundle p3) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class OptionGroup implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.wallpaper.PreviewConfig.OptionGroup> CREATOR = null;
        public final android.app.wallpaper.PreviewConfig.Option groupOption = null;
        public final java.util.List<android.app.wallpaper.PreviewConfig.Option> options = null;
        private int selectedIndex;
        public OptionGroup(android.app.wallpaper.PreviewConfig.Option p0, java.util.List<android.app.wallpaper.PreviewConfig.Option> p1) {}
        OptionGroup(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public android.app.wallpaper.PreviewConfig.Option getGroupOption() { return null; }
        public java.util.List<android.app.wallpaper.PreviewConfig.Option> getOptions() { return null; }
        public int getSelectedIndex() { return 0; }
        public void setSelectedIndex(int p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
