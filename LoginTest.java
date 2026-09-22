public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void loginTest() {
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("loginBtn")).click();

        Assert.assertTrue(driver.getTitle().contains("Home"));
    }
}