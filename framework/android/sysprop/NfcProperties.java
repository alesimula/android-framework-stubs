package android.sysprop;

public final class NfcProperties {
    private NfcProperties() {}
    public static java.util.Optional<java.lang.Boolean> debug_enabled() { return null; }
    public static void debug_enabled(java.lang.Boolean p0) {}
    private static java.lang.String escape(java.lang.String p0) { return null; }
    private static <T extends java.lang.Enum<T>> java.lang.String formatEnumList(java.util.List<T> p0, java.util.function.Function<T, java.lang.String> p1) { return null; }
    private static <T extends java.lang.Object> java.lang.String formatList(java.util.List<T> p0) { return null; }
    private static java.lang.String formatUIntList(java.util.List<java.lang.Integer> p0) { return null; }
    private static java.lang.String formatULongList(java.util.List<java.lang.Long> p0) { return null; }
    public static java.util.Optional<java.lang.String> fw_version() { return null; }
    public static void fw_version(java.lang.String p0) {}
    public static java.util.Optional<java.lang.Boolean> get_caps_supported() { return null; }
    public static java.util.List<java.lang.Integer> info_antpos_X() { return null; }
    public static java.util.List<java.lang.Integer> info_antpos_Y() { return null; }
    public static java.util.Optional<java.lang.Boolean> info_antpos_device_foldable() { return null; }
    public static java.util.Optional<java.lang.Integer> info_antpos_device_height() { return null; }
    public static java.util.Optional<java.lang.Integer> info_antpos_device_width() { return null; }
    public static java.util.Optional<java.lang.Boolean> initialized() { return null; }
    public static void initialized(java.lang.Boolean p0) {}
    public static java.util.Optional<java.lang.Boolean> observe_mode_supported() { return null; }
    public static java.util.Optional<java.lang.Boolean> skipNdefRead() { return null; }
    public static java.util.Optional<android.sysprop.NfcProperties.snoop_log_mode_values> snoop_log_mode() { return null; }
    public static void snoop_log_mode(android.sysprop.NfcProperties.snoop_log_mode_values p0) {}
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
    public static java.util.Optional<java.lang.Boolean> vendor_debug_enabled() { return null; }
    public static void vendor_debug_enabled(java.lang.Boolean p0) {}
    public static java.util.Optional<java.lang.Boolean> verbose_debug_enabled() { return null; }
    public static void verbose_debug_enabled(java.lang.Boolean p0) {}

    public static enum snoop_log_mode_values {
        FILTERED,
        FULL;
        private static final android.sysprop.NfcProperties.snoop_log_mode_values[] $VALUES = null;
        private final java.lang.String propValue = null;
        private snoop_log_mode_values() {}
        public java.lang.String getPropValue() { return null; }
    }
}
