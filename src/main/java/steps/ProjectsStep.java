package steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;

@Log4j2
public class ProjectsStep extends BaseStep {
    public ProjectsStep(WebDriver driver) {
        super(driver);
    }

    @Step("Открытие нового проекта")
    public void openNewProject() {
        projectsPage
                .openProjectsPage()
                .waitIsProjectsPageOpened()
                .openProjectPage("New project 1");


    }
}
