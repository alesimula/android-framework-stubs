package android.service.notification;

public class NotificationRankingUpdate implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.notification.NotificationRankingUpdate> CREATOR = null;
    private static final java.lang.String TAG = "NotificationRankingUpdate";
    private final android.service.notification.NotificationListenerService.RankingMap mRankingMap = null;
    private android.os.SharedMemory mRankingMapFd;
    private final java.lang.String mSharedMemoryName = null;
    public NotificationRankingUpdate(android.os.Parcel p0) {}
    public NotificationRankingUpdate(android.service.notification.NotificationListenerService.Ranking[] p0) {}
    private void addSmartActionsFromBundleToRankingMap(android.os.Bundle p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.service.notification.NotificationListenerService.RankingMap getRankingMap() { return null; }
    public final boolean isFdNotNullAndClosed() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
