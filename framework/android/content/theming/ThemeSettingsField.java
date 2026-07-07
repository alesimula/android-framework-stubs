package android.content.theming;

public abstract class ThemeSettingsField<T extends java.lang.Object, J extends java.lang.Object> {
    public ThemeSettingsField() {}
    public abstract java.lang.Class<T> getFieldType();
    public abstract java.lang.Class<J> getJsonType();
    public abstract T parse(J p0);
    public abstract J serialize(T p0);
    public abstract boolean validate(T p0);
}
