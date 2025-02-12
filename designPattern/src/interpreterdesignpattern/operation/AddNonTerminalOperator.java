package interpreterdesignpattern.operation;

import interpreterdesignpattern.context.Context;
import interpreterdesignpattern.expression.AbstractExpression;

/**
 * Author: Sandeep Singh
 * Date: 12/02/25
 */

public class AddNonTerminalOperator implements AbstractExpression {

    AbstractExpression leftExpression;
    AbstractExpression rightExpression;

    public AddNonTerminalOperator(AbstractExpression leftExpression, AbstractExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) + rightExpression.interpret(context);
    }
}
