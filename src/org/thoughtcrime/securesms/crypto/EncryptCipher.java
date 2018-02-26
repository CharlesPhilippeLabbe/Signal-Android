package org.thoughtcrime.securesms.crypto;

import java.security.InvalidKeyException;
import java.security.Key;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

/**
 * Created by CharlesPhilippe on 2018-02-25.
 */

public interface EncryptCipher {

 byte[] doFinal(byte[] body) throws IllegalBlockSizeException, BadPaddingException;
 byte[] getIV();
 void init(int opmode, Key key)throws InvalidKeyException
         ;


}
