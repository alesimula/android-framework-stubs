package android.content.pm;

public class PackageParserCacheHelper {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "PackageParserCacheHelper";
    private PackageParserCacheHelper() {}

    public static class ReadHelper extends android.os.Parcel.ReadWriteHelper {
        private final android.os.Parcel mParcel = null;
        private final java.util.ArrayList<java.lang.String> mStrings = null;
        public ReadHelper(android.os.Parcel p0) { super(); }
        public java.lang.String readString(android.os.Parcel p0) { return null; }
        public java.lang.String readString16(android.os.Parcel p0) { return null; }
        public java.lang.String readString8(android.os.Parcel p0) { return null; }
        public void startAndInstall() {}
    }

    public static class WriteHelper extends android.os.Parcel.ReadWriteHelper {
        private final java.util.HashMap<java.lang.String, java.lang.Integer> mIndexes = null;
        private final android.os.Parcel mParcel = null;
        private final int mStartPos = 0;
        private final java.util.ArrayList<java.lang.String> mStrings = null;
        public WriteHelper(android.os.Parcel p0) { super(); }
        public void finishAndUninstall() {}
        public void writeString(android.os.Parcel p0, java.lang.String p1) {}
        public void writeString16(android.os.Parcel p0, java.lang.String p1) {}
        public void writeString8(android.os.Parcel p0, java.lang.String p1) {}
    }
}
