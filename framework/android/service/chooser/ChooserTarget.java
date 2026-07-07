package android.service.chooser;

@java.lang.Deprecated
public final class ChooserTarget implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.chooser.ChooserTarget> CREATOR = null;
    private static final java.lang.String TAG = "ChooserTarget";
    private android.content.ComponentName mComponentName;
    private android.graphics.drawable.Icon mIcon;
    private android.os.Bundle mIntentExtras;
    private float mScore;
    private java.lang.CharSequence mTitle;
    ChooserTarget(android.os.Parcel p0) {}
    public ChooserTarget(java.lang.CharSequence p0, android.graphics.drawable.Icon p1, float p2, android.content.ComponentName p3, android.os.Bundle p4) {}
    public int describeContents() { return 0; }
    public android.content.ComponentName getComponentName() { return null; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public android.os.Bundle getIntentExtras() { return null; }
    public float getScore() { return 0.0f; }
    public java.lang.CharSequence getTitle() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
