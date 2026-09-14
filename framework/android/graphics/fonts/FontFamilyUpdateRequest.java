package android.graphics.fonts;

@android.annotation.SystemApi
public final class FontFamilyUpdateRequest {
    private final java.util.List<android.graphics.fonts.FontFamilyUpdateRequest.FontFamily> mFontFamilies = null;
    private final java.util.List<android.graphics.fonts.FontFileUpdateRequest> mFontFiles = null;
    private FontFamilyUpdateRequest(java.util.List<android.graphics.fonts.FontFileUpdateRequest> p0, java.util.List<android.graphics.fonts.FontFamilyUpdateRequest.FontFamily> p1) {}
    public java.util.List<android.graphics.fonts.FontFamilyUpdateRequest.FontFamily> getFontFamilies() { return null; }
    public java.util.List<android.graphics.fonts.FontFileUpdateRequest> getFontFileUpdateRequests() { return null; }

    public static final class Builder {
        private final java.util.List<android.graphics.fonts.FontFamilyUpdateRequest.FontFamily> mFontFamilies = null;
        private final java.util.List<android.graphics.fonts.FontFileUpdateRequest> mFontFileUpdateRequests = null;
        public Builder() {}
        public android.graphics.fonts.FontFamilyUpdateRequest.Builder addFontFamily(android.graphics.fonts.FontFamilyUpdateRequest.FontFamily p0) { return null; }
        public android.graphics.fonts.FontFamilyUpdateRequest.Builder addFontFileUpdateRequest(android.graphics.fonts.FontFileUpdateRequest p0) { return null; }
        public android.graphics.fonts.FontFamilyUpdateRequest build() { return null; }
    }

    public static final class FontFamily {
        public static final int TYPE_FALLBACK_DEFAULT = 1;
        public static final int TYPE_FALLBACK_SUPPLEMENTAL = 2;
        public static final int TYPE_NAMED = 0;
        private final int mFamilyType = 0;
        private final java.util.List<android.graphics.fonts.FontFamilyUpdateRequest.Font> mFonts = null;
        private final java.lang.String mName = null;
        private FontFamily(java.lang.String p0, java.util.List<android.graphics.fonts.FontFamilyUpdateRequest.Font> p1, int p2) {}
        public int getFamilyType() { return 0; }
        public java.util.List<android.graphics.fonts.FontFamilyUpdateRequest.Font> getFonts() { return null; }
        public java.lang.String getName() { return null; }
        public boolean isFallback() { return false; }
        public boolean isSupplemental() { return false; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface FamilyType {
        }

        public static final class Builder {
            private int mFamilyType;
            private final java.util.List<android.graphics.fonts.FontFamilyUpdateRequest.Font> mFonts = null;
            private final java.lang.String mName = null;
            public Builder(java.lang.String p0, java.util.List<android.graphics.fonts.FontFamilyUpdateRequest.Font> p1) {}
            public Builder(java.util.List<android.graphics.fonts.FontFamilyUpdateRequest.Font> p0, int p1) {}
            public android.graphics.fonts.FontFamilyUpdateRequest.FontFamily.Builder addFont(android.graphics.fonts.FontFamilyUpdateRequest.Font p0) { return null; }
            public android.graphics.fonts.FontFamilyUpdateRequest.FontFamily build() { return null; }
        }
    }

    public static final class Font {
        private final java.util.List<android.graphics.fonts.FontVariationAxis> mAxes = null;
        private final int mIndex = 0;
        private final java.lang.String mPostScriptName = null;
        private final android.graphics.fonts.FontStyle mStyle = null;
        private Font(java.lang.String p0, android.graphics.fonts.FontStyle p1, int p2, java.util.List<android.graphics.fonts.FontVariationAxis> p3) {}
        public java.util.List<android.graphics.fonts.FontVariationAxis> getAxes() { return null; }
        public int getIndex() { return 0; }
        public java.lang.String getPostScriptName() { return null; }
        public android.graphics.fonts.FontStyle getStyle() { return null; }

        public static final class Builder {
            private java.util.List<android.graphics.fonts.FontVariationAxis> mAxes;
            private int mIndex;
            private final java.lang.String mPostScriptName = null;
            private final android.graphics.fonts.FontStyle mStyle = null;
            public Builder(java.lang.String p0, android.graphics.fonts.FontStyle p1) {}
            public android.graphics.fonts.FontFamilyUpdateRequest.Font build() { return null; }
            public android.graphics.fonts.FontFamilyUpdateRequest.Font.Builder setAxes(java.util.List<android.graphics.fonts.FontVariationAxis> p0) { return null; }
            public android.graphics.fonts.FontFamilyUpdateRequest.Font.Builder setIndex(int p0) { return null; }
        }
    }
}
