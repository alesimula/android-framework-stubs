package android.tracing.changelogging;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
public @interface TrackedType {
    public long[] entryPointProto() default {};
    public long[] identityHashProto() default {};
    public boolean isParentProtoInlined() default false;
    public boolean isPolymorphic() default false;
    public long[] parentProto() default {};
}
