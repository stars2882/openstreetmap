package pages;

import manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    private static final String URL = "https://www.openstreetmap.org/";

    public void openHomePage() {
        DriverManager.getDriver().get(URL);
    }

    @FindBy(xpath = "//div[@id='sidebar']//a[@href='/directions']")
    private WebElement btnRoute;

    @FindBy(xpath = "//div[@id='sidebar']//input[@id='route_from']")
    private WebElement fieldRouteFrom;

    @FindBy(xpath = "//div[@id='sidebar']//input[@id='route_to']")
    private WebElement fieldRouteTo;

    @FindBy(xpath = "//div[@id='sidebar']//select[@name='routing_engines']")
    private WebElement dropDownListTransport;

    @FindBy(xpath = "//div[@id='sidebar']//input[@class='routing_go btn btn-sm btn-primary']")
    private WebElement btnGo;

    @FindBy(xpath = "//div[@id='sidebar_content']/p[contains(text(),'km')]")
    private WebElement distance;

    public void clickButtonRote() {
        btnRoute.click();
    }

    public void enterFirstPoint(final String keyword) {
        fieldRouteFrom.sendKeys(keyword);
    }

    public void enterSecondPoint(final String keyword) {
        fieldRouteTo.sendKeys(keyword);
    }

    public void selectTransport(final String keyword) {
        waitVisibilityOfElement(100, dropDownListTransport);
        dropDownListTransport.click();
        DriverManager
                .getDriver()
                .findElement(By.xpath("//div[@id='sidebar']//option[contains(text(),'" + keyword + "')]")).click();
    }

    public void clickBtnGo() {
        waitVisibilityOfElement(200, btnGo);
        btnGo.click();
    }

    public boolean checkDistance(final String keyword) {
        waitVisibilityOfElement(200, distance);
        return distance.getText().contains(keyword);
    }
}
