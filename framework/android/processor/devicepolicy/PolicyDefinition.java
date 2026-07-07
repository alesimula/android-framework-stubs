package android.processor.devicepolicy;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface PolicyDefinition {
    public int affectedResource();
    public android.processor.devicepolicy.AllowedDpcTypes allowedDpcTypes();
    public android.processor.devicepolicy.AllowedRoles allowedRoles();
    public int[] allowedScopes();
    public java.lang.String requiredCrossUserPermission() default "";
    public java.lang.String requiredPermission() default "";
}
