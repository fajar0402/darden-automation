package platform.ios.modules;

import common.AbstractPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * Created by C07HJAXNDJD0 on 6/14/16.
 */
public class  AbstractModule extends AbstractPage{

    // Location modal
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[6]/UIAAlert[1]/UIAScrollView[1]/UIAStaticText[1]")
    public MobileElement locationModalTxtTitle;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[7]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAButton[1]")
    public MobileElement locationModalAllowBtn;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[6]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]")
    public MobileElement locationModalDontAllowBtn;

    // Language modal
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIAScrollView[1]/UIAStaticText[1]")
    public MobileElement languageModalTxtTittle;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAButton[1]")
    public MobileElement languageModalEnglish;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]")
    public MobileElement languageModalSpanish;


    public void displayLog(String value){
        System.out.println(value);
    }

}

