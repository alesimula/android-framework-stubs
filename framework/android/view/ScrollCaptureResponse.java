package android.view;

public class ScrollCaptureResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.ScrollCaptureResponse> CREATOR = null;
    private android.graphics.Rect mBoundsInWindow;
    private android.view.IScrollCaptureConnection mConnection;
    private java.lang.String mDescription;
    private java.util.ArrayList<java.lang.String> mMessages;
    private java.lang.String mPackageName;
    private android.graphics.Rect mWindowBounds;
    private java.lang.String mWindowTitle;
    protected ScrollCaptureResponse(android.os.Parcel p0) {}
    ScrollCaptureResponse(java.lang.String p0, android.view.IScrollCaptureConnection p1, android.graphics.Rect p2, android.graphics.Rect p3, java.lang.String p4, java.lang.String p5, java.util.ArrayList<java.lang.String> p6) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public void close() {}
    public int describeContents() { return 0; }
    public android.graphics.Rect getBoundsInWindow() { return null; }
    public android.view.IScrollCaptureConnection getConnection() { return null; }
    public java.lang.String getDescription() { return null; }
    public java.util.ArrayList<java.lang.String> getMessages() { return null; }
    public java.lang.String getPackageName() { return null; }
    public android.graphics.Rect getWindowBounds() { return null; }
    public java.lang.String getWindowTitle() { return null; }
    public boolean isConnected() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private android.graphics.Rect mBoundsInWindow;
        private long mBuilderFieldsSet;
        private android.view.IScrollCaptureConnection mConnection;
        private java.lang.String mDescription;
        private java.util.ArrayList<java.lang.String> mMessages;
        private java.lang.String mPackageName;
        private android.graphics.Rect mWindowBounds;
        private java.lang.String mWindowTitle;
        public Builder() {}
        private void checkNotUsed() {}
        public android.view.ScrollCaptureResponse.Builder addMessage(java.lang.String p0) { return null; }
        public android.view.ScrollCaptureResponse build() { return null; }
        public android.view.ScrollCaptureResponse.Builder setBoundsInWindow(android.graphics.Rect p0) { return null; }
        public android.view.ScrollCaptureResponse.Builder setConnection(android.view.IScrollCaptureConnection p0) { return null; }
        public android.view.ScrollCaptureResponse.Builder setDescription(java.lang.String p0) { return null; }
        public android.view.ScrollCaptureResponse.Builder setMessages(java.util.ArrayList<java.lang.String> p0) { return null; }
        public android.view.ScrollCaptureResponse.Builder setPackageName(java.lang.String p0) { return null; }
        public android.view.ScrollCaptureResponse.Builder setWindowBounds(android.graphics.Rect p0) { return null; }
        public android.view.ScrollCaptureResponse.Builder setWindowTitle(java.lang.String p0) { return null; }
    }
}
