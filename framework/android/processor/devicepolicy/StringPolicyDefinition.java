package android.processor.devicepolicy;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
public @interface StringPolicyDefinition {
    public android.processor.devicepolicy.PolicyDefinition base();
    public boolean emptyStringAllowed() default false;
    public int maxLength() default 2147483647;
    public boolean pureWhitespaceAllowed() default false;
    public android.processor.devicepolicy.StringResolutionMechanism resolutionMechanism();
    public boolean unprintableCharactersAllowed() default false;
    public boolean unstrippedStringAllowed() default false;
}
