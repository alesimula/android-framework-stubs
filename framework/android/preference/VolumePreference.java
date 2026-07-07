package android.preference;

@java.lang.Deprecated
public class VolumePreference extends android.preference.SeekBarDialogPreference implements android.preference.PreferenceManager.OnActivityStopListener, android.view.View.OnKeyListener, android.preference.SeekBarVolumizer.Callback {
    private android.preference.SeekBarVolumizer mSeekBarVolumizer;
    private int mStreamType;
    public VolumePreference(android.content.Context p0) { super((android.content.Context)null); }
    public VolumePreference(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public VolumePreference(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public VolumePreference(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void cleanup() {}
    public void onActivityStop() {}
    protected void onBindDialogView(android.view.View p0) {}
    protected void onDialogClosed(boolean p0) {}
    public boolean onKey(android.view.View p0, int p1, android.view.KeyEvent p2) { return false; }
    public void onMuted(boolean p0, boolean p1) {}
    public void onProgressChanged(android.widget.SeekBar p0, int p1, boolean p2) {}
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    public void onSampleStarting(android.preference.SeekBarVolumizer p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    public void onStartTrackingTouch(android.preference.SeekBarVolumizer p0) {}
    public void setStreamType(int p0) {}

    private static class SavedState extends android.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<android.preference.VolumePreference.SavedState> CREATOR = null;
        android.preference.VolumePreference.VolumeStore mVolumeStore;
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        android.preference.VolumePreference.VolumeStore getVolumeStore() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class VolumeStore {
        public int originalVolume;
        public int volume;
        public VolumeStore() {}
    }
}
