package chainofresponsibilitydesignpattern.logger;

/**
 * Author: Sandeep Singh
 * Date: 31/01/25
 */

public class ErrorLogProcessor extends LogProcessor {

    public ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int logLevel, String message) {
        if (logLevel == ERROR) {
            System.out.println("ERROR : " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
