package MyWebDriverClass;

import Com.Cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

    public class WebTablesExample extends TestBase {
        /*
            prints the whole table
         */
        @Test
        public void printWholeTable(){
            login();
            WebElement table = driver.findElement(By.id("ctl00_MainContent_orderGrid"));
            System.out.println(table.getText());
        }

        public void login(){
            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
            driver.findElement(By.id("ctl00_MainContent_username")).
                    sendKeys("Tester");
            driver.findElement(By.id("ctl00_MainContent_password")).
                    sendKeys("test"+ Keys.ENTER);
        }

        /*
            printing headers of the table
         */
        @Test
        public void printAllHeaders(){
            login();
            List<WebElement> headers = driver.findElements(
                    By.xpath("//table[@id='ctl00_MainContent_orderGrid']//th"));

            for(WebElement header:headers){
                System.out.println(header.getText());
            }
        }

        /*
            prints the number of rows
            prints all rows ==> prints the whole again
            prints the certain based on index
         */
        @Test
        public void printRow(){
            login();
            List<WebElement> allRows = driver.findElements(
                    By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
            System.out.println("number of rows " + allRows.size());

            for(WebElement header:allRows){
                System.out.println(header.getText());
            }

            // print the nth
            System.out.println("Printing row " + 4);
            System.out.println(allRows.get(3).getText());
        }

        /*
        print the size: columns and rows in a table
         */
        @Test
        public void printTableSize(){
            login();

            List<WebElement> allRows = driver.findElements(
                    By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
            System.out.println("Number of Rows " + allRows.size());

            List<WebElement> allColomns = driver.findElements(
                    By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[1]/th"));
            System.out.println("Number of Colomns " + allColomns.size());

        }

        /*
        print a row without using a list
        certain row
        tr[1] --> 1 is the key, when you change you will get certain row
         */
        @Test
        public void printRow2(){
            login();
            WebElement row = driver.findElement(
                    By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[5]"));
            System.out.println(row.getText());
        }

        /*
        print all the cells of a row whole index is given in the xpath
         */
        @Test
        public void printAllCellsInOneRow(){
            login();
            List<WebElement> cells = driver.findElements(
                    By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[4]/td"));

            for(WebElement header:cells){
                System.out.println(header.getText());
            }
        }
        /*
        print by coordinates : based on row and column number
         */
        @Test
        public void printByCoordinates(){
            login();
            WebElement cell = driver.findElement(
                    By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[11]"));
            System.out.println(cell.getText());

            System.out.println(getCell(6,11).getText());
        }


        public WebElement getCell(int row, int col){
            String xpath = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+row+"]/td["+col+"]";
            return driver.findElement(By.xpath(xpath));
        }



        @Test
        public void printElementofAcolun(){
            login();
            List<WebElement> rowSize = driver.findElements(
                    By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
            List<WebElement> colSize = driver.findElements(
                    By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));

            for(int i=0; i < rowSize.size()-1;i++) {
               for (int j =0; j< 1;j++){
                   System.out.println(colSize.get(i).getText());
               }
            }
        }

        @Test
        public void slectCheckbox(){
            login();

            WebElement checkBox = driver.findElement(By.xpath("//td[.='Susan McLaren']/../td[1]/input"));
            System.out.println(checkBox.isSelected());
            checkBox.click();
            System.out.println(checkBox.isSelected());

        }


        @Test
        public void test (){
           int nameindex = getColumnIndex("Name");
            List<WebElement> allNames = driver.findElements(
                    By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td["+nameindex+"]"));



        }


        
        public int getColumnIndex(String column){
            List<WebElement> allheader = driver.findElements(
                    By.xpath("//table[@id='ctl00_MainContent_orderGrid']//th"));

            for (int i = 0; i < allheader.size(); i++) {
               if(allheader.get(i).equals(column)){
                   return i+1;
               }
            }
            return 0;
        }
}
