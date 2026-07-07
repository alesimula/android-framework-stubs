package android.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
public @interface SdkConstant {
    public android.annotation.SdkConstant.SdkConstantType value();

    public static enum SdkConstantType {
        ACTIVITY_INTENT_ACTION,
        BROADCAST_INTENT_ACTION,
        FEATURE,
        INTENT_CATEGORY,
        SERVICE_ACTION;
        private static final android.annotation.SdkConstant.SdkConstantType[] $VALUES = null;
        private SdkConstantType() {}
    }
}
