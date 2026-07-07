package android.content.integrity;

public class InstallerAllowedByManifestFormula extends android.content.integrity.IntegrityFormula implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.integrity.InstallerAllowedByManifestFormula> CREATOR = null;
    public static final java.lang.String INSTALLER_CERTIFICATE_NOT_EVALUATED = "";
    public InstallerAllowedByManifestFormula() { super(); }
    private InstallerAllowedByManifestFormula(android.os.Parcel p0) { super(); }
    private static boolean installerInAllowedInstallersFromManifest(android.content.integrity.AppInstallMetadata p0, java.util.Map<java.lang.String, java.lang.String> p1) { return false; }
    public int describeContents() { return 0; }
    public int getTag() { return 0; }
    public boolean isAppCertificateFormula() { return false; }
    public boolean isAppCertificateLineageFormula() { return false; }
    public boolean isInstallerFormula() { return false; }
    public boolean matches(android.content.integrity.AppInstallMetadata p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
