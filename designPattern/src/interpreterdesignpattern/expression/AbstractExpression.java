package interpreterdesignpattern.expression;


import interpreterdesignpattern.context.Context;

/**
 * Author: Sandeep Singh
 * Date: 12/02/25
 */

public interface AbstractExpression {

    int interpret(Context context);
}

