package org.example.main;

import org.example.testclass.TestClass;

/**
 * [Description] Main 클래스 입니다.
 * 두번째 줄 부터는 Class 에 나타납니다.
 * 줄을 바꿔도 JavaDoc 에서는 붙어서 보입니다.
 */
public class Main {
    /**
     * [Description] Main 의 생성자 입니다.
     * 두번째 줄 부터는 Constructor Details 에 나타납니다.
     * 줄을 바꿔도 JavaDoc 에서는 붙어서 보입니다.
     */
    public Main() {
    }

    /**
     * [Description] psvm() 메서드 입니다.
     * 두번째 줄 부터는 Method Details 에 나타납니다.
     * 줄을 바꿔도 JavaDoc 에서는 붙어서 보입니다.

     * @param args
     * args 파라미터에 대한 설명입니다.
     * Method Details 에 나타납니다.
     * 줄을 바꿔도 JavaDoc 에서는 붙어서 보입니다.
     */
    public static void main(String[] args) {
        System.out.println("Main : Hello world!");
        TestClass tc = new TestClass();
        int rt = tc.testClassPrintHelloWorld(1, 2);
    }
}