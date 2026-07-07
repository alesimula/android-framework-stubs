package android.service.dreams;

public final class DreamPlaylist implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.dreams.DreamPlaylist> CREATOR = null;
    public static final android.service.dreams.DreamPlaylist EMPTY = null;
    public static final int NO_ACTIVE_DREAM_INDEX = -1;
    private final int mActiveIndex = 0;
    private final java.util.List<android.service.dreams.DreamItem> mDreams = null;
    private DreamPlaylist(android.os.Parcel p0) {}
    public DreamPlaylist(java.util.List<android.service.dreams.DreamItem> p0, int p1) {}
    public boolean contains(android.content.ComponentName p0) { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.service.dreams.DreamItem getActiveDream() { return null; }
    public int getActiveIndex() { return 0; }
    public java.util.List<android.service.dreams.DreamItem> getDreams() { return null; }
    public android.service.dreams.DreamItem getNextDream() { return null; }
    public android.service.dreams.DreamItem getPreviousDream() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
