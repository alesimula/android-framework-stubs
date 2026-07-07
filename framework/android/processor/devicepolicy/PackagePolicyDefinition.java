package android.processor.devicepolicy;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
public @interface PackagePolicyDefinition {
    public android.processor.devicepolicy.PolicyDefinition base();
    public android.processor.devicepolicy.PackageResolutionMechanism resolutionMechanism();
}
