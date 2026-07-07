package android.service.autofill;

public final class Field {
    private android.service.autofill.Dataset.DatasetFieldFilter mFilter;
    private android.service.autofill.Presentations mPresentations;
    private android.view.autofill.AutofillValue mValue;
    Field(android.view.autofill.AutofillValue p0, android.service.autofill.Dataset.DatasetFieldFilter p1, android.service.autofill.Presentations p2) {}
    public android.service.autofill.Dataset.DatasetFieldFilter getDatasetFieldFilter() { return null; }
    public java.util.regex.Pattern getFilter() { return null; }
    public android.service.autofill.Presentations getPresentations() { return null; }
    public android.view.autofill.AutofillValue getValue() { return null; }

    public static final class Builder {
        private boolean mDestroyed;
        private android.service.autofill.Dataset.DatasetFieldFilter mFilter;
        private android.service.autofill.Presentations mPresentations;
        private android.view.autofill.AutofillValue mValue;
        public Builder() {}
        private void checkNotUsed() {}
        public android.service.autofill.Field build() { return null; }
        public android.service.autofill.Field.Builder setFilter(java.util.regex.Pattern p0) { return null; }
        public android.service.autofill.Field.Builder setPresentations(android.service.autofill.Presentations p0) { return null; }
        public android.service.autofill.Field.Builder setValue(android.view.autofill.AutofillValue p0) { return null; }
    }
}
