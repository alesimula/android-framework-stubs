package android.processor.devicepolicy;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
public @interface LongPolicyDefinition {
    public android.processor.devicepolicy.PolicyDefinition base();
    public long maxValue() default 9223372036854775807L;
    public long minValue() default -9223372036854775808L;
    public android.processor.devicepolicy.LongResolutionMechanism resolutionMechanism();
}
