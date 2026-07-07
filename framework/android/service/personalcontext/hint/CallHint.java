package android.service.personalcontext.hint;

@android.annotation.SystemApi
public final class CallHint extends android.service.personalcontext.hint.ContextHint {
    private static final java.lang.String KEY_MODALITY = "modality";
    private static final java.lang.String KEY_PARTICIPANTS = "participants";
    public static final int MODALITY_AUDIO = 1;
    public static final int MODALITY_UNKNOWN = -1;
    public static final int MODALITY_VIDEO = 2;
    private static final java.lang.String TAG = "CallHint";
    private final int mModality = 0;
    private final java.util.HashSet<android.app.Person> mParticipants = null;
    private CallHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, int p1, java.util.Set<android.app.Person> p2) { super(null); }
    CallHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    public boolean equals(java.lang.Object p0) { return false; }
    int getHintType() { return 0; }
    public int getModality() { return 0; }
    public java.util.Set<android.app.Person> getParticipants() { return null; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl() { return null; }

    public static final class Builder {
        private final android.service.personalcontext.hint.ContextHint.ConstructorParams.Builder mBaseBuilder = null;
        private final int mModality = 0;
        private final java.util.Set<android.app.Person> mParticipants = null;
        public Builder(int p0, java.util.Set<android.app.Person> p1) {}
        public android.service.personalcontext.hint.CallHint.Builder addToken(android.service.personalcontext.Token p0) { return null; }
        public android.service.personalcontext.hint.CallHint build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Modality {
    }
}
