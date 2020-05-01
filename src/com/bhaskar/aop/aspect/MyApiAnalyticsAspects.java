/**
 * 
 */
package com.bhaskar.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Bhaskar
 *
 * 
 */

@Aspect
@Component
@Order(3)
public class MyApiAnalyticsAspects {


	@Before("com.bhaskar.aop.aspect.AopExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n ===> executing advice on MyApiAnalyticsAspects");
		}
}
