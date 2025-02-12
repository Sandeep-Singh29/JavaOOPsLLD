package interpreterdesignpattern.terminalexpression;


import interpreterdesignpattern.expression.AbstractExpression;
import interpreterdesignpattern.context.Context;

/**
 * Author: Sandeep Singh
 * Date: 12/02/25
 */

public class NumberTerminalExpression implements AbstractExpression {

    String stringValue;

    public NumberTerminalExpression(String stringValue) {
        this.stringValue = stringValue;
    }

    @Override
    public int interpret(Context context) {
        return context.get(stringValue);
    }
}
