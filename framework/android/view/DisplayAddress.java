package android.view;

public abstract class DisplayAddress implements android.os.Parcelable {
    public static final int INVALID_DISPLAY_ID = -1;
    public static final int INVALID_PORT = -1;
    public DisplayAddress() {}
    public static android.view.DisplayAddress.Network fromMacAddress(java.lang.String p0) { return null; }
    public static android.view.DisplayAddress.StablePhysical fromPhysicalDisplayId(long p0, int p1) { return null; }
    public static boolean matchDisplays(android.view.DisplayAddress p0, android.view.DisplayAddress p1) { return false; }
    public int describeContents() { return 0; }
    public long getPhysicalDisplayId() { return 0L; }
    public int getPort() { return 0; }

    public static final class Network extends android.view.DisplayAddress {
        public static final android.os.Parcelable.Creator<android.view.DisplayAddress.Network> CREATOR = null;
        private final java.lang.String mMacAddress = null;
        private Network(java.lang.String p0) { super(); }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class StablePhysical extends android.view.DisplayAddress {
        public static final android.os.Parcelable.Creator<android.view.DisplayAddress.StablePhysical> CREATOR = null;
        private final long mPhysicalDisplayId = 0L;
        private final int mPort = 0;
        private StablePhysical(long p0, int p1) { super(); }
        public boolean equals(java.lang.Object p0) { return false; }
        public long getPhysicalDisplayId() { return 0L; }
        public int getPort() { return 0; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
