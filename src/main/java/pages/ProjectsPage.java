package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilites.PropertyReader;

public class ProjectsPage extends BasePage {

    public static final String PROJECTS_URI = "index.php?/admin/projects/overview";
    public static final By ADD_PROJECT_BUTTON = By.xpath("//a[contains(text(), 'Add Project')]");
    public static final String PROJECTS_NAME = "//*[contains(@class, 'action')]/ancestor::*/td/a";

    public ProjectsPage(WebDriver driver) {
        super(driver);
    }

    public String getNameProject() {
        return driver.findElements(By.xpath(PROJECTS_NAME)).get(0).getText();
    }

    public ProjectsPage openProjectsPage() {
        driver.get(System.getenv().getOrDefault("url", PropertyReader.getProperty("url")) + PROJECTS_URI);
        return this;
    }
    @Step("Ожидание загрузки элемента 'LOGIN_BUTTON'")
    public ProjectsPage waitIsProjectsPageOpened() {
        waitForElementLocated(ADD_PROJECT_BUTTON, 20);
        return this;
    }
    @Step("Click project '{nameProject}'")
    public ProjectPage openProjectPage(String nameProject){
        driver.findElement(By.xpath(String.format(PROJECTS_NAME, nameProject))).click();
        return new ProjectPage(driver);
    }
}
