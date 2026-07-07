package com.android.internal.inputmethod;

public interface IImeSwitcherMenu extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.inputmethod.IImeSwitcherMenu";
    public void hide(int p0) throws android.os.RemoteException;
    public void notifyImeAndSubtypeChanged(java.lang.String p0, int p1, android.content.Intent p2, int p3) throws android.os.RemoteException;
    public void registerListener(com.android.internal.inputmethod.IImeSwitcherMenuListener p0) throws android.os.RemoteException;
    public void show(com.android.internal.inputmethod.ImeSwitcherMenuItemSafeList p0, java.lang.String p1, int p2, android.content.Intent p3, boolean p4, int p5, int p6, int p7) throws android.os.RemoteException;

    public static class Default implements com.android.internal.inputmethod.IImeSwitcherMenu {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void hide(int p0) throws android.os.RemoteException {}
        public void notifyImeAndSubtypeChanged(java.lang.String p0, int p1, android.content.Intent p2, int p3) throws android.os.RemoteException {}
        public void registerListener(com.android.internal.inputmethod.IImeSwitcherMenuListener p0) throws android.os.RemoteException {}
        public void show(com.android.internal.inputmethod.ImeSwitcherMenuItemSafeList p0, java.lang.String p1, int p2, android.content.Intent p3, boolean p4, int p5, int p6, int p7) throws android.os.RemoteException {}
    }

    public static class Item implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.android.internal.inputmethod.IImeSwitcherMenu.Item> CREATOR = null;
        public java.lang.String imeId;
        public java.lang.CharSequence imeName;
        public java.lang.String imePackageName;
        public java.lang.CharSequence layoutName;
        public int subtypeIconResId;
        public int subtypeIndex;
        public java.lang.CharSequence subtypeName;
        public java.lang.CharSequence subtypeShortLabel;
        public Item() {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public java.lang.String toString() { return null; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.inputmethod.IImeSwitcherMenu {
        static final int TRANSACTION_hide = 2;
        static final int TRANSACTION_notifyImeAndSubtypeChanged = 4;
        static final int TRANSACTION_registerListener = 3;
        static final int TRANSACTION_show = 1;
        public Stub() { super(); }
        public static com.android.internal.inputmethod.IImeSwitcherMenu asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements com.android.internal.inputmethod.IImeSwitcherMenu {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void hide(int p0) throws android.os.RemoteException {}
            public void notifyImeAndSubtypeChanged(java.lang.String p0, int p1, android.content.Intent p2, int p3) throws android.os.RemoteException {}
            public void registerListener(com.android.internal.inputmethod.IImeSwitcherMenuListener p0) throws android.os.RemoteException {}
            public void show(com.android.internal.inputmethod.ImeSwitcherMenuItemSafeList p0, java.lang.String p1, int p2, android.content.Intent p3, boolean p4, int p5, int p6, int p7) throws android.os.RemoteException {}
        }
    }
}
