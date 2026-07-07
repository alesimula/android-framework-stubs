package android.service.autofill;

public final class Presentations {
    private android.widget.RemoteViews mDialogPresentation;
    private android.service.autofill.InlinePresentation mInlinePresentation;
    private android.service.autofill.InlinePresentation mInlineTooltipPresentation;
    private android.widget.RemoteViews mMenuPresentation;
    Presentations(android.widget.RemoteViews p0, android.service.autofill.InlinePresentation p1, android.widget.RemoteViews p2, android.service.autofill.InlinePresentation p3) {}
    @java.lang.Deprecated
    private void __metadata() {}
    private static android.widget.RemoteViews defaultDialogPresentation() { return null; }
    private static android.service.autofill.InlinePresentation defaultInlinePresentation() { return null; }
    private static android.service.autofill.InlinePresentation defaultInlineTooltipPresentation() { return null; }
    private static android.widget.RemoteViews defaultMenuPresentation() { return null; }
    private void onConstructed() {}
    public android.widget.RemoteViews getDialogPresentation() { return null; }
    public android.service.autofill.InlinePresentation getInlinePresentation() { return null; }
    public android.service.autofill.InlinePresentation getInlineTooltipPresentation() { return null; }
    public android.widget.RemoteViews getMenuPresentation() { return null; }

    public static final class Builder {
        private long mBuilderFieldsSet;
        private android.widget.RemoteViews mDialogPresentation;
        private android.service.autofill.InlinePresentation mInlinePresentation;
        private android.service.autofill.InlinePresentation mInlineTooltipPresentation;
        private android.widget.RemoteViews mMenuPresentation;
        public Builder() {}
        private void checkNotUsed() {}
        public android.service.autofill.Presentations build() { return null; }
        public android.service.autofill.Presentations.Builder setDialogPresentation(android.widget.RemoteViews p0) { return null; }
        public android.service.autofill.Presentations.Builder setInlinePresentation(android.service.autofill.InlinePresentation p0) { return null; }
        public android.service.autofill.Presentations.Builder setInlineTooltipPresentation(android.service.autofill.InlinePresentation p0) { return null; }
        public android.service.autofill.Presentations.Builder setMenuPresentation(android.widget.RemoteViews p0) { return null; }
    }
}
