package org.slinkyframework.common.aop.test;

import org.junit.Before;
import org.junit.Test;
import org.slinkyframework.common.aop.test.example.ExampleAspect;
import org.slinkyframework.common.aop.test.example.ExampleClassWithoutInterface;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MethodProceedingJoinPointForClassWithoutInterfaceTest {

    private ExampleClassWithoutInterface exampleClass = new ExampleClassWithoutInterface();

    @Before
    public void setUp() {
        ExampleAspect.cleanState();
    }

    @Test
    public void testGetClassName() throws Throwable {
        exampleClass.doClassName();

        assertThat("ClassName", ExampleAspect.getClassName(), is("ExampleClassWithoutInterface"));
    }

    @Test
    public void testGetMethodName() throws Throwable {
        exampleClass.doMethodName();

        assertThat("MethodName", ExampleAspect.getMethodName(), is("doMethodName"));
    }

    @Test
    public void testGetArgsWithAnnotation() throws Throwable {
        exampleClass.doMethodWithAnnotatedParameters("Bob", "Smith");

        assertThat("Number of arguments", ExampleAspect.getArguments().size(), is(1));
    }

    @Test
    public void testGetReturnWithAnnotation() throws Throwable {
        exampleClass.doMethodWithAnnotatedReturn();

        assertThat("Number of arguments", ExampleAspect.getReturnValue().isPresent(), is(true));
    }
}
