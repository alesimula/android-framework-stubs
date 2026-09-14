package android.app.personalcontext;

public final class RenderToken implements android.os.Parcelable, java.lang.Comparable<android.app.personalcontext.RenderToken> {
    public static final android.os.Parcelable.Creator<android.app.personalcontext.RenderToken> CREATOR = null;
    private final java.util.UUID mId = null;
    private final java.util.UUID mRendererComponentId = null;
    private final java.lang.String mTag = null;
    private RenderToken(android.os.Parcel p0) {}
    public RenderToken(java.util.UUID p0, java.lang.String p1) {}
    public RenderToken(java.util.UUID p0, java.util.UUID p1, java.lang.String p2) {}
    public int compareTo(android.app.personalcontext.RenderToken p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.UUID getRendererComponentId() { return null; }
    public java.lang.String getTag() { return null; }
    public java.util.UUID getTokenId() { return null; }
    public int hashCode() { return 0; }
    public android.service.personalcontext.RenderToken toServicePersonalContextPackageRenderToken() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
