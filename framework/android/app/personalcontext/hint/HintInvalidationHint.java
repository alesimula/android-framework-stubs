package android.app.personalcontext.hint;

public final class HintInvalidationHint extends android.app.personalcontext.hint.ContextHint {
    private static final java.lang.String KEY_HINT_ID = "hint_id";
    private final java.util.UUID mInvalidatedHintId = null;
    HintInvalidationHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    HintInvalidationHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    HintInvalidationHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, java.util.UUID p1) { super(null); }
    int getHintType() { return 0; }
    public java.util.UUID getInvalidatedHintId() { return null; }
    android.os.Bundle toBundleImpl() { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.app.personalcontext.hint.ContextHint.ConstructorParams.Builder mBaseBuilder = null;
        private final java.util.UUID mInvalidatedHintId = null;
        public Builder(android.app.personalcontext.hint.ContextHint p0) {}
        public Builder(java.util.UUID p0) {}
        public android.app.personalcontext.hint.HintInvalidationHint.Builder addToken(android.app.personalcontext.Token p0) { return null; }
        public android.app.personalcontext.hint.HintInvalidationHint build() { return null; }
    }
}
