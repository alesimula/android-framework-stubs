package android.service.autofill;

public final class CustomDescription implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.autofill.CustomDescription> CREATOR = null;
    private final android.util.SparseArray<android.service.autofill.InternalOnClickAction> mActions = null;
    private final android.widget.RemoteViews mPresentation = null;
    private final java.util.ArrayList<android.util.Pair<java.lang.Integer, android.service.autofill.InternalTransformation>> mTransformations = null;
    private final java.util.ArrayList<android.util.Pair<android.service.autofill.InternalValidator, android.service.autofill.BatchUpdates>> mUpdates = null;
    private CustomDescription(android.service.autofill.CustomDescription.Builder p0) {}
    public int describeContents() { return 0; }
    public android.util.SparseArray<android.service.autofill.InternalOnClickAction> getActions() { return null; }
    public android.widget.RemoteViews getPresentation() { return null; }
    public java.util.ArrayList<android.util.Pair<java.lang.Integer, android.service.autofill.InternalTransformation>> getTransformations() { return null; }
    public java.util.ArrayList<android.util.Pair<android.service.autofill.InternalValidator, android.service.autofill.BatchUpdates>> getUpdates() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private android.util.SparseArray<android.service.autofill.InternalOnClickAction> mActions;
        private boolean mDestroyed;
        private final android.widget.RemoteViews mPresentation = null;
        private java.util.ArrayList<android.util.Pair<java.lang.Integer, android.service.autofill.InternalTransformation>> mTransformations;
        private java.util.ArrayList<android.util.Pair<android.service.autofill.InternalValidator, android.service.autofill.BatchUpdates>> mUpdates;
        public Builder(android.widget.RemoteViews p0) {}
        private void throwIfDestroyed() {}
        public android.service.autofill.CustomDescription.Builder addChild(int p0, android.service.autofill.Transformation p1) { return null; }
        public android.service.autofill.CustomDescription.Builder addOnClickAction(int p0, android.service.autofill.OnClickAction p1) { return null; }
        public android.service.autofill.CustomDescription.Builder batchUpdate(android.service.autofill.Validator p0, android.service.autofill.BatchUpdates p1) { return null; }
        public android.service.autofill.CustomDescription build() { return null; }
    }
}
