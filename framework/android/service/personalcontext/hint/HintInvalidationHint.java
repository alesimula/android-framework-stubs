package android.service.personalcontext.hint;

@android.annotation.SystemApi
public final class HintInvalidationHint extends android.service.personalcontext.hint.ContextHint {
    private static final java.lang.String KEY_HINT_ID = "hint_id";
    private final java.util.UUID mInvalidatedHintId = null;
    HintInvalidationHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    HintInvalidationHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, java.util.UUID p1) { super(null); }
    int getHintType() { return 0; }
    public java.util.UUID getInvalidatedHintId() { return null; }
    android.os.Bundle toBundleImpl() { return null; }

    public static final class Builder {
        private final android.service.personalcontext.hint.ContextHint.ConstructorParams.Builder mBaseBuilder = null;
        private final java.util.UUID mInvalidatedHintId = null;
        public Builder(android.service.personalcontext.hint.ContextHint p0) {}
        public Builder(java.util.UUID p0) {}
        public android.service.personalcontext.hint.HintInvalidationHint.Builder addToken(android.service.personalcontext.Token p0) { return null; }
        public android.service.personalcontext.hint.HintInvalidationHint build() { return null; }
    }
}
