package android.security.identity;

@java.lang.Deprecated
public class PersonalizationData {
    private java.util.LinkedHashMap<java.lang.String, android.security.identity.PersonalizationData.NamespaceData> mNamespaces;
    private java.util.ArrayList<android.security.identity.AccessControlProfile> mProfiles;
    private PersonalizationData() {}
    java.util.Collection<android.security.identity.AccessControlProfile> getAccessControlProfiles() { return null; }
    android.security.identity.PersonalizationData.NamespaceData getNamespaceData(java.lang.String p0) { return null; }
    java.util.Collection<java.lang.String> getNamespaces() { return null; }

    @java.lang.Deprecated
    public static final class Builder {
        private android.security.identity.PersonalizationData mData;
        @java.lang.Deprecated
        public Builder() {}
        @java.lang.Deprecated
        public android.security.identity.PersonalizationData.Builder addAccessControlProfile(android.security.identity.AccessControlProfile p0) { return null; }
        @java.lang.Deprecated
        public android.security.identity.PersonalizationData build() { return null; }
        @java.lang.Deprecated
        public android.security.identity.PersonalizationData.Builder putEntry(java.lang.String p0, java.lang.String p1, java.util.Collection<android.security.identity.AccessControlProfileId> p2, byte[] p3) { return null; }
    }

    private static class EntryData {
        java.util.Collection<android.security.identity.AccessControlProfileId> mAccessControlProfileIds;
        byte[] mValue;
        EntryData(byte[] p0, java.util.Collection<android.security.identity.AccessControlProfileId> p1) {}
    }

    static class NamespaceData {
        private java.util.LinkedHashMap<java.lang.String, android.security.identity.PersonalizationData.EntryData> mEntries;
        private java.lang.String mNamespace;
        private NamespaceData(java.lang.String p0) {}
        java.util.Collection<android.security.identity.AccessControlProfileId> getAccessControlProfileIds(java.lang.String p0) { return null; }
        java.util.Collection<java.lang.String> getEntryNames() { return null; }
        byte[] getEntryValue(java.lang.String p0) { return null; }
        java.lang.String getNamespaceName() { return null; }
    }
}
