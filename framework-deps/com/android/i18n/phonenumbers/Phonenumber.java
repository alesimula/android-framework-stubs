package com.android.i18n.phonenumbers;

public class Phonenumber {
    public Phonenumber() {}

    public static class PhoneNumber {
        public PhoneNumber() {}
        public long getNationalNumber() { return 0L; }
        public int getCountryCode() { return 0; }
        public boolean hasCountryCode() { return false; }
        public com.android.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource getCountryCodeSource() { return null; }

        public static class CountryCodeSource {
            public CountryCodeSource() {}
            public com.android.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource FROM_NUMBER_WITH_PLUS_SIGN = null;
        }
    }
}
