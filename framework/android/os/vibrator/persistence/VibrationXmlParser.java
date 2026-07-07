package android.os.vibrator.persistence;

@android.annotation.SystemApi
public final class VibrationXmlParser {
    public static final java.lang.String APPLICATION_VIBRATION_XML_MIME_TYPE = "application/vnd.android.haptics.vibration+xml";
    public static final int FLAG_ALLOW_HIDDEN_APIS = 1;
    private VibrationXmlParser() {}
    public static boolean isSupportedMimeType(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    public static android.os.vibrator.persistence.ParsedVibration parse(java.io.InputStream p0) throws java.io.IOException { return null; }
    public static android.os.vibrator.persistence.ParsedVibration parseDocument(java.io.Reader p0) throws java.io.IOException { return null; }
    public static android.os.vibrator.persistence.ParsedVibration parseDocument(java.io.Reader p0, int p1) throws java.io.IOException { return null; }
    private static <T extends java.lang.Object> T parseDocumentInternal(java.io.Reader p0, int p1, android.os.vibrator.persistence.VibrationXmlParser.ElementParser<T> p2) throws java.io.IOException { return null; }
    public static android.os.vibrator.persistence.ParsedVibration parseElement(com.android.modules.utils.TypedXmlPullParser p0, int p1) throws java.io.IOException { return null; }
    private static android.os.vibrator.persistence.ParsedVibration parseElementInternal(com.android.modules.utils.TypedXmlPullParser p0, int p1) throws java.io.IOException, com.android.internal.vibrator.persistence.XmlParserException { return null; }
    @android.annotation.SystemApi
    public static android.os.VibrationEffect parseVibrationEffect(java.io.InputStream p0) throws java.io.IOException { return null; }
    public static android.os.VibrationEffect parseVibrationEffect(java.io.Reader p0) throws java.io.IOException { return null; }
    public static android.os.VibrationEffect parseVibrationEffect(java.io.Reader p0, int p1) throws java.io.IOException { return null; }
    private static android.os.VibrationEffect parseVibrationEffectInternal(com.android.modules.utils.TypedXmlPullParser p0, int p1) throws java.io.IOException, com.android.internal.vibrator.persistence.XmlParserException { return null; }
    private static android.os.vibrator.persistence.ParsedVibration parseVibrationSelectInternal(com.android.modules.utils.TypedXmlPullParser p0, int p1) throws java.io.IOException, com.android.internal.vibrator.persistence.XmlParserException { return null; }

    private static interface ElementParser<T extends java.lang.Object> {
        public T parse(com.android.modules.utils.TypedXmlPullParser p0, int p1) throws java.io.IOException, com.android.internal.vibrator.persistence.XmlParserException;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }

    public static final class ParseFailedException extends java.io.IOException {
        private ParseFailedException(com.android.internal.vibrator.persistence.XmlParserException p0) { super(); }
        private ParseFailedException(java.lang.String p0) { super(); }
        private ParseFailedException(java.lang.String p0, java.lang.Throwable p1) { super(); }
    }
}
