package week3.week3day3Assignments;

public class LoginPage extends BasePage {

    @Override
    public void performCommonTasks()
    {
        System.out.println("LoginPage Perform Common Tasks");
    }

    public static void main(String[] args) {

        BasePage baseObj = new BasePage();
        baseObj.clickElement();
        baseObj.findElement();
        baseObj.enterText();
        baseObj.performCommonTasks();

        System.out.println("-------------------------------------");
        
        LoginPage loginObj = new LoginPage();
        loginObj.performCommonTasks();
        
    }
    
}
