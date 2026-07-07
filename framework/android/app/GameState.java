package android.app;

public final class GameState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.GameState> CREATOR = null;
    public static final int MODE_CONTENT = 4;
    public static final int MODE_GAMEPLAY_INTERRUPTIBLE = 2;
    public static final int MODE_GAMEPLAY_UNINTERRUPTIBLE = 3;
    public static final int MODE_NONE = 1;
    public static final int MODE_UNKNOWN = 0;
    private final boolean mIsLoading = false;
    private final int mLabel = 0;
    private final int mMode = 0;
    private final int mQuality = 0;
    private GameState(android.os.Parcel p0) {}
    public GameState(boolean p0, int p1) {}
    public GameState(boolean p0, int p1, int p2, int p3) {}
    public int describeContents() { return 0; }
    public int getLabel() { return 0; }
    public int getMode() { return 0; }
    public int getQuality() { return 0; }
    public boolean isLoading() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface GameStateMode {
    }
}
