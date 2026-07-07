package android.hardware.input;

public interface AppLaunchData {
    public static android.hardware.input.AppLaunchData createLaunchData(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return null; }
    public static android.hardware.input.AppLaunchData createLaunchDataForCategory(java.lang.String p0) { return null; }
    public static android.hardware.input.AppLaunchData createLaunchDataForComponent(java.lang.String p0, java.lang.String p1) { return null; }
    public static android.hardware.input.AppLaunchData createLaunchDataForNotes() { return null; }
    public static android.hardware.input.AppLaunchData createLaunchDataForRole(java.lang.String p0) { return null; }
    default public int getKeyGestureType() { return 0; }

    public static class CategoryData implements android.hardware.input.AppLaunchData {
        private final java.lang.String mCategory = null;
        public CategoryData(java.lang.String p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getCategory() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class ComponentData implements android.hardware.input.AppLaunchData {
        private final java.lang.String mClassName = null;
        private final java.lang.String mPackageName = null;
        public ComponentData(java.lang.String p0, java.lang.String p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getClassName() { return null; }
        public java.lang.String getPackageName() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class NotesLaunchData implements android.hardware.input.AppLaunchData {
        public NotesLaunchData() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int getKeyGestureType() { return 0; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class RoleData implements android.hardware.input.AppLaunchData {
        private final java.lang.String mRole = null;
        public RoleData(java.lang.String p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getRole() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
