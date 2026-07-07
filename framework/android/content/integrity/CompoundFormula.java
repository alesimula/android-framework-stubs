package android.content.integrity;

public final class CompoundFormula extends android.content.integrity.IntegrityFormula implements android.os.Parcelable {
    public static final int AND = 0;
    public static final android.os.Parcelable.Creator<android.content.integrity.CompoundFormula> CREATOR = null;
    public static final int NOT = 2;
    public static final int OR = 1;
    private final int mConnector = 0;
    private final java.util.List<android.content.integrity.IntegrityFormula> mFormulas = null;
    public CompoundFormula(int p0, java.util.List<android.content.integrity.IntegrityFormula> p1) { super(); }
    CompoundFormula(android.os.Parcel p0) { super(); }
    private static java.lang.String connectorToString(int p0) { return null; }
    private static boolean isValidConnector(int p0) { return false; }
    private static void validateFormulas(int p0, java.util.List<android.content.integrity.IntegrityFormula> p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getConnector() { return 0; }
    public java.util.List<android.content.integrity.IntegrityFormula> getFormulas() { return null; }
    public int getTag() { return 0; }
    public int hashCode() { return 0; }
    public boolean isAppCertificateFormula() { return false; }
    public boolean isAppCertificateLineageFormula() { return false; }
    public boolean isInstallerFormula() { return false; }
    public boolean matches(android.content.integrity.AppInstallMetadata p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Connector {
    }
}
