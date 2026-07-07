package android.service.autofill.augmented;

@android.annotation.SystemApi
public abstract class PresentationParams {
    PresentationParams() {}
    abstract void dump(java.lang.String p0, java.io.PrintWriter p1);
    public android.service.autofill.augmented.PresentationParams.Area getSuggestionArea() { return null; }

    @android.annotation.SystemApi
    public static abstract class Area {
        private final android.graphics.Rect mBounds = null;
        public final android.service.autofill.augmented.AugmentedAutofillService.AutofillProxy proxy = null;
        private Area(android.service.autofill.augmented.AugmentedAutofillService.AutofillProxy p0, android.graphics.Rect p1) {}
        public android.graphics.Rect getBounds() { return null; }
        public java.lang.String toString() { return null; }
    }

    public static final class SystemPopupPresentationParams extends android.service.autofill.augmented.PresentationParams {
        private final android.service.autofill.augmented.PresentationParams.Area mSuggestionArea = null;
        public SystemPopupPresentationParams(android.service.autofill.augmented.AugmentedAutofillService.AutofillProxy p0, android.graphics.Rect p1) { super(); }
        void dump(java.lang.String p0, java.io.PrintWriter p1) {}
        public android.service.autofill.augmented.PresentationParams.Area getSuggestionArea() { return null; }
    }
}
