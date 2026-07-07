package android.hardware.display;

public final class DeviceProductInfo implements android.os.Parcelable {
    public static final int CONNECTION_TO_SINK_BUILT_IN = 1;
    public static final int CONNECTION_TO_SINK_DIRECT = 2;
    public static final int CONNECTION_TO_SINK_TRANSITIVE = 3;
    public static final int CONNECTION_TO_SINK_UNKNOWN = 0;
    public static final android.os.Parcelable.Creator<android.hardware.display.DeviceProductInfo> CREATOR = null;
    public static final int VIDEO_INPUT_TYPE_ANALOG = 0;
    public static final int VIDEO_INPUT_TYPE_DIGITAL = 1;
    public static final int VIDEO_INPUT_TYPE_UNKNOWN = -1;
    private final int mConnectionToSinkType = 0;
    private final android.hardware.display.DeviceProductInfo.EdidStructureMetadata mEdidStructureMetadata = null;
    private final android.hardware.display.DeviceProductInfo.ManufactureDate mManufactureDate = null;
    private final java.lang.String mManufacturerPnpId = null;
    private final java.lang.Integer mModelYear = null;
    private final java.lang.String mName = null;
    private final java.lang.String mProductId = null;
    private final int mVideoInputType = 0;
    private DeviceProductInfo(android.os.Parcel p0) {}
    public DeviceProductInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) {}
    private DeviceProductInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, android.hardware.display.DeviceProductInfo.ManufactureDate p4, int p5, android.hardware.display.DeviceProductInfo.EdidStructureMetadata p6, int p7) {}
    public DeviceProductInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.Integer p3, android.hardware.display.DeviceProductInfo.ManufactureDate p4, int p5, android.hardware.display.DeviceProductInfo.EdidStructureMetadata p6, int p7) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getConnectionToSinkType() { return 0; }
    public android.hardware.display.DeviceProductInfo.EdidStructureMetadata getEdidStructureMetadata() { return null; }
    public android.hardware.display.DeviceProductInfo.ManufactureDate getManufactureDate() { return null; }
    public int getManufactureWeek() { return 0; }
    public int getManufactureYear() { return 0; }
    public java.lang.String getManufacturerPnpId() { return null; }
    public int getModelYear() { return 0; }
    public java.lang.String getName() { return null; }
    public java.lang.String getProductId() { return null; }
    public int getVideoInputType() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mConnectionToSinkType;
        private android.hardware.display.DeviceProductInfo.EdidStructureMetadata mEdidStructureMetadata;
        private android.hardware.display.DeviceProductInfo.ManufactureDate mManufactureDate;
        private java.lang.String mManufacturerPnpId;
        private int mModelYear;
        private java.lang.String mName;
        private java.lang.String mProductId;
        private int mVideoInputType;
        public Builder(java.lang.String p0, java.lang.String p1) {}
        public android.hardware.display.DeviceProductInfo build() { return null; }
        public android.hardware.display.DeviceProductInfo.Builder setConnectionToSinkType(int p0) { return null; }
        public android.hardware.display.DeviceProductInfo.Builder setEdidStructureMetadata(int p0, int p1) { return null; }
        public android.hardware.display.DeviceProductInfo.Builder setManufactureDate(int p0, int p1) { return null; }
        public android.hardware.display.DeviceProductInfo.Builder setManufacturerPnpId(java.lang.String p0) { return null; }
        public android.hardware.display.DeviceProductInfo.Builder setModelYear(int p0) { return null; }
        public android.hardware.display.DeviceProductInfo.Builder setName(java.lang.String p0) { return null; }
        public android.hardware.display.DeviceProductInfo.Builder setProductId(java.lang.String p0) { return null; }
        public android.hardware.display.DeviceProductInfo.Builder setVideoInputType(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConnectionToSinkType {
    }

    public static final class EdidStructureMetadata implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.display.DeviceProductInfo.EdidStructureMetadata> CREATOR = null;
        private final int mRevision = 0;
        private final int mVersion = 0;
        public EdidStructureMetadata(int p0, int p1) {}
        private EdidStructureMetadata(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int getRevision() { return 0; }
        public int getVersion() { return 0; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class ManufactureDate implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.display.DeviceProductInfo.ManufactureDate> CREATOR = null;
        private final java.lang.Integer mWeek = null;
        private final java.lang.Integer mYear = null;
        protected ManufactureDate(android.os.Parcel p0) {}
        public ManufactureDate(java.lang.Integer p0, java.lang.Integer p1) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.Integer getWeek() { return null; }
        public java.lang.Integer getYear() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VideoInputType {
    }
}
