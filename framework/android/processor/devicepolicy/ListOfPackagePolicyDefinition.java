package android.processor.devicepolicy;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
public @interface ListOfPackagePolicyDefinition {
    public android.processor.devicepolicy.PolicyDefinition base();
    public boolean emptyListAllowed() default false;
    public int maxListLength() default 10000;
    public android.processor.devicepolicy.ListResolutionMechanism resolutionMechanism();
}
