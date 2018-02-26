package org.thoughtcrime.securesms.components.FakeMediaViewStuff;

import org.thoughtcrime.securesms.crypto.MasterSecret;

/**
 * Created by Yan Ming on 2018-02-25.
 */

public class FakeMasterSecret implements MasterSecret{

    String fakeEncryptionKey = "";
    String fakeMacKey = "";

    public FakeMasterSecret() {

    }
    public FakeMasterSecret(String encryptionKey, String macKey) {
        this.fakeEncryptionKey = encryptionKey;
        this.fakeMacKey        = macKey;
    }
    @Override
    public String getFakeEncryptionKey() { return this.fakeEncryptionKey ;}
    @Override
    public String getFakeMacKey() {return this.fakeMacKey; }

    @Override
    public int describeContents() { return 0; }


}

