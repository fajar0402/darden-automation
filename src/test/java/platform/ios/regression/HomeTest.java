package platform.ios.regression;

import org.junit.Test;
import platform.ios.runner.BaseIOSTest;

/**
 * Created by C07HJAXNDJD0 on 6/14/16.
 */
public class HomeTest extends BaseIOSTest {

    @Test
    public void asd(){
        homePage.locationModalAllowBtn.click();
        homePage.languageModalSpanish.click();
        waitFor(3);
    }

}
