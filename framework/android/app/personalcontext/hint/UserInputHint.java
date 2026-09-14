package android.app.personalcontext.hint;

public final class UserInputHint extends android.app.personalcontext.hint.ContextHint {
    private static final java.lang.String KEY_SOURCE_APP_ACTIVITY_COMPONENT_NAME = "key_source_app_activity_component_name";
    private static final java.lang.String KEY_USER_INPUT_TEXT = "key_user_input_text";
    private final android.content.ComponentName mSourceAppActivityComponentName = null;
    private final android.app.personalcontext.hint.UserInputText mUserInputText = null;
    UserInputHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, android.app.personalcontext.hint.UserInputText p1, android.content.ComponentName p2) { super(null); }
    UserInputHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    UserInputHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    public boolean equals(java.lang.Object p0) { return false; }
    int getHintType() { return 0; }
    public android.content.ComponentName getSourceAppActivityComponentName() { return null; }
    public java.lang.String getSourcePackageName() { return null; }
    public android.app.personalcontext.hint.UserInputText getUserInputText() { return null; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl() { return null; }
    public java.lang.String toString() { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.app.personalcontext.hint.ContextHint.ConstructorParams.Builder mBaseBuilder = null;
        private android.content.ComponentName mSourceAppActivityComponentName;
        private android.app.personalcontext.hint.UserInputText mUserInputText;
        public Builder(android.app.personalcontext.hint.UserInputText p0) {}
        public android.app.personalcontext.hint.UserInputHint.Builder addToken(android.app.personalcontext.Token p0) { return null; }
        public android.app.personalcontext.hint.UserInputHint build() { return null; }
        public android.app.personalcontext.hint.UserInputHint.Builder setSourceAppActivityComponentName(android.content.ComponentName p0) { return null; }
    }
}
