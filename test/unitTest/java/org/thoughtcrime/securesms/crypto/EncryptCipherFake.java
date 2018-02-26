package org.thoughtcrime.securesms.crypto;

import java.security.InvalidKeyException;
import java.security.Key;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

/**
 * Created by CharlesPhilippe on 2018-02-25.
 */

public class EncryptCipherFake implements EncryptCipher {

    private Key key;
    private byte[] body;

    @Override
    public byte[] doFinal(byte[] body) throws IllegalBlockSizeException, BadPaddingException {
        this.body = body;
        String fake = "This is a Fake Body";

        return fake.getBytes();
    }

    @Override
    public byte[] getIV() {
        return new byte[0];
    }

    @Override
    public void init(int opmode, Key key) throws InvalidKeyException {

        this.key = key;
    }
}
