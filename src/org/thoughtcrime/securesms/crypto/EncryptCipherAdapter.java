package org.thoughtcrime.securesms.crypto;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 * Created by CharlesPhilippe on 2018-02-25.
 */

public class EncryptCipherAdapter implements EncryptCipher {

    private Cipher cipher;

    public EncryptCipherAdapter(){
        try{
            this.cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

        } catch (NoSuchPaddingException | NoSuchAlgorithmException nspe) {
            throw new AssertionError(nspe);
        }
    }

    @Override
    public byte[] doFinal(byte[] body)  throws IllegalBlockSizeException, BadPaddingException {
        return this.cipher.doFinal(body);
    }

    @Override
    public byte[] getIV() {
        return this.cipher.getIV();
    }

    @Override
    public void init(int opmode, Key key)throws InvalidKeyException {

        this.cipher.init(opmode, key);

    }
}
