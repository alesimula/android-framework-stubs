package android.app.admin.metadata;

public abstract class ResolutionMechanismMetadata<T extends java.lang.Object> {
    public ResolutionMechanismMetadata() {}

    public static final class ListUnion<T extends java.lang.Object> extends android.app.admin.metadata.ResolutionMechanismMetadata<T> {
        public ListUnion() { super(); }
        public java.lang.String toString() { return null; }
    }

    public static final class MostRestrictive<T extends java.lang.Object> extends android.app.admin.metadata.ResolutionMechanismMetadata<T> {
        private final java.util.List<T> mMostToLeastRestrictive = null;
        public MostRestrictive() { super(); }
        public MostRestrictive(java.util.List<T> p0) { super(); }
        public java.util.List<T> getMostToLeastRestrictiveValues() { return null; }
        public java.lang.String toString() { return null; }
    }

    public static final class NotCoexistable<T extends java.lang.Object> extends android.app.admin.metadata.ResolutionMechanismMetadata<T> {
        public NotCoexistable() { super(); }
        public java.lang.String toString() { return null; }
    }
}
