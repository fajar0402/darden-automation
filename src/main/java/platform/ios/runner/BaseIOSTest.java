package platform.ios.runner;

import common.AbstractPage;
import common.BaseAcceptance;
import platform.Platform;
import platform.ios.pages.*;

/**
 * Created by C07HJAXNDJD0 on 6/14/16.
 */
public class BaseIOSTest extends BaseAcceptance {

    /*
     * Set the platform name
     */
    Platform iosPlatform = new Platform("ios");

    /*
     * Instantiate page object(s)
     */
    protected HomePage homePage = new HomePage();

    @Override
    public void setPlatform(Platform platform) {
        super.setPlatform(platform);
    }

    @Override
    public void setPages(AbstractPage abstractPage) {
        super.setPages(abstractPage);
    }

    // Invoke the super class setUp() method
    @Override
    public void setUp() throws Exception {
        this.setPages(homePage);
        this.setPlatform(iosPlatform);
        super.setUp();
    }

}
