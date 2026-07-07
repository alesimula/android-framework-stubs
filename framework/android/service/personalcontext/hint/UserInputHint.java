package android.service.personalcontext.hint;

@android.annotation.SystemApi
public final class UserInputHint extends android.service.personalcontext.hint.ContextHint {
    private static final java.lang.String KEY_SOURCE_APP_ACTIVITY_COMPONENT_NAME = "key_source_app_activity_component_name";
    private static final java.lang.String KEY_USER_INPUT_TEXT = "key_user_input_text";
    private final android.content.ComponentName mSourceAppActivityComponentName = null;
    private final android.service.personalcontext.hint.UserInputText mUserInputText = null;
    UserInputHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    private UserInputHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, android.service.personalcontext.hint.UserInputText p1, android.content.ComponentName p2) { super(null); }
    public boolean equals(java.lang.Object p0) { return false; }
    int getHintType() { return 0; }
    public android.content.ComponentName getSourceAppActivityComponentName() { return null; }
    public java.lang.String getSourcePackageName() { return null; }
    public android.service.personalcontext.hint.UserInputText getUserInputText() { return null; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl() { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private final android.service.personalcontext.hint.ContextHint.ConstructorParams.Builder mBaseBuilder = null;
        private android.content.ComponentName mSourceAppActivityComponentName;
        private android.service.personalcontext.hint.UserInputText mUserInputText;
        public Builder(android.service.personalcontext.hint.UserInputText p0) {}
        public android.service.personalcontext.hint.UserInputHint.Builder addToken(android.service.personalcontext.Token p0) { return null; }
        public android.service.personalcontext.hint.UserInputHint build() { return null; }
        public android.service.personalcontext.hint.UserInputHint.Builder setSourceAppActivityComponentName(android.content.ComponentName p0) { return null; }
    }
}
