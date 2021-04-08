package org.padmini.springcore;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestSpel {

	public static void main(String[] args) {
		ExpressionParser parser=new SpelExpressionParser();
		Expression exp = parser.parseExpression("'Hello Spel'"); 
		String msg=(String)exp.getValue();
		System.out.println(msg);

	}

}
