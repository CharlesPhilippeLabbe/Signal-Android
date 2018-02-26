package org.thoughtcrime.securesms.crypto;

import org.junit.Before;
import org.junit.Test;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.thoughtcrime.securesms.BaseUnitTest;
import org.whispersystems.libsignal.InvalidMessageException;

import javax.crypto.Cipher;
import javax.crypto.Mac;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@PowerMockIgnore("javax.crypto.*")
public class MasterCipherTest extends BaseUnitTest {
  private MasterCipher masterCipher;

  @Before
  @Override
  public void setUp() throws Exception {
    super.setUp();
    masterCipher = new MasterCipher(masterSecret);
  }

  @Test(expected = InvalidMessageException.class)
  public void testEncryptBytesWithZeroBody() throws Exception {
    masterCipher.decryptBytes(new byte[]{});
  }


  @Test
  public void testEncryptDecryptBytes(){

    EncryptCipherFake encryptCipher = new EncryptCipherFake();
    DecryptCipherFake decryptCipher = new DecryptCipherFake();

    MasterCipher cipher = new MasterCipher(masterSecret, encryptCipher, decryptCipher);

    String test = "hello";


    String encrypted = cipher.encryptBody(test);

    assertNotEquals(test, encrypted);

    try{
      String decrypted = cipher.decryptBody(encrypted);
      assertNotEquals(decrypted, encrypted);

      assertEquals(test, decrypted);

    }catch(Exception e){

    }




  }
}
