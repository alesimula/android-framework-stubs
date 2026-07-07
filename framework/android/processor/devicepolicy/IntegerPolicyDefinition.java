package android.processor.devicepolicy;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
public @interface IntegerPolicyDefinition {
    public android.processor.devicepolicy.PolicyDefinition base();
    public int maxValue() default 2147483647;
    public int minValue() default -2147483648;
    public android.processor.devicepolicy.IntegerResolutionMechanism resolutionMechanism();
}
