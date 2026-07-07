package android.processor.devicepolicy;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
public @interface ListOfStringPolicyDefinition {
    public android.processor.devicepolicy.PolicyDefinition base();
    public boolean emptyListAllowed() default false;
    public boolean emptyStringAllowed() default false;
    public int maxListLength() default 10000;
    public int maxStringLength() default 2147483647;
    public boolean pureWhitespaceAllowed() default false;
    public android.processor.devicepolicy.ListResolutionMechanism resolutionMechanism();
    public boolean unprintableCharactersAllowed() default false;
    public boolean unstrippedStringAllowed() default false;
}
