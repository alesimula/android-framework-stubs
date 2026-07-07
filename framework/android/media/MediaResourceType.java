package android.media;

public @interface MediaResourceType {
    public static final int kBattery = 5;
    public static final int kCpuBoost = 4;
    public static final int kDrmSession = 6;
    public static final int kGraphicMemory = 3;
    public static final int kHwResourceTypeMax = 12287;
    public static final int kHwResourceTypeMin = 4096;
    public static final int kNonSecureCodec = 2;
    public static final int kSecureCodec = 1;
    public static final int kSwResourceTypeMax = 4095;
    public static final int kSwResourceTypeMin = 1280;
    public static final int kUnspecified = 0;
}
