package appium.page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@NoArgsConstructor
public class LoginSeuBarrigaPage {


   @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Nome\"]")
   private WebElement nome;

   @FindBy(xpath = "//android.widget.EditText[@text=\"Senha\"]")
   private WebElement senha;

   @FindBy(xpath = "//android.widget.Button")
   private WebElement btnEntrar;





}
