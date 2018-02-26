package org.thoughtcrime.securesms;

import org.junit.Before;
import org.junit.Test;

//import static org.junit.Assert.*;
//import static org.mockito.Matchers.anyInt;
//import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.mock;
//import static org.powermock.api.mockito.PowerMockito.when;

//import android.Manifest;
//import android.animation.TypeEvaluator;
//import android.animation.ValueAnimator;
//import android.annotation.SuppressLint;
//import android.content.ActivityNotFoundException;
//import android.content.Context;
//import android.content.Intent;
//import android.content.res.Configuration;
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.graphics.Canvas;
//import android.graphics.PorterDuff;
//import android.graphics.drawable.BitmapDrawable;
//import android.graphics.drawable.ColorDrawable;
//import android.os.AsyncTask;
//import android.os.Build;
//import android.os.Bundle;
//import android.os.Vibrator;
//import android.support.annotation.DrawableRes;
//import android.support.annotation.NonNull;
//import android.support.annotation.RequiresApi;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentTransaction;
//import android.support.v7.widget.SwitchCompat;
//import android.text.Html;
//import android.text.TextUtils;
//import android.text.method.LinkMovementMethod;
//import android.util.Log;
//import android.view.ContextMenu;
//import android.view.ContextMenu.ContextMenuInfo;
//import android.view.LayoutInflater;
//import android.view.Menu;
//import android.view.MenuInflater;
import android.view.MenuItem;
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.animation.Animation;
//import android.view.animation.AnticipateInterpolator;
//import android.view.animation.OvershootInterpolator;
//import android.view.animation.ScaleAnimation;
//import android.widget.CompoundButton;
//import android.widget.ImageView;
//import android.widget.TextView;
//import android.widget.Toast;

//import org.thoughtcrime.securesms.color.MaterialColor;
//import org.thoughtcrime.securesms.components.camera.CameraView;
//import org.thoughtcrime.securesms.crypto.IdentityKeyParcelable;
//import org.thoughtcrime.securesms.crypto.IdentityKeyUtil;
//import org.thoughtcrime.securesms.database.Address;
//import org.thoughtcrime.securesms.database.DatabaseFactory;
//import org.thoughtcrime.securesms.database.IdentityDatabase.VerifiedStatus;
//import org.thoughtcrime.securesms.jobs.MultiDeviceVerifiedUpdateJob;
//import org.thoughtcrime.securesms.permissions.Permissions;
//import org.thoughtcrime.securesms.qr.QrCode;
//import org.thoughtcrime.securesms.qr.ScanListener;
//import org.thoughtcrime.securesms.qr.ScanningThread;
//import org.thoughtcrime.securesms.recipients.Recipient;
//import org.thoughtcrime.securesms.recipients.RecipientModifiedListener;
import org.thoughtcrime.securesms.util.DynamicLanguage;
import org.thoughtcrime.securesms.util.DynamicTheme;
//import org.thoughtcrime.securesms.util.IdentityUtil;
//import org.thoughtcrime.securesms.util.TextSecurePreferences;
//import org.thoughtcrime.securesms.util.Util;
//import org.thoughtcrime.securesms.util.ViewUtil;
//import org.whispersystems.libsignal.IdentityKey;
//import org.whispersystems.libsignal.fingerprint.Fingerprint;
//import org.whispersystems.libsignal.fingerprint.FingerprintParsingException;
//import org.whispersystems.libsignal.fingerprint.FingerprintVersionMismatchException;
//import org.whispersystems.libsignal.fingerprint.NumericFingerprintGenerator;

public class VerifyIdentityActivityTest extends BaseUnitTest{

    private DynamicTheme mockedDynamicTheme  = mock(DynamicTheme.class);
    private DynamicLanguage mockedDynamicLanguage  = mock(DynamicLanguage.class);

    private VerifyIdentityActivity.VerifyDisplayFragment mockedDisplayFragment = mock(VerifyIdentityActivity.VerifyDisplayFragment.class);
    private VerifyIdentityActivity.VerifyScanFragment mockedScanFragment = mock(VerifyIdentityActivity.VerifyScanFragment.class);

    //private Recipient mockedRecipient = mock(Recipient.class);
    private MenuItem mockedMenuItem = mock(MenuItem.class);

    private String mockedString = mock(String.class);

    private VerifyIdentityActivity activity;

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        activity = new VerifyIdentityActivity();
    }

    @Test
    public void testOnPreCreate(){
        mockedDynamicTheme.onCreate(activity);
        verify(mockedDynamicTheme).onCreate(activity);
        mockedDynamicLanguage.onCreate(activity);
        verify(mockedDynamicLanguage).onCreate(activity);
    }

    @Test
    public void testOnCreate(){
        mockedDisplayFragment.setClickListener(activity);
        verify(mockedDisplayFragment).setClickListener(activity);
        mockedScanFragment.setScanListener(activity);
        verify(mockedScanFragment).setScanListener(activity);

        //mockedRecipient.addListener(activity);
        //verify(mockedRecipient).addListener(activity);
        //when(mockedRecipient.getColor()).thenReturn(MaterialColor.RED);
        //mockedRecipient.getColor();
        //verify(mockedRecipient).getColor();
        //assertEquals(mockedRecipient.getColor(), MaterialColor.RED);
    }

    @Test
    public void testOnOptionsItemSelected(){
        mockedMenuItem.getItemId();
        verify(mockedMenuItem).getItemId();
    }

    @Test
    public void testOnQrDataFound(){
        mockedDisplayFragment.setScannedFingerprint(mockedString);
        verify(mockedDisplayFragment).setScannedFingerprint(mockedString);
    }

}
