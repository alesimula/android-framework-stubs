package android.app.lskfreset;

public class EscrowToken implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.lskfreset.EscrowToken> CREATOR = null;
    public byte[] applicationMetadata;
    public byte[] backendPublicKeyId;
    public byte[] counterId;
    public int hashAlgorithm;
    public byte[] hashSalt;
    public int knowledgeFactorType;
    public int maxAttempts;
    public int version;
    public byte[] wrappedRecoveryData;
    public EscrowToken() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
