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

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]")
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
     *  footer not selected location
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

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[4]")
    public MobileElement mile;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[5]")
    public MobileElement address;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[7]")
    public MobileElement time;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")
    public MobileElement menuCollapsed;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")
    public MobileElement menuExpanded;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[4]")
    public MobileElement getDirectionBtn;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAElement[1]")
    public MobileElement changeLocationBtn;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAElement[2]")
    public MobileElement moreDetailsBtn;

    /*
    * find location
     */

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")
    public MobileElement backBtn;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]")
    public MobileElement findLocationtxt;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIASearchBar[1]/UIASearchBar[1]")
    public MobileElement searchBar;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[3]/UIATableCell[1]")
    public MobileElement firstRowPlace;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[3]/UIATableCell[2]")
    public MobileElement secondRowPlace;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[3]/UIATableCell[3]")
    public MobileElement thirdRowPlace;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[3]/UIATableCell[4]")
    public MobileElement fourthRowPlace;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[3]/UIATableCell[5]")
    public MobileElement fifthRowPlace;

    /*
    * location detail
     */

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]")
    public MobileElement locationDetailtxt;

    /*
    * View Menu
     */

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]")
    public MobileElement menuTittleTxt;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[1]")
    public MobileElement dinnerBtn;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]")
    public MobileElement breadCrumbNavigation;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAElement[1]")
    public MobileElement dinnerBreadCrumbBtn;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[1]/UIATableCell[1]")
    public MobileElement appetizersBtn;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAElement[1]")
    public MobileElement appetzizersBreadCrumbBtn;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[1]/UIATableCell[1]/UIAElement[1]")
    public MobileElement viewDetailsBtnFirstRow;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[1]/UIATableCell[1]/UIAElement[2]")
    public MobileElement orderToGoBtnFirstRow;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableGroup[5]/UIAButton[1]")
    public MobileElement nutritionFactBtn;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[3]/UIAElement[2]")
    public MobileElement returnToMenuBtn;


}


