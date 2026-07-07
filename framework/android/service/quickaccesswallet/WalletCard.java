package android.service.quickaccesswallet;

public final class WalletCard implements android.os.Parcelable {
    public static final int CARD_TYPE_NON_PAYMENT = 2;
    public static final int CARD_TYPE_PAYMENT = 1;
    public static final int CARD_TYPE_UNKNOWN = 0;
    public static final android.os.Parcelable.Creator<android.service.quickaccesswallet.WalletCard> CREATOR = null;
    private final android.graphics.drawable.Icon mCardIcon = null;
    private final java.lang.String mCardId = null;
    private final android.graphics.drawable.Icon mCardImage = null;
    private final java.lang.CharSequence mCardLabel = null;
    private java.util.List<android.location.Location> mCardLocations;
    private final int mCardType = 0;
    private final java.lang.CharSequence mContentDescription = null;
    private final android.graphics.drawable.Icon mNonPaymentCardSecondaryImage = null;
    private final android.app.PendingIntent mPendingIntent = null;
    private WalletCard(android.service.quickaccesswallet.WalletCard.Builder p0) {}
    private static android.service.quickaccesswallet.WalletCard readFromParcel(android.os.Parcel p0) { return null; }
    private void writeIconIfNonNull(android.graphics.drawable.Icon p0, android.os.Parcel p1, int p2) {}
    public int describeContents() { return 0; }
    public android.graphics.drawable.Icon getCardIcon() { return null; }
    public java.lang.String getCardId() { return null; }
    public android.graphics.drawable.Icon getCardImage() { return null; }
    public java.lang.CharSequence getCardLabel() { return null; }
    public java.util.List<android.location.Location> getCardLocations() { return null; }
    public int getCardType() { return 0; }
    public java.lang.CharSequence getContentDescription() { return null; }
    public android.graphics.drawable.Icon getNonPaymentCardSecondaryImage() { return null; }
    public android.app.PendingIntent getPendingIntent() { return null; }
    public void removeCardLocations() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.graphics.drawable.Icon mCardIcon;
        private java.lang.String mCardId;
        private android.graphics.drawable.Icon mCardImage;
        private java.lang.CharSequence mCardLabel;
        private java.util.List<android.location.Location> mCardLocations;
        private int mCardType;
        private java.lang.CharSequence mContentDescription;
        private android.graphics.drawable.Icon mNonPaymentCardSecondaryImage;
        private android.app.PendingIntent mPendingIntent;
        public Builder(java.lang.String p0, int p1, android.graphics.drawable.Icon p2, java.lang.CharSequence p3, android.app.PendingIntent p4) {}
        public Builder(java.lang.String p0, android.graphics.drawable.Icon p1, java.lang.CharSequence p2, android.app.PendingIntent p3) {}
        public android.service.quickaccesswallet.WalletCard build() { return null; }
        public android.service.quickaccesswallet.WalletCard.Builder setCardIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.service.quickaccesswallet.WalletCard.Builder setCardLabel(java.lang.CharSequence p0) { return null; }
        public android.service.quickaccesswallet.WalletCard.Builder setCardLocations(java.util.List<android.location.Location> p0) { return null; }
        public android.service.quickaccesswallet.WalletCard.Builder setNonPaymentCardSecondaryImage(android.graphics.drawable.Icon p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CardType {
    }
}
