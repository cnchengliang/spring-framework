package com.smart.spel;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;


public class SpelFunSample {
    public static void main(String[] args)throws Exception{

        ExpressionParser parser = new SpelExpressionParser();
        StandardEvaluationContext context = new StandardEvaluationContext();
        context.registerFunction("sum", StringUtils.class.getDeclaredMethod("sum", new Class[] { Double.class }));
        String helloWorldReversed = parser.parseExpression(
                "#reverseString('hello')").getValue(context, String.class);

        System.out.println("helloWorldReversed = "+helloWorldReversed);
    }
}
