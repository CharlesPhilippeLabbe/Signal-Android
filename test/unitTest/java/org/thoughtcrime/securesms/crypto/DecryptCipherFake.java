package org.thoughtcrime.securesms.crypto;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

/**
 * Created by CharlesPhilippe on 2018-02-25.
 */

public class DecryptCipherFake implements DecryptCipher {

    private Key key;
    private byte[] input;

    @Override
    public void init(int opmode, Key key, AlgorithmParameterSpec params) throws InvalidKeyException, InvalidAlgorithmParameterException {

        this.key = key;

    }

    @Override
    public byte[] doFinal(byte[] input, int inputOffset, int inputLen) throws IllegalBlockSizeException, BadPaddingException {
        this.input = input;
        String fake = "This is a Fake Body";
        if (fake.equals(new String(input))){
            String response = "hello";
            return response.getBytes();
        }
        else{
            return new byte[0];
        }
    }

    @Override
    public int getBlockSize() {
        return 0;
    }
}
