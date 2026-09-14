package android.tracing.changelogging;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
public @interface TrackedField {
    public boolean isProtoInlined() default false;
    public long[] proto() default {};
    public android.tracing.changelogging.TrackedField.Transform transform() default android.tracing.changelogging.TrackedField.Transform.NONE;

    public static enum Transform {
        IDENTITY_HASH,
        NONE;
        private static final android.tracing.changelogging.TrackedField.Transform[] $VALUES = null;
        private Transform() {}
    }
}
