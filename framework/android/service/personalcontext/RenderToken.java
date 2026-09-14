package android.service.personalcontext;

@android.annotation.SystemApi
public final class RenderToken implements android.os.Parcelable, java.lang.Comparable<android.service.personalcontext.RenderToken> {
    public static final android.os.Parcelable.Creator<android.service.personalcontext.RenderToken> CREATOR = null;
    private final java.util.UUID mId = null;
    private final java.util.UUID mRendererComponentId = null;
    private final java.lang.String mTag = null;
    private RenderToken(android.os.Parcel p0) {}
    public RenderToken(java.util.UUID p0, java.lang.String p1) {}
    public RenderToken(java.util.UUID p0, java.util.UUID p1, java.lang.String p2) {}
    public static android.app.personalcontext.RenderToken toApp(android.service.personalcontext.RenderToken p0) { return null; }
    public static android.service.personalcontext.RenderToken toService(android.app.personalcontext.RenderToken p0) { return null; }
    public int compareTo(android.service.personalcontext.RenderToken p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.UUID getRendererComponentId() { return null; }
    public java.lang.String getTag() { return null; }
    public java.util.UUID getTokenId() { return null; }
    public int hashCode() { return 0; }
    public android.app.personalcontext.RenderToken toAppPersonalContextPackageRenderToken() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
