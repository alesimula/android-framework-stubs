package android.service.autofill;

public final class BatchUpdates implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.autofill.BatchUpdates> CREATOR = null;
    private final java.util.ArrayList<android.util.Pair<java.lang.Integer, android.service.autofill.InternalTransformation>> mTransformations = null;
    private final android.widget.RemoteViews mUpdates = null;
    private BatchUpdates(android.service.autofill.BatchUpdates.Builder p0) {}
    public int describeContents() { return 0; }
    public java.util.ArrayList<android.util.Pair<java.lang.Integer, android.service.autofill.InternalTransformation>> getTransformations() { return null; }
    public android.widget.RemoteViews getUpdates() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private boolean mDestroyed;
        private java.util.ArrayList<android.util.Pair<java.lang.Integer, android.service.autofill.InternalTransformation>> mTransformations;
        private android.widget.RemoteViews mUpdates;
        public Builder() {}
        private void throwIfDestroyed() {}
        public android.service.autofill.BatchUpdates build() { return null; }
        public android.service.autofill.BatchUpdates.Builder transformChild(int p0, android.service.autofill.Transformation p1) { return null; }
        public android.service.autofill.BatchUpdates.Builder updateTemplate(android.widget.RemoteViews p0) { return null; }
    }
}
