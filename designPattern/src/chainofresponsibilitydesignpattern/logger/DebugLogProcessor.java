package chainofresponsibilitydesignpattern.logger;

/**
 * Author: Sandeep Singh
 * Date: 31/01/25
 */

public class DebugLogProcessor extends LogProcessor {

    public DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int logLevel, String message) {
        if (logLevel == DEBUG) {
            System.out.println("DEBUG : " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
