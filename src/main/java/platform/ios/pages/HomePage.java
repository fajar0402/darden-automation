package platform.ios.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.junit.Assert;
import platform.ios.modules.AbstractModule;

/**
 * Created by C07HJAXNDJD0 on 6/14/16.
 */
public class HomePage extends AbstractModule{

    /*
     * Home
     */

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAElement[1]")
    public MobileElement logoApp;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[4]")
    public MobileElement hamburgerBtn;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[4]" )
    public MobileElement closeMenuBtn;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]")
    public MobileElement carouselImage;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[2]")
    public MobileElement discoverText;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[1]")
    public MobileElement orderToGo;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[2]")
    public MobileElement findRestaurant;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[3]")
    public MobileElement viewMenu;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[4]")
    public MobileElement giftCards;

    /*
    *expanded home menu
     */

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")
    public MobileElement homeBtn;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]")
    public MobileElement orderToGoBtn;

    @iOSFindBy(xpath = "UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]")
    public MobileElement findRestaurantBtn;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]")
    public MobileElement specialAndNews;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[5]")
    public MobileElement giftCard;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[6]")
    public MobileElement eClub;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[7]")
    public MobileElement setting;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[8]")
    public MobileElement tellUsWhatYouThink;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")
    public MobileElement signIn;


    /*
     *  footer no selected location
     */
    
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[4]")
    public MobileElement pleaseSelectOgLocation;

    @iOSFindBy(xpath = "UIAApplication[1]/UIAWindow[1]/UIAButton[2]")
    public MobileElement footerRightArrowButton;


    /*
     * footer selected location
     */

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")
    public MobileElement footerRightDownArrowButton;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[3]")
    public MobileElement PaloAlto;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[4]")
    public MobileElement mile;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[5]")
    public MobileElement address;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[7]")
    public MobileElement time;

}
