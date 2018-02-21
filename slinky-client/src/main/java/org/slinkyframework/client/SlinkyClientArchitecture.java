package org.slinkyframework.client;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SlinkyClientArchitecture {

    @Pointcut("within(org.slinkyframework.client.SlinkyClient+)")
    public void inClient() {}

    @Pointcut("cflowbelow(execution(* org.slinkyframework.client.SlinkyClient+.*(..)))")
    public void inSubsequentCall() {}

    @Pointcut("execution(public * *(..))")
    public void publicOperations() {}

    @Pointcut("publicOperations() && inClient() && !inSubsequentCall()")
    public void clientOperations() {
    }
}
