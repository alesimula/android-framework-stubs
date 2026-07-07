package android.sysprop;

public final class MediaProperties {
    private MediaProperties() {}
    public static java.util.Optional<java.lang.Integer> codec2_dmabuf_padding() { return null; }
    public static java.util.Optional<android.sysprop.MediaProperties.codec2_hal_selection_values> codec2_hal_selection() { return null; }
    public static java.util.Optional<java.lang.Boolean> codec2_remove_rendering_depth() { return null; }
    private static java.lang.String escape(java.lang.String p0) { return null; }
    private static <T extends java.lang.Enum<T>> java.lang.String formatEnumList(java.util.List<T> p0, java.util.function.Function<T, java.lang.String> p1) { return null; }
    private static <T extends java.lang.Object> java.lang.String formatList(java.util.List<T> p0) { return null; }
    private static java.lang.String formatUIntList(java.util.List<java.lang.Integer> p0) { return null; }
    private static java.lang.String formatULongList(java.util.List<java.lang.Long> p0) { return null; }
    public static java.util.Optional<java.lang.Integer> resolution_limit_32bit() { return null; }
    public static java.util.Optional<java.lang.Integer> swcodec_ion_align() { return null; }
    public static java.util.Optional<java.lang.Integer> swcodec_ion_flags() { return null; }
    public static java.util.Optional<java.lang.Integer> swcodec_ion_heapmask() { return null; }
    private static java.lang.Boolean tryParseBoolean(java.lang.String p0) { return null; }
    private static java.lang.Double tryParseDouble(java.lang.String p0) { return null; }
    private static <T extends java.lang.Enum<T>> T tryParseEnum(java.util.function.Function<java.lang.String, T> p0, java.lang.String p1) { return null; }
    private static <T extends java.lang.Enum<T>> java.util.List<T> tryParseEnumList(java.util.function.Function<java.lang.String, T> p0, java.lang.String p1) { return null; }
    private static java.lang.Integer tryParseInteger(java.lang.String p0) { return null; }
    private static <T extends java.lang.Object> java.util.List<T> tryParseList(java.util.function.Function<java.lang.String, T> p0, java.lang.String p1) { return null; }
    private static java.lang.Long tryParseLong(java.lang.String p0) { return null; }
    private static java.lang.String tryParseString(java.lang.String p0) { return null; }
    private static java.lang.Integer tryParseUInt(java.lang.String p0) { return null; }
    private static java.lang.Long tryParseULong(java.lang.String p0) { return null; }

    public static enum codec2_hal_selection_values {
        AIDL,
        HIDL;
        private static final android.sysprop.MediaProperties.codec2_hal_selection_values[] $VALUES = null;
        private final java.lang.String propValue = null;
        private codec2_hal_selection_values() {}
        public java.lang.String getPropValue() { return null; }
    }
}
