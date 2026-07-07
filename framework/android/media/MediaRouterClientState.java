package android.media;

public final class MediaRouterClientState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.MediaRouterClientState> CREATOR = null;
    public final java.util.ArrayList<android.media.MediaRouterClientState.RouteInfo> routes = null;
    public MediaRouterClientState() {}
    MediaRouterClientState(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.media.MediaRouterClientState.RouteInfo getRoute(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class RouteInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.media.MediaRouterClientState.RouteInfo> CREATOR = null;
        public java.lang.String description;
        public int deviceType;
        public boolean enabled;
        public java.lang.String id;
        public java.lang.String name;
        public int playbackStream;
        public int playbackType;
        public int presentationDisplayId;
        public int statusCode;
        public int supportedTypes;
        public int volume;
        public int volumeHandling;
        public int volumeMax;
        public RouteInfo(android.media.MediaRouterClientState.RouteInfo p0) {}
        RouteInfo(android.os.Parcel p0) {}
        public RouteInfo(java.lang.String p0) {}
        public int describeContents() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
