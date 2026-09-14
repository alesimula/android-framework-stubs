package android.app.personalcontext.hint;

public final class BundleHint extends android.app.personalcontext.hint.ContextHint {
    private static final java.lang.String KEY_DATA = "data";
    private static final java.lang.String KEY_TYPE = "type";
    private final android.os.Bundle mDataBundle = null;
    private final java.lang.String mHintTypeName = null;
    BundleHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    BundleHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    BundleHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, java.lang.String p1, android.os.Bundle p2) { super(null); }
    public android.os.Bundle getDataBundle() { return null; }
    int getHintType() { return 0; }
    public java.lang.String getHintTypeName() { return null; }
    android.os.Bundle toBundleImpl() { return null; }
    public java.lang.String toString() { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1) {}
    public void writeToSignatureParcel(android.os.Parcel p0) {}

    public static final class Builder {
        private final android.app.personalcontext.hint.ContextHint.ConstructorParams.Builder mBaseBuilder = null;
        private final android.os.Bundle mBundle = null;
        private java.lang.String mHintTypeName;
        public Builder() {}
        public android.app.personalcontext.hint.BundleHint.Builder addToken(android.app.personalcontext.Token p0) { return null; }
        public android.app.personalcontext.hint.BundleHint build() { return null; }
        public android.app.personalcontext.hint.BundleHint.Builder setDataBundle(android.os.Bundle p0) { return null; }
        public android.app.personalcontext.hint.BundleHint.Builder setHintTypeName(java.lang.String p0) { return null; }
    }
}
