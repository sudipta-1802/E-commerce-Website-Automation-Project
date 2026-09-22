public class CartTest extends BaseTest {

    @Test(priority = 3)
    public void addToCart() {
        driver.findElement(By.id("addToCart")).click();

        Assert.assertTrue(driver.getPageSource().contains("Added to cart"));
    }
}