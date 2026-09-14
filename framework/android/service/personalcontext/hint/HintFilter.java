package android.service.personalcontext.hint;

@android.annotation.SystemApi
public final class HintFilter implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.personalcontext.hint.HintFilter> CREATOR = null;
    public static final int FILTER_TYPE_ALLOWED = 1;
    public static final int FILTER_TYPE_NONE = 0;
    public static final int FILTER_TYPE_REQUIRED = 2;
    private static final java.lang.String TAG = "HintFilter";
    private final java.util.Set<android.service.personalcontext.hint.HintFilter.FilterEntry> mFilterEntries = null;
    private final java.util.Set<android.service.personalcontext.hint.HintFilter.FilterEntryLegacy> mFilterEntriesLegacy = null;
    private HintFilter(android.os.Parcel p0) {}
    private HintFilter(java.util.Collection<android.service.personalcontext.hint.HintFilter.FilterEntry> p0, java.util.Collection<android.service.personalcontext.hint.HintFilter.FilterEntryLegacy> p1) {}
    private java.util.Set<android.service.personalcontext.hint.HintFilter.FilterEntry> findMatchingFilters(android.service.personalcontext.hint.ContextHint p0, java.util.Set<android.service.personalcontext.hint.HintFilter.FilterEntry> p1) { return null; }
    private android.util.ArraySet<android.service.personalcontext.hint.HintFilter.FilterEntry> getFilterEntries(int p0) { return null; }
    private android.util.ArraySet<android.service.personalcontext.hint.HintFilter.FilterEntryLegacy> getFilterEntriesLegacy(int p0) { return null; }
    public int describeContents() { return 0; }
    public java.util.Set<java.lang.String> getBundleHintTypeNames() { return null; }
    public java.util.Set<java.lang.String> getBundleHintTypeNames(int p0) { return null; }
    public java.util.Set<java.lang.Class> getHintTypes() { return null; }
    public java.util.Set<java.lang.Class> getHintTypes(int p0) { return null; }
    public java.util.Set<android.service.personalcontext.hint.ContextHint> getInterestedHintClusters(java.util.Set<android.service.personalcontext.hint.ContextHint> p0) { return null; }
    public java.util.Set<android.service.personalcontext.hint.PublishedContextHint> getInterestedHintClusters(java.util.Set<android.service.personalcontext.hint.PublishedContextHint> p0, java.util.Set<java.util.UUID> p1) { return null; }
    public java.util.Set<android.service.personalcontext.hint.PublishedContextHint> getInterestedHintClustersLegacy(java.util.Set<android.service.personalcontext.hint.PublishedContextHint> p0) { return null; }
    public java.util.Set<java.lang.String> getPackages() { return null; }
    public java.util.Set<java.lang.String> getPackages(int p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FilterType {
    }

    public static final class Builder {
        private final java.util.Set<android.service.personalcontext.hint.HintFilter.FilterEntry> mFilterEntries = null;
        private final java.util.Set<android.service.personalcontext.hint.HintFilter.FilterEntryLegacy> mFilterEntriesLegacy = null;
        public Builder() {}
        public android.service.personalcontext.hint.HintFilter.Builder addBundleHintTypeName(java.lang.String p0, int p1) { return null; }
        public android.service.personalcontext.hint.HintFilter.Builder addHintType(java.lang.Class<? extends android.service.personalcontext.hint.ContextHint> p0, int p1) { return null; }
        public android.service.personalcontext.hint.HintFilter.Builder addPackage(java.lang.String p0, int p1) { return null; }
        public android.service.personalcontext.hint.HintFilter build() { return null; }
    }

    private static class BundleHintTypeNameEntryLegacy extends android.service.personalcontext.hint.HintFilter.FilterEntryLegacy {
        public static final android.os.Parcelable.Creator<android.service.personalcontext.hint.HintFilter.BundleHintTypeNameEntryLegacy> CREATOR = null;
        private final java.lang.String mBundleHintTypeName = null;
        protected BundleHintTypeNameEntryLegacy(int p0, java.lang.String p1) { super(0); }
        protected BundleHintTypeNameEntryLegacy(android.os.Parcel p0) { super(0); }
        public int describeContents() { return 0; }
        public java.lang.String getBundleHintTypeName() { return null; }
        public boolean matches(android.service.personalcontext.hint.PublishedContextHint p0) { return false; }
        public void visit(android.service.personalcontext.hint.HintFilter.FilterEntryVisitorLegacy p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private static interface FilterEntryVisitor {
        default public void onVisit(android.service.personalcontext.hint.HintFilter.BundleHintTypeNameEntry p0) {}
        default public void onVisit(android.service.personalcontext.hint.HintFilter.ContextHintClassEntry p0) {}
        default public void onVisit(android.service.personalcontext.hint.HintFilter.PackageEntry p0) {}
    }

    private static class PackageEntryLegacy extends android.service.personalcontext.hint.HintFilter.FilterEntryLegacy {
        public static final android.os.Parcelable.Creator<android.service.personalcontext.hint.HintFilter.PackageEntryLegacy> CREATOR = null;
        private final java.lang.String mPackageName = null;
        PackageEntryLegacy(int p0, java.lang.String p1) { super(0); }
        PackageEntryLegacy(android.os.Parcel p0) { super(0); }
        public int describeContents() { return 0; }
        public java.lang.String getPackageName() { return null; }
        public boolean matches(android.service.personalcontext.hint.PublishedContextHint p0) { return false; }
        public void visit(android.service.personalcontext.hint.HintFilter.FilterEntryVisitorLegacy p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private static class ContextHintClassEntryLegacy extends android.service.personalcontext.hint.HintFilter.FilterEntryLegacy {
        public static final android.os.Parcelable.Creator<android.service.personalcontext.hint.HintFilter.ContextHintClassEntryLegacy> CREATOR = null;
        final java.lang.String mContextHintClassName = null;
        ContextHintClassEntryLegacy(int p0, java.lang.Class<? extends android.service.personalcontext.hint.ContextHint> p1) { super(0); }
        protected ContextHintClassEntryLegacy(android.os.Parcel p0) { super(0); }
        public int describeContents() { return 0; }
        public java.lang.Class getContextHintClass() throws java.lang.ClassNotFoundException { return null; }
        public boolean matches(android.service.personalcontext.hint.PublishedContextHint p0) { return false; }
        public void visit(android.service.personalcontext.hint.HintFilter.FilterEntryVisitorLegacy p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private static class PackageEntry extends android.service.personalcontext.hint.HintFilter.FilterEntry {
        public static final android.os.Parcelable.Creator<android.service.personalcontext.hint.HintFilter.PackageEntry> CREATOR = null;
        private final java.lang.String mPackageName = null;
        PackageEntry(int p0, java.lang.String p1) { super(0); }
        PackageEntry(android.os.Parcel p0) { super(0); }
        public int describeContents() { return 0; }
        public java.lang.String getPackageName() { return null; }
        public boolean matches(android.service.personalcontext.hint.ContextHint p0) { return false; }
        public void visit(android.service.personalcontext.hint.HintFilter.FilterEntryVisitor p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private static abstract class FilterEntryLegacy implements android.os.Parcelable {
        private final int mFilterType = 0;
        FilterEntryLegacy(int p0) {}
        FilterEntryLegacy(android.os.Parcel p0) {}
        public final int getFilterType() { return 0; }
        public abstract boolean matches(android.service.personalcontext.hint.PublishedContextHint p0);
        public abstract void visit(android.service.personalcontext.hint.HintFilter.FilterEntryVisitorLegacy p0);
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private static class ContextHintClassEntry extends android.service.personalcontext.hint.HintFilter.FilterEntry {
        public static final android.os.Parcelable.Creator<android.service.personalcontext.hint.HintFilter.ContextHintClassEntry> CREATOR = null;
        final java.lang.String mContextHintClassName = null;
        ContextHintClassEntry(int p0, java.lang.Class<? extends android.service.personalcontext.hint.ContextHint> p1) { super(0); }
        protected ContextHintClassEntry(android.os.Parcel p0) { super(0); }
        public int describeContents() { return 0; }
        public java.lang.Class getContextHintClass() throws java.lang.ClassNotFoundException { return null; }
        public boolean matches(android.service.personalcontext.hint.ContextHint p0) { return false; }
        public void visit(android.service.personalcontext.hint.HintFilter.FilterEntryVisitor p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private static abstract class FilterEntry implements android.os.Parcelable {
        private final int mFilterType = 0;
        FilterEntry(int p0) {}
        FilterEntry(android.os.Parcel p0) {}
        public final int getFilterType() { return 0; }
        public abstract boolean matches(android.service.personalcontext.hint.ContextHint p0);
        public abstract void visit(android.service.personalcontext.hint.HintFilter.FilterEntryVisitor p0);
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private static class BundleHintTypeNameEntry extends android.service.personalcontext.hint.HintFilter.FilterEntry {
        public static final android.os.Parcelable.Creator<android.service.personalcontext.hint.HintFilter.BundleHintTypeNameEntry> CREATOR = null;
        private final java.lang.String mBundleHintTypeName = null;
        protected BundleHintTypeNameEntry(int p0, java.lang.String p1) { super(0); }
        protected BundleHintTypeNameEntry(android.os.Parcel p0) { super(0); }
        public int describeContents() { return 0; }
        public java.lang.String getBundleHintTypeName() { return null; }
        public boolean matches(android.service.personalcontext.hint.ContextHint p0) { return false; }
        public void visit(android.service.personalcontext.hint.HintFilter.FilterEntryVisitor p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private static interface FilterEntryVisitorLegacy {
        default public void onVisit(android.service.personalcontext.hint.HintFilter.BundleHintTypeNameEntryLegacy p0) {}
        default public void onVisit(android.service.personalcontext.hint.HintFilter.ContextHintClassEntryLegacy p0) {}
        default public void onVisit(android.service.personalcontext.hint.HintFilter.PackageEntryLegacy p0) {}
    }
}
