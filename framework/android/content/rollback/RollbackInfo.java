package android.content.rollback;

@android.annotation.SystemApi
public final class RollbackInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.rollback.RollbackInfo> CREATOR = null;
    private final java.util.List<android.content.pm.VersionedPackage> mCausePackages = null;
    private int mCommittedSessionId;
    private final boolean mIsStaged = false;
    private final java.util.List<android.content.rollback.PackageRollbackInfo> mPackages = null;
    private final int mRollbackId = 0;
    private int mRollbackImpactLevel;
    public RollbackInfo(int p0, java.util.List<android.content.rollback.PackageRollbackInfo> p1, boolean p2, java.util.List<android.content.pm.VersionedPackage> p3, int p4) {}
    public RollbackInfo(int p0, java.util.List<android.content.rollback.PackageRollbackInfo> p1, boolean p2, java.util.List<android.content.pm.VersionedPackage> p3, int p4, int p5) {}
    private RollbackInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.util.List<android.content.pm.VersionedPackage> getCausePackages() { return null; }
    public int getCommittedSessionId() { return 0; }
    public java.util.List<android.content.rollback.PackageRollbackInfo> getPackages() { return null; }
    public int getRollbackId() { return 0; }
    public int getRollbackImpactLevel() { return 0; }
    public boolean isStaged() { return false; }
    public void setCommittedSessionId(int p0) {}
    public void setRollbackImpactLevel(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
