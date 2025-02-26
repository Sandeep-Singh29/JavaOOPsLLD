package interpreterdesignpattern.terminalexpression;

import interpreterdesignpattern.context.Context;
import interpreterdesignpattern.expression.AbstractExpression;

/**
 * Author: Sandeep Singh
 * Date: 12/02/25
 */

public class BinaryNonTerminalExpression implements AbstractExpression {

    AbstractExpression leftExpression;
    AbstractExpression rightExpression;
    char operator;

    public BinaryNonTerminalExpression(AbstractExpression leftExpression, AbstractExpression rightExpression, char operator) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }

    @Override
    public int interpret(Context context) {
        return switch (operator) {
            case '+' -> leftExpression.interpret(context) + rightExpression.interpret(context);
            case '*' -> leftExpression.interpret(context) * rightExpression.interpret(context);
            case '-' -> leftExpression.interpret(context) - rightExpression.interpret(context);
            case '/' -> leftExpression.interpret(context) / rightExpression.interpret(context);
            default -> 0;
        };
    }
}
