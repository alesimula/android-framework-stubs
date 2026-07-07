package android.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.PACKAGE})
public @interface SystemApi {
    public android.annotation.SystemApi.Client client() default android.annotation.SystemApi.Client.PRIVILEGED_APPS;

    public static enum Client {
        MODULE_LIBRARIES,
        PRIVILEGED_APPS,
        SYSTEM_SERVER;
        private static final android.annotation.SystemApi.Client[] $VALUES = null;
        private Client() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
    public static @interface Container {
        public android.annotation.SystemApi[] value();
    }
}
