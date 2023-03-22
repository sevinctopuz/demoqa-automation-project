import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_Lastname_EMail extends BaseTest {

    @Test
    public void setName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setName("sevinc");
        Assertions.assertEquals("sevinc",practiceFormPage.getName(), "Name value, is not correct");
    }

    @Test
    public void setLastName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setLastName("topuz");
        Assertions.assertEquals("topuz", practiceFormPage.getLastname(), "Last name value is not correct");
    }

    @Test
    public void setEmail(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setEmail("sevinc123@gmail.com");
        Assertions.assertEquals("sevinc123@gmail.com", practiceFormPage.getEmail(), "Email value is not correct");

    }


}
