package chainofresponsibilitydesignpattern.logger;

/**
 * Author: Sandeep Singh
 * Date: 31/01/25
 */

public class MainLoggerTest {

    public static void main(String[] args) {

        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR, "ERROR Happens...!!!");
        logProcessor.log(LogProcessor.DEBUG, "Need to DEBUG This...!!!");
        logProcessor.log(LogProcessor.INFO, "Just For INFO...!!!");
        logProcessor.log(LogProcessor.TEST, "Test is Not Implement...!!!");


    }

}
