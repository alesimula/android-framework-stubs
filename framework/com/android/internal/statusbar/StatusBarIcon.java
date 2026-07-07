package com.android.internal.statusbar;

public class StatusBarIcon implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.statusbar.StatusBarIcon> CREATOR = null;
    public java.lang.CharSequence contentDescription;
    public android.graphics.drawable.Icon icon;
    public int iconLevel;
    public int number;
    public java.lang.String pkg;
    public android.graphics.drawable.Drawable preloadedIcon;
    public com.android.internal.statusbar.StatusBarIcon.Shape shape;
    public com.android.internal.statusbar.StatusBarIcon.Type type;
    public android.os.UserHandle user;
    public boolean visible;
    public StatusBarIcon(android.os.Parcel p0) {}
    public StatusBarIcon(android.os.UserHandle p0, java.lang.String p1, android.graphics.drawable.Icon p2, int p3, int p4, java.lang.CharSequence p5, com.android.internal.statusbar.StatusBarIcon.Type p6) {}
    public StatusBarIcon(android.os.UserHandle p0, java.lang.String p1, android.graphics.drawable.Icon p2, int p3, int p4, java.lang.CharSequence p5, com.android.internal.statusbar.StatusBarIcon.Type p6, com.android.internal.statusbar.StatusBarIcon.Shape p7) {}
    public StatusBarIcon(java.lang.String p0, android.os.UserHandle p1, int p2, int p3, int p4, java.lang.CharSequence p5, com.android.internal.statusbar.StatusBarIcon.Type p6) {}
    public com.android.internal.statusbar.StatusBarIcon clone() { return null; }
    public int describeContents() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static enum Shape {
        FIXED_SPACE,
        WRAP_CONTENT;
        private static final com.android.internal.statusbar.StatusBarIcon.Shape[] $VALUES = null;
        private Shape() {}
    }

    public static enum Type {
        NotifSmallIcon,
        PeopleAvatar,
        ResourceIcon,
        SystemIcon;
        private static final com.android.internal.statusbar.StatusBarIcon.Type[] $VALUES = null;
        private Type() {}
    }
}
