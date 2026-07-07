package android.os;

@android.annotation.SystemApi
public final class PackageTagsList implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.PackageTagsList> CREATOR = null;
    private final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mPackageTags = null;
    private PackageTagsList(android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> p0) {}
    public boolean contains(java.lang.String p0, java.lang.String p1) { return false; }
    public boolean containsAll(android.os.PackageTagsList p0) { return false; }
    public boolean containsPackage(java.lang.String p0) { return false; }
    public boolean containsPackageWithAllTags(java.lang.String p0) { return false; }
    public boolean containsTag(java.lang.String p0) { return false; }
    public int describeContents() { return 0; }
    public void dump(java.io.PrintWriter p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Set<java.lang.String> getPackages() { return null; }
    public int hashCode() { return 0; }
    public boolean isEmpty() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> mPackageTags = null;
        public Builder() {}
        public Builder(int p0) {}
        private static android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> copy(android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.lang.String>> p0) { return null; }
        public android.os.PackageTagsList.Builder add(java.lang.String p0) { return null; }
        public android.os.PackageTagsList.Builder add(java.lang.String p0, java.lang.String p1) { return null; }
        public android.os.PackageTagsList.Builder add(java.lang.String p0, java.util.Collection<java.lang.String> p1) { return null; }
        public android.os.PackageTagsList.Builder addAll(android.os.PackageTagsList p0) { return null; }
        public android.os.PackageTagsList.Builder addAll(java.util.Map<java.lang.String, ? extends java.util.Set<java.lang.String>> p0) { return null; }
        public android.os.PackageTagsList build() { return null; }
        public android.os.PackageTagsList.Builder clear() { return null; }
        public android.os.PackageTagsList.Builder remove(java.lang.String p0) { return null; }
        public android.os.PackageTagsList.Builder remove(java.lang.String p0, java.lang.String p1) { return null; }
        public android.os.PackageTagsList.Builder remove(java.lang.String p0, java.util.Collection<java.lang.String> p1) { return null; }
        public android.os.PackageTagsList.Builder removeAll(android.os.PackageTagsList p0) { return null; }
        public android.os.PackageTagsList.Builder removeAll(java.util.Map<java.lang.String, ? extends java.util.Set<java.lang.String>> p0) { return null; }
    }
}
