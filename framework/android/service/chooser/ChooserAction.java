package android.service.chooser;

public final class ChooserAction implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.chooser.ChooserAction> CREATOR = null;
    private final android.app.PendingIntent mAction = null;
    private final android.graphics.drawable.Icon mIcon = null;
    private final java.lang.CharSequence mLabel = null;
    private ChooserAction(android.graphics.drawable.Icon p0, java.lang.CharSequence p1, android.app.PendingIntent p2) {}
    public int describeContents() { return 0; }
    public android.app.PendingIntent getAction() { return null; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public java.lang.CharSequence getLabel() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.app.PendingIntent mAction = null;
        private final android.graphics.drawable.Icon mIcon = null;
        private final java.lang.CharSequence mLabel = null;
        public Builder(android.graphics.drawable.Icon p0, java.lang.CharSequence p1, android.app.PendingIntent p2) {}
        public android.service.chooser.ChooserAction build() { return null; }
    }
}
