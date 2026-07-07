package android.service.personalcontext.hint;

@android.annotation.SystemApi
public final class UserInputText implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.personalcontext.hint.UserInputText> CREATOR = null;
    public static final int FIELD_TYPE_SEARCH_BOX = 1;
    public static final int FIELD_TYPE_UNKNOWN = 0;
    public static final int USER_INPUT_TEXT_SOURCE_CLICKED = 3;
    public static final int USER_INPUT_TEXT_SOURCE_INFERRED = 2;
    public static final int USER_INPUT_TEXT_SOURCE_TYPED = 1;
    public static final int USER_INPUT_TEXT_SOURCE_UNKNOWN = 0;
    private final int mFieldType = 0;
    private final java.lang.String mText = null;
    private final int mUserInputTextSource = 0;
    private final android.graphics.Rect mViewNodeBoundingBox = null;
    private UserInputText(android.os.Parcel p0) {}
    private UserInputText(java.lang.String p0, android.graphics.Rect p1, int p2, int p3) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getFieldType() { return 0; }
    public java.lang.String getText() { return null; }
    public int getUserInputTextSource() { return 0; }
    public android.graphics.Rect getViewNodeBoundingBox() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mFieldType;
        private java.lang.String mText;
        private int mUserInputTextSource;
        private android.graphics.Rect mViewNodeBoundingBox;
        public Builder() {}
        public android.service.personalcontext.hint.UserInputText build() { return null; }
        public android.service.personalcontext.hint.UserInputText.Builder setFieldType(int p0) { return null; }
        public android.service.personalcontext.hint.UserInputText.Builder setText(java.lang.String p0) { return null; }
        public android.service.personalcontext.hint.UserInputText.Builder setUserInputTextSource(int p0) { return null; }
        public android.service.personalcontext.hint.UserInputText.Builder setViewNodeBoundingBox(android.graphics.Rect p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FieldType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserInputTextSource {
    }
}
