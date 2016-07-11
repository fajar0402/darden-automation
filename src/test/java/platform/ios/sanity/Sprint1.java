package platform.ios.sanity;

import org.junit.Assert;
import org.junit.Test;
import platform.ios.runner.BaseIOSTest;

/**
 * Created by C07HJAXNDJD0 on 6/14/16.
 */
public class Sprint1 extends BaseIOSTest {

    @Test
    public void Sprint1_HomeScreen1(){
        homePage.locationModalAllowBtn.click();
        homePage.displayLog("1. Click Allow Button");
        homePage.languageModalEnglish.click();
        homePage.displayLog("2. Click Language Modal English");
        waitFor(2);
        Assert.assertTrue("Carousel Image is Displayed", homePage.carouselImage.isDisplayed());
        homePage.displayLog("3. Ability of the app to display landing screen with sub-features: carousel");
        waitFor(2);
    }

    @Test
    public void Sprint1_HomeScreen2(){
        homePage.locationModalAllowBtn.click();
        homePage.displayLog("1. Click Allow Button");
        homePage.languageModalEnglish.click();
        homePage.displayLog("2. Click Language Modal English");
        waitFor(2);
        Assert.assertTrue("Hamburger Button is Displayed", homePage.hamburgerBtn.isDisplayed());
        homePage.displayLog("3, Hamburger Button is display");
    }

    @Test
    public  void Sprint1_HomeScreen3() {
        homePage.locationModalAllowBtn.click();
        homePage.displayLog("1. Click Allow Button");
        homePage.languageModalEnglish.click();
        homePage.displayLog("2. Click Language Modal English");
        waitFor(2);
        homePage.logoApp.isDisplayed();
        homePage.displayLog("3. Screen Tittle is display");
    }

    @Test
    public  void sprint1_HomeScreen4(){
        homePage.locationModalAllowBtn.click();
        homePage.displayLog("1. Click Allow Button");
        homePage.languageModalEnglish.click();
        homePage.displayLog("2. Click Language Modal English");
        waitFor(2);
        homePage.hamburgerBtn.click();
        homePage.displayLog("3. Homepage is display able to tap");
    }

    @Test
    public void sprint1_HomeScreen5(){
        homePage.locationModalAllowBtn.click();
        homePage.displayLog("1. Click Allow Button");
        homePage.languageModalEnglish.click();
        homePage.displayLog("2. Click Language Modal English");
        waitFor(2);
        homePage.hamburgerBtn.click();
        homePage.displayLog("3. Homepage is display able to tap");
        homePage.closeMenuBtn.click();
        homePage.displayLog("4. Close menu Button");
    }

    @Test
    public void sprint1_HomeScreen6(){
        homePage.locationModalAllowBtn.click();
        homePage.displayLog("1. Click Allow Button");
        homePage.languageModalEnglish.click();
        homePage.displayLog("2. Click Language Modal English");
        waitFor(2);
        homePage.orderToGo.isDisplayed();
        homePage.displayLog("3. Order ToGo is display");
        homePage.orderToGo.click();
        homePage.displayLog("4. Order ToGo is able to tap");
    }

    @Test
    public void sprint1_HomeScreen7(){
        homePage.locationModalAllowBtn.click();
        homePage.displayLog("1. Click Allow Button");
        homePage.languageModalEnglish.click();
        homePage.displayLog("2. Click Language Modal English");
        waitFor(2);
        homePage.discoverText.isDisplayed();
        homePage.displayLog("3. Discover text is display");

    }

    @Test
    public void sprint1_HomeScreen8(){
        homePage.locationModalAllowBtn.click();
        homePage.displayLog("1. Click Allow Button");
        homePage.languageModalEnglish.click();
        homePage.displayLog("2. Click Language Modal English");
        waitFor(2);
        homePage.findRestaurant.isDisplayed();
        homePage.displayLog("3. Find Restaurant Button is display");
        homePage.findRestaurant.click();
        homePage.displayLog("4. Find Restaurant Button is able to tap");
    }

    @Test
    public void sprint1_HomeScreen9(){
        homePage.locationModalAllowBtn.click();
        homePage.displayLog("1. Click Allow Button");
        homePage.languageModalEnglish.click();
        homePage.displayLog("2. Click Language Modal English");
        waitFor(2);
        homePage.viewMenu.isDisplayed();
        homePage.displayLog("3. View menu Button is display");
        homePage.viewMenu.click();
        homePage.displayLog("4. View menu Button is able to tap");
    }

    @Test
    public void sprint1_HomeScreen10() {
        homePage.locationModalAllowBtn.click();
        homePage.displayLog("1. Click Allow Button");
        homePage.languageModalEnglish.click();
        homePage.displayLog("2. Click Language Modal English");
        waitFor(2);
        homePage.giftCards.isDisplayed();
        homePage.displayLog("3. GiftCard is display");
        homePage.giftCards.click();
        homePage.displayLog("4. GiftCard menu is able to tap ");
    }

    @Test
    public void sprint1_HomeScreen11(){
        homePage.locationModalAllowBtn.click();
        homePage.displayLog("1. Click Allow Button");
        homePage.languageModalEnglish.click();
        homePage.displayLog("2. Click Language Modal English");
        waitFor(2);
        homePage.hamburgerBtn.isDisplayed();
        homePage.displayLog("3. Hamburger button is display");
        homePage.hamburgerBtn.click();
        homePage.displayLog("4. Hamburger button is able to tap");
    }

    @Test
    public void sprint1_HomeScreen12(){
        homePage.locationModalAllowBtn.click();
        homePage.displayLog("1. Click Allow Button");
        homePage.languageModalEnglish.click();
        homePage.displayLog("2. Click Language Modal English");
        waitFor(2);
        homePage.hamburgerBtn.isDisplayed();
        homePage.displayLog("3. Hamburger button is display");
        homePage.hamburgerBtn.click();
        homePage.displayLog("4. Hamburger button is able to tap");
        homePage.homeBtn.isDisplayed();
        homePage.displayLog("5. Home button is display");
        homePage.homeBtn.click();
        homePage.displayLog("6. Home button is able to tap");
    }

    @Test
    public void sprint1_HomeScreen13(){
        homePage.locationModalAllowBtn.click();
        homePage.displayLog("1. Click Allow Button");
        homePage.languageModalEnglish.click();
        homePage.displayLog("2. Click Language Modal English");
        waitFor(2);
        homePage.hamburgerBtn.isDisplayed();
        homePage.displayLog("3. Hamburger button is display");
        homePage.hamburgerBtn.click();
        homePage.displayLog("4. Hamburger button is able to tap");
        homePage.orderToGoBtn.isDisplayed();
        homePage.displayLog("5. Order to go button is display");
        homePage.orderToGoBtn.click();
        homePage.displayLog("6. Order to go button is able to tap");
    }

    @Test
    public void sprint1_HomeScreen14(){
        homePage.locationModalAllowBtn.click();
        homePage.displayLog("1. Click Allow Button");
        homePage.languageModalEnglish.click();
        homePage.displayLog("2. Click Language Modal English");
        waitFor(2);
        homePage.hamburgerBtn.isDisplayed();
        homePage.displayLog("3. Hamburger button is display");
        homePage.hamburgerBtn.click();
        homePage.displayLog("4. Hamburger button is able to tap");
        homePage.findRestaurantBtn.isDisplayed();
        homePage.displayLog("5. Find Restaurant Menu is Display");
        homePage.findRestaurantBtn.click();
        homePage.displayLog("6. Find Restaurant Menu is able to tap");
    }

    
}
