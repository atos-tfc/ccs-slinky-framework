package org.slinkyframework.common.aop.test.example;

public class ExampleClassWithoutInterface {

    public void doClassName() {
    }

    public void doMethodName() {
    }

    public void doMethodWithAnnotatedParameters(@ExampleAnnotation String name, String nullableName) {
    }

    public @ExampleAnnotation String doMethodWithAnnotatedReturn() {
        return "ping";
    }
}
