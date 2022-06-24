package vn.testmaster;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App {
    /*
     * Khi viết code:phải rõ ràng, theo code convention
     * Testable - Code viết ra phải test được
     */

    /*
    Viết chương trình, đêm các số chẵn có trong mảng các số nguyên cho trước
     */

    public int DemSoChan(int[] arrNumber)
    {
        int total = 0;
        for (int i = 0; i < arrNumber.length; i++) {
            if(arrNumber[i]%2==0)
                total++;
        }
        return total;
    }
    @Test
    public void test_DemSoChan()
    {
        //Assumption - Giả thiết
        int[] arrNumber = {1,2,3,4,5,6,7,8,99,100};
        int expected = 6;

        //Action - Thực hiện
        int actual = this.DemSoChan(arrNumber);

        //Assertion - Kiểm tra, xác minh
        Assert.assertEquals(actual,expected);
    }

    /*@Test
    public void try_to_search_on_google()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/Phong Pham/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com.vn/");
        WebElement tbSearch = driver.findElement(By.name("q"));
        tbSearch.sendKeys(...keysToSend: "testmaster.vn");
        tbSearch.sendKeys(Keys.ENTER);
    }*/

    public int TongSoNguyen(int number)
    {
        int total = 0;
        for (int i = 0; i < number; i++){
            if(i<number)
                total = total+i;
        }
        return total;
    }

    @Test
    public void test_TongSoNguyen()
    {
        //Assumption - Giả Thiết
        int number = 10;
        int expected = 0+1+2+3+4+5+6+7+8+9;

        //Action - Thực hiện
        int actual = this.TongSoNguyen(number);

        //Assertion - Kiểm tra, xác minh
        Assert.assertEquals(actual,expected);

    }

    public boolean KiemTraSoNguyenTo(int n){

        if (n <2) return false; /*Số nhỏ hơn 2 không phải số nguyên tố => trả về 0*/

        /*Sử dụng vòng lặp while để kiểm tra có tồn tại ước số nào khác không*/
        int i = 2;
        while(i <n){
            if( n%i==0 ) {
                return false;
                /*Chỉ cần tìm thấy 1 ước số là đủ và thoát vòng lặp*/
            }
            i++;
        }

        return true;
    }

    @Test
    public void test_KiemTraSoNguyenTo()
    {
        //Assumption - Giả Thiết
        int n = 10;
        boolean expected = true;

        //Action - Thực hiện
        boolean actual = this.KiemTraSoNguyenTo(n);

        //Assertion - Kiểm tra, xác minh
        Assert.assertEquals(actual,expected);
    }

    public int SoLuongNguyenTo2ChuSo(){
        int total = 0;
        for (int i = 0; i < 100; i++){
            if(KiemTraSoNguyenTo(i))
                total++;
        }
        return total;
    }

    @Test
    public void test_SoLuongNguyenTo2ChuSo()
    {
        //Assumption - Giả Thiết
        int expected = 56;

        //Action - Thực hiện
        int actual = this.SoLuongNguyenTo2ChuSo();

        //Assertion - Kiểm tra, xác minh
        Assert.assertEquals(actual,expected);
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);

        }
    }

    @Test
    public void test_Fibonacci()
    {
        //Assumption - Giả Thiết
        int expected = 6;

        //Action - Thực hiện
        int actual = this.fibonacci(3);

        //Assertion - Kiểm tra, xác minh
        Assert.assertEquals(actual,expected);
    }
}

