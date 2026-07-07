package android.app.people;

@android.annotation.SystemApi
public final class EntityId implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.people.EntityId> CREATOR = null;
    public static final int TYPE_CONTACT_ID = 1;
    public static final int TYPE_EMAIL_ADDRESS = 3;
    public static final int TYPE_NAME = 2;
    public static final int TYPE_PHONE_NUMBER = 4;
    public static final int TYPE_SHARE_TARGET_ID = 6;
    public static final int TYPE_SHORTCUT_ID = 5;
    public static final int TYPE_USER_PACKAGE = 7;
    private final int mType = 0;
    private final java.lang.Object mValue = null;
    private EntityId(int p0, java.lang.Object p1) {}
    public static android.app.people.EntityId contactId(long p0) { return null; }
    public static android.app.people.EntityId emailAddress(java.lang.String p0) { return null; }
    public static android.app.people.EntityId name(java.lang.String p0) { return null; }
    public static android.app.people.EntityId phoneNumber(java.lang.String p0) { return null; }
    public static android.app.people.EntityId shareTargetId(android.content.pm.ShareTargetId p0) { return null; }
    public static android.app.people.EntityId shortcutId(android.content.pm.ShortcutId p0) { return null; }
    public static android.app.people.EntityId userPackage(android.content.pm.UserPackage p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long getContactId() { return 0L; }
    public java.lang.String getEmailAddress() { return null; }
    public java.lang.String getName() { return null; }
    public java.lang.String getPhoneNumber() { return null; }
    public android.content.pm.ShareTargetId getShareTargetId() { return null; }
    public android.content.pm.ShortcutId getShortcutId() { return null; }
    public int getType() { return 0; }
    public android.content.pm.UserPackage getUserPackage() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
