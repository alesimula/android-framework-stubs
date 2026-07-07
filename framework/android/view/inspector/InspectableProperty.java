package android.view.inspector;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD})
public @interface InspectableProperty {
    public int attributeId() default 0;
    public android.view.inspector.InspectableProperty.EnumEntry[] enumMapping() default {};
    public android.view.inspector.InspectableProperty.FlagEntry[] flagMapping() default {};
    public boolean hasAttributeId() default true;
    public java.lang.String name() default "";
    public android.view.inspector.InspectableProperty.ValueType valueType() default android.view.inspector.InspectableProperty.ValueType.INFERRED;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
    public static @interface EnumEntry {
        public java.lang.String name();
        public int value();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
    public static @interface FlagEntry {
        public int mask() default 0;
        public java.lang.String name();
        public int target();
    }

    public static enum ValueType {
        COLOR,
        GRAVITY,
        INFERRED,
        INT_ENUM,
        INT_FLAG,
        NONE,
        RESOURCE_ID;
        private static final android.view.inspector.InspectableProperty.ValueType[] $VALUES = null;
        private ValueType() {}
    }
}
