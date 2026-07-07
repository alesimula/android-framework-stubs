package android.graphics.fonts;

@android.annotation.SystemApi
public final class FallbackFontUpdateRequest {
    private final java.util.List<android.graphics.fonts.FontFamilyUpdateRequest.Font> mFonts = null;
    private final java.lang.String mLanguages = null;
    private final int mPriority = 0;
    private FallbackFontUpdateRequest(java.util.List<android.graphics.fonts.FontFamilyUpdateRequest.Font> p0, java.lang.String p1, int p2) {}
    public java.util.List<android.graphics.fonts.FontFamilyUpdateRequest.Font> getFonts() { return null; }
    public java.lang.String getLanguages() { return null; }
    public int getPriority() { return 0; }

    public static final class Builder {
        private final java.util.List<android.graphics.fonts.FontFamilyUpdateRequest.Font> mFonts = null;
        private java.lang.String mLanguages;
        private int mPriority;
        public Builder() {}
        public android.graphics.fonts.FallbackFontUpdateRequest.Builder addFont(android.graphics.fonts.FontFamilyUpdateRequest.Font p0) { return null; }
        public android.graphics.fonts.FallbackFontUpdateRequest build() { return null; }
        public android.graphics.fonts.FallbackFontUpdateRequest.Builder setLanguages(java.lang.String p0) { return null; }
        public android.graphics.fonts.FallbackFontUpdateRequest.Builder setPriority(int p0) { return null; }
    }
}
