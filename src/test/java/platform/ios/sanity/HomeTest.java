package platform.ios.sanity;

import org.junit.Assert;
import org.junit.Test;
import platform.ios.runner.BaseIOSTest;

/**
 * Created by C07HJAXNDJD0 on 6/14/16.
 */
public class HomeTest extends BaseIOSTest {

    @Test
    public void Sprint1_HomeScreen(){
        homePage.locationModalAllowBtn.click();
        homePage.displayLog("1. Click Allow Button");
        homePage.languageModalEnglish.click();
        homePage.displayLog("2. Click Allow Button");
        waitFor(2);
        Assert.assertTrue("Carousel Image is Displayed", homePage.carouselImage.isDisplayed());
        homePage.displayLog("3. Ability of the app to display landing screen with sub-features: carousel");
        waitFor(2);
    }
}
