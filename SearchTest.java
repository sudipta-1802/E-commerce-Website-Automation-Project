public class SearchTest extends BaseTest {

    @Test(priority = 2)
    public void searchProduct() {
        driver.findElement(By.id("searchBox")).sendKeys("Laptop");
        driver.findElement(By.id("searchBtn")).click();

        Assert.assertTrue(driver.getPageSource().contains("Laptop"));
    }
}