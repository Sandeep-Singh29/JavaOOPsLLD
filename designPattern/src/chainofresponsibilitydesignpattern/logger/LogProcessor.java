package chainofresponsibilitydesignpattern.logger;

/**
 * Author: Sandeep Singh
 * Date: 31/01/25
 */

public class LogProcessor {

    public static int INFO = 1;
    public static int ERROR = 2;
    public static int DEBUG = 3;
    public static int TEST = 4;


    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor logProcessor) {
        this.nextLogProcessor = logProcessor;
    }

    public void log(int logLevel, String message) {
        if (nextLogProcessor != null) {
            nextLogProcessor.log(logLevel, message);
        }
    }

}
