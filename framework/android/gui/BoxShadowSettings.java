package android.gui;

public class BoxShadowSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.gui.BoxShadowSettings> CREATOR = null;
    public android.gui.BoxShadowSettings.BoxShadowParams[] boxShadows;
    public BoxShadowSettings() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class BoxShadowParams implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.gui.BoxShadowSettings.BoxShadowParams> CREATOR = null;
        public float blurRadius;
        public int color;
        public float offsetX;
        public float offsetY;
        public float spreadRadius;
        public BoxShadowParams() {}
        public int describeContents() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
