package android.processor.devicepolicy;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface EnumPolicyDefinition {
    public android.processor.devicepolicy.PolicyDefinition base();
    public int defaultValue();
    public java.lang.Class<?> intDef();
    public android.processor.devicepolicy.EnumResolutionMechanism resolutionMechanism();
}
