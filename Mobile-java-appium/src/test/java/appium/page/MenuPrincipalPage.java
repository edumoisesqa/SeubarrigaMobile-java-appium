package appium.page;

import appium.support.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MenuPrincipalPage {



    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Formulário\"]")
   // @iOSXCUITFindBy(accessibility = "test-Password")
    private MobileElement formulario;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"SeuBarriga Nativo\"]")
                           //android.widget.TextView[@text="SeuBarriga Nativo"]
    // @iOSXCUITFindBy(accessibility = "test-Password")
    private MobileElement seuBarrigaNativo;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"SeuBarriga Hibrido\"]")
    // @iOSXCUITFindBy(accessibility = "test-Password")
    private MobileElement seuBarrigaHibrido;

}
