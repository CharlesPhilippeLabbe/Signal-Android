package components;

import android.support.annotation.NonNull;

import org.junit.Test;
import org.thoughtcrime.securesms.components.MediaView;
import static org.mockito.Mockito.*;
import org.thoughtcrime.securesms.components.FakeMediaViewStuff.*;
/**
 * Created by Yan Ming on 2018-02-25.
 */

public class MediaViewTest {

    @Test
    public void testSet() {
        //create the mock MediaView
        MediaView mockMediaView = mock(MediaView.class);

        FakeMasterSecret mockMasterSecret = mock(FakeMasterSecret.class);
        FakeGlideRequests mockGlideRequest = mock(FakeGlideRequests.class);
        FakeVideoSlide mockVideoSlide = mock(FakeVideoSlide.class);
        FakeStub mockStub = mock(FakeStub.class);
        FakeVideoPlayer mockVideoPlayer = mock(FakeVideoPlayer.class);

        when(mockMediaView.set(
                @NonNull FakeMasterSecret mockMasterSecret,
                @NonNull FakeGlideRequests mockGlideRequest,
                @NonNull FakeVideoSlide mockVideoSlide,
                @NonNull FakeStub mockStub,
                @NonNull FakeVideoPlayer mockVideoPlayer,
        long size,
        boolean autoplay).thenReturn("something");
        )
    }
}
