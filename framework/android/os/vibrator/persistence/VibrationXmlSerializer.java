package android.os.vibrator.persistence;

public final class VibrationXmlSerializer {
    public static final int FLAG_ALLOW_HIDDEN_APIS = 1;
    public static final int FLAG_PRETTY_PRINT = 2;
    private static final java.lang.String XML_ENCODING = null;
    private static final java.lang.String XML_FEATURE_INDENT_OUTPUT = "http://xmlpull.org/v1/doc/features.html#indent-output";
    private VibrationXmlSerializer() {}
    public static void serialize(android.os.VibrationEffect p0, java.io.Writer p1) throws java.io.IOException {}
    public static void serialize(android.os.VibrationEffect p0, java.io.Writer p1, int p2) throws java.io.IOException {}
    private static com.android.internal.vibrator.persistence.XmlSerializedVibration<? extends android.os.VibrationEffect> toSerializedVibration(android.os.VibrationEffect p0, int p1) throws android.os.vibrator.persistence.VibrationXmlSerializer.SerializationFailedException { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }

    public static final class SerializationFailedException extends java.io.IOException {
        private SerializationFailedException(android.os.VibrationEffect p0, java.lang.Throwable p1) { super(); }
    }
}
