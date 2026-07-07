package android.app;

public final class Person implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.Person> CREATOR = null;
    private android.graphics.drawable.Icon mIcon;
    private boolean mIsBot;
    private boolean mIsImportant;
    private java.lang.String mKey;
    private java.lang.CharSequence mName;
    private java.lang.String mUri;
    private Person(android.app.Person.Builder p0) {}
    private Person(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public android.net.Uri getIconUri() { return null; }
    public java.lang.String getKey() { return null; }
    public java.lang.CharSequence getName() { return null; }
    public java.lang.String getUri() { return null; }
    public int hashCode() { return 0; }
    public boolean isBot() { return false; }
    public boolean isImportant() { return false; }
    public java.lang.String resolveToLegacyUri() { return null; }
    public android.app.Person.Builder toBuilder() { return null; }
    public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private android.graphics.drawable.Icon mIcon;
        private boolean mIsBot;
        private boolean mIsImportant;
        private java.lang.String mKey;
        private java.lang.CharSequence mName;
        private java.lang.String mUri;
        public Builder() {}
        private Builder(android.app.Person p0) {}
        public android.app.Person build() { return null; }
        public android.app.Person.Builder setBot(boolean p0) { return null; }
        public android.app.Person.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.app.Person.Builder setImportant(boolean p0) { return null; }
        public android.app.Person.Builder setKey(java.lang.String p0) { return null; }
        public android.app.Person.Builder setName(java.lang.CharSequence p0) { return null; }
        public android.app.Person.Builder setUri(java.lang.String p0) { return null; }
    }
}
