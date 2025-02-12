package interpreterdesignpattern;

import interpreterdesignpattern.context.Context;
import interpreterdesignpattern.expression.AbstractExpression;
import interpreterdesignpattern.operation.AddNonTerminalOperator;
import interpreterdesignpattern.operation.MultiplyNonTerminalOperator;
import interpreterdesignpattern.terminalexpression.BinaryNonTerminalExpression;
import interpreterdesignpattern.terminalexpression.NumberTerminalExpression;

/**
 * Author: Sandeep Singh
 * Date: 12/02/25
 */

public class IntercepterMainTest {
    public static void main(String[] args) {
        // Initialized a Context
        Context context = new Context();
        context.put("a", 2);
        context.put("b", 5);
        context.put("c", 3);
        context.put("d", 4);


        // Multiple 2*5=10
        AbstractExpression multipleExpression = new MultiplyNonTerminalOperator(
                new NumberTerminalExpression("a"), new NumberTerminalExpression("b"));
        System.out.println("Multiple : " + multipleExpression.interpret(context));

        // Addition (a*b)+(c*d) = 2*5+3*4 = 10+12=22
        // NumberTerminalExpression is either a or either b and after pass we have get the value by get()
        AbstractExpression additionalAndMultiple = new AddNonTerminalOperator(
                new MultiplyNonTerminalOperator(new NumberTerminalExpression("a"), new NumberTerminalExpression("b")),
                new MultiplyNonTerminalOperator(new NumberTerminalExpression("c"), new NumberTerminalExpression("d")));
        System.out.println("AdditionalAndMultiple : " + additionalAndMultiple.interpret(context));

        // Using Binary = b-a = 5-2 =3

        AbstractExpression binaryNonTerminalExpression = new BinaryNonTerminalExpression(new NumberTerminalExpression("b"), new NumberTerminalExpression("a"), '-');
        System.out.println("Subtraction : " + binaryNonTerminalExpression.interpret(context));

    }
}
