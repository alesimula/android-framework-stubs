package android.content.pm;

public class AppSearchShortcutPerson {
    private static final java.lang.String KEY_ICON = "icon";
    private static final java.lang.String KEY_IS_BOT = "isBot";
    private static final java.lang.String KEY_IS_IMPORTANT = "isImportant";
    private static final java.lang.String KEY_KEY = "key";
    private static final java.lang.String KEY_NAME = "name";
    public static final java.lang.String SCHEMA_TYPE = "ShortcutPerson";
    public AppSearchShortcutPerson(android.app.appsearch.GenericDocument p0) {}
    public static android.content.pm.AppSearchShortcutPerson instance(android.app.Person p0) { return null; }
    private static byte[] transformToByteArray(android.graphics.drawable.Icon p0) { return null; }
    private android.graphics.drawable.Icon transformToIcon(byte[] p0) { return null; }
    public android.app.Person toPerson() { return null; }

    public static class Builder {
        public Builder(java.lang.String p0) {}
        public android.content.pm.AppSearchShortcutPerson build() { return null; }
        public android.content.pm.AppSearchShortcutPerson.Builder setIcon(byte[] p0) { return null; }
        public android.content.pm.AppSearchShortcutPerson.Builder setIsBot(boolean p0) { return null; }
        public android.content.pm.AppSearchShortcutPerson.Builder setIsImportant(boolean p0) { return null; }
        public android.content.pm.AppSearchShortcutPerson.Builder setKey(java.lang.String p0) { return null; }
        public android.content.pm.AppSearchShortcutPerson.Builder setName(java.lang.CharSequence p0) { return null; }
    }
}
