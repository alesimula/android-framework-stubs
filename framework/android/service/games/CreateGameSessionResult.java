package android.service.games;

public final class CreateGameSessionResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.games.CreateGameSessionResult> CREATOR = null;
    private final android.service.games.IGameSession mGameSession = null;
    private final android.view.SurfaceControlViewHost.SurfacePackage mSurfacePackage = null;
    public CreateGameSessionResult(android.service.games.IGameSession p0, android.view.SurfaceControlViewHost.SurfacePackage p1) {}
    public int describeContents() { return 0; }
    public android.service.games.IGameSession getGameSession() { return null; }
    public android.view.SurfaceControlViewHost.SurfacePackage getSurfacePackage() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
