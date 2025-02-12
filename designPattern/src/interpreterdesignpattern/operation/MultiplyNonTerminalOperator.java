package interpreterdesignpattern.operation;


import interpreterdesignpattern.expression.AbstractExpression;
import interpreterdesignpattern.context.Context;

/**
 * Author: Sandeep Singh
 * Date: 12/02/25
 */

public class MultiplyNonTerminalOperator implements AbstractExpression {

    AbstractExpression leftExpression;
    AbstractExpression rightExpression;

    public MultiplyNonTerminalOperator(AbstractExpression leftExpression, AbstractExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) * rightExpression.interpret(context);
    }
}
