package evidencia;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void takeScreenshot(WebDriver driver, String arquivo ) throws IOException {
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(arquivo));
        }catch(Exception e){
            System.out.println("Houve algum problema  ao copiar o arquivo para pasta: " + e.getMessage());
        }
    }
}
