package org.thoughtcrime.securesms.crypto;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 * Created by CharlesPhilippe on 2018-02-25.
 */

public class DecryptCipherAdapter implements DecryptCipher {
    private Cipher cipher;

    public DecryptCipherAdapter(){
        try{
            this.cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        } catch (NoSuchPaddingException | NoSuchAlgorithmException nspe) {
            throw new AssertionError(nspe);
        }
    }
    @Override
    public void init(int opmode, Key key, AlgorithmParameterSpec params) throws InvalidKeyException, InvalidAlgorithmParameterException {

        this.cipher.init(opmode, key, params);
    }

    @Override
    public byte[] doFinal(byte[] input, int inputOffset, int inputLen) throws IllegalBlockSizeException, BadPaddingException {
        return this.cipher.doFinal(input, inputOffset, inputLen);
    }

    @Override
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }
}
