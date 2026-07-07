package com.android.internal.org.bouncycastle.crypto;

public interface AlphabetMapper {
    public char[] convertToChars(byte[] p0);
    public byte[] convertToIndexes(char[] p0);
    public int getRadix();
}
