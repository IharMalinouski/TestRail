package tests;

import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilites.Retry;

@Log4j2
public class
TestRailTests extends Authorization {

    @Test(description = "Создание новго проекта c Use multiple test suites to manage cases", retryAnalyzer = Retry.class)
    @Description("Создание нового проекта из Dashboard")
    public void createFirstNewProjectTest() {
        dashboardPage
                .openPageNewProject()
                .waitIsNewProjectPageOpened()
                .setNameProject("New project 1")
                .setAnnouncementOfProject("New project 1")
                .activateCheckBox()
                .chooseRadioButton("Use multiple test suites to manage cases")
                .clickAddProjectButton();
        Assert.assertEquals(ProjectsPage.getNameProject(), "New project 1");
    }

    @Test(description = "Создание новго проекта c Use a single repository with baseline support", retryAnalyzer = Retry.class)
    @Description("Открытие нового проекта")
    public void createSecondNewProjectTest(){
        projectsStep
                .openNewProject();

    }



//    @Test(description = "Создание новго проекта c Use a single repository with baseline support", retryAnalyzer = Retry.class)
//    @Description("Создание нового проекта из Dashboard")
//    public void createSecondNewProjectTest() {
//        dashboardPage
//                .openPageNewProject()
//                .waitIsNewProjectPageOpened()
//                .setNameProject("New project 2")
//                .setAnnouncementOfProject("New project 2")
//                .activateCheckBox()
//                .chooseRadioButton("Use a single repository with baseline support")
//                .clickAddProjectButton();
//        Assert.assertEquals(scopeProjectsPage.getNameProject(), "New project 2");
//        commonPage
//                .openDropDawnLogout()
//                .clickLogoutButton();
//    }

}