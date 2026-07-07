package android.graphics.fonts;

@android.annotation.SystemApi
public class FontManager {
    public static final int RESULT_ERROR_DOWNGRADING = -5;
    public static final int RESULT_ERROR_FAILED_TO_OPEN_FONT_FILE = -10001;
    public static final int RESULT_ERROR_FAILED_TO_OPEN_SIGNATURE_FILE = -10002;
    public static final int RESULT_ERROR_FAILED_TO_OPEN_XML_FILE = -10006;
    public static final int RESULT_ERROR_FAILED_TO_WRITE_FONT_FILE = -1;
    public static final int RESULT_ERROR_FAILED_UPDATE_CONFIG = -6;
    public static final int RESULT_ERROR_FONT_NOT_FOUND = -9;
    public static final int RESULT_ERROR_FONT_UPDATER_DISABLED = -7;
    public static final int RESULT_ERROR_INVALID_ARGUMENT = -11;
    public static final int RESULT_ERROR_INVALID_DEBUG_CERTIFICATE = -10008;
    public static final int RESULT_ERROR_INVALID_FONT_FAMILY_NAME_TO_INSERT_BEFORE = -10;
    public static final int RESULT_ERROR_INVALID_FONT_FILE = -3;
    public static final int RESULT_ERROR_INVALID_FONT_NAME = -4;
    public static final int RESULT_ERROR_INVALID_PRIORITY = -12;
    public static final int RESULT_ERROR_INVALID_SHELL_ARGUMENT = -10003;
    public static final int RESULT_ERROR_INVALID_SIGNATURE_FILE = -10004;
    public static final int RESULT_ERROR_INVALID_XML = -10007;
    public static final int RESULT_ERROR_SIGNATURE_TOO_LARGE = -10005;
    public static final int RESULT_ERROR_VERIFICATION_FAILURE = -2;
    public static final int RESULT_ERROR_VERSION_MISMATCH = -8;
    public static final int RESULT_SUCCESS = 0;
    private static final java.lang.String TAG = "FontManager";
    private final com.android.internal.graphics.fonts.IFontManager mIFontManager = null;
    private FontManager(com.android.internal.graphics.fonts.IFontManager p0) {}
    private java.util.List<android.graphics.fonts.FontUpdateRequest> convertToFontUpdateRequestList(android.graphics.fonts.FontFamilyUpdateRequest p0) { return null; }
    private static java.util.List<android.graphics.fonts.FontUpdateRequest> convertToFontUpdateRequestList(java.util.List<android.graphics.fonts.FallbackFontUpdateRequest> p0) { return null; }
    public static android.graphics.fonts.FontManager create(com.android.internal.graphics.fonts.IFontManager p0) { return null; }
    public android.text.FontConfig getFontConfig() { return null; }
    public int updateFontFallbacks(java.util.List<android.graphics.fonts.FallbackFontUpdateRequest> p0) { return 0; }
    public int updateFontFamily(android.graphics.fonts.FontFamilyUpdateRequest p0, int p1) { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultCode {
    }
}
