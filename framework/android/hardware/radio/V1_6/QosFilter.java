package android.hardware.radio.V1_6;

public final class QosFilter {
    public byte direction;
    public android.hardware.radio.V1_6.QosFilter.Ipv6FlowLabel flowLabel;
    public java.util.ArrayList<java.lang.String> localAddresses;
    public android.hardware.radio.V1_6.MaybePort localPort;
    public int precedence;
    public byte protocol;
    public java.util.ArrayList<java.lang.String> remoteAddresses;
    public android.hardware.radio.V1_6.MaybePort remotePort;
    public android.hardware.radio.V1_6.QosFilter.IpsecSpi spi;
    public android.hardware.radio.V1_6.QosFilter.TypeOfService tos;
    public QosFilter() {}
    public static final java.util.ArrayList<android.hardware.radio.V1_6.QosFilter> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_6.QosFilter> p1) {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void readFromParcel(android.os.HwParcel p0) {}
    public final java.lang.String toString() { return null; }
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
    public final void writeToParcel(android.os.HwParcel p0) {}

    public static final class IpsecSpi {
        private byte hidl_d;
        private java.lang.Object hidl_o;
        public IpsecSpi() {}
        public static final java.util.ArrayList<android.hardware.radio.V1_6.QosFilter.IpsecSpi> readVectorFromParcel(android.os.HwParcel p0) { return null; }
        public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_6.QosFilter.IpsecSpi> p1) {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public byte getDiscriminator() { return 0; }
        public final int hashCode() { return 0; }
        public android.internal.hidl.safe_union.V1_0.Monostate noinit() { return null; }
        public void noinit(android.internal.hidl.safe_union.V1_0.Monostate p0) {}
        public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
        public final void readFromParcel(android.os.HwParcel p0) {}
        public final java.lang.String toString() { return null; }
        public int value() { return 0; }
        public void value(int p0) {}
        public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
        public final void writeToParcel(android.os.HwParcel p0) {}

        public static final class hidl_discriminator {
            public static final byte noinit = 0;
            public static final byte value = 1;
            private hidl_discriminator() {}
            public static final java.lang.String getName(byte p0) { return null; }
        }
    }

    public static final class Ipv6FlowLabel {
        private byte hidl_d;
        private java.lang.Object hidl_o;
        public Ipv6FlowLabel() {}
        public static final java.util.ArrayList<android.hardware.radio.V1_6.QosFilter.Ipv6FlowLabel> readVectorFromParcel(android.os.HwParcel p0) { return null; }
        public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_6.QosFilter.Ipv6FlowLabel> p1) {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public byte getDiscriminator() { return 0; }
        public final int hashCode() { return 0; }
        public android.internal.hidl.safe_union.V1_0.Monostate noinit() { return null; }
        public void noinit(android.internal.hidl.safe_union.V1_0.Monostate p0) {}
        public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
        public final void readFromParcel(android.os.HwParcel p0) {}
        public final java.lang.String toString() { return null; }
        public int value() { return 0; }
        public void value(int p0) {}
        public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
        public final void writeToParcel(android.os.HwParcel p0) {}

        public static final class hidl_discriminator {
            public static final byte noinit = 0;
            public static final byte value = 1;
            private hidl_discriminator() {}
            public static final java.lang.String getName(byte p0) { return null; }
        }
    }

    public static final class TypeOfService {
        private byte hidl_d;
        private java.lang.Object hidl_o;
        public TypeOfService() {}
        public static final java.util.ArrayList<android.hardware.radio.V1_6.QosFilter.TypeOfService> readVectorFromParcel(android.os.HwParcel p0) { return null; }
        public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_6.QosFilter.TypeOfService> p1) {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public byte getDiscriminator() { return 0; }
        public final int hashCode() { return 0; }
        public android.internal.hidl.safe_union.V1_0.Monostate noinit() { return null; }
        public void noinit(android.internal.hidl.safe_union.V1_0.Monostate p0) {}
        public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
        public final void readFromParcel(android.os.HwParcel p0) {}
        public final java.lang.String toString() { return null; }
        public byte value() { return 0; }
        public void value(byte p0) {}
        public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
        public final void writeToParcel(android.os.HwParcel p0) {}

        public static final class hidl_discriminator {
            public static final byte noinit = 0;
            public static final byte value = 1;
            private hidl_discriminator() {}
            public static final java.lang.String getName(byte p0) { return null; }
        }
    }
}
