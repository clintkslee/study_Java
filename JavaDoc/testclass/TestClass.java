/**
 * [Description] main 패키지 입니다.
 * 두번째 줄 부터는 ``에 나타납니다.
 * 줄을 바꿔도 JavaDoc 에서는 붙어서 보입니다.
 */
package org.example.testclass;

/**
 * [Description] TestClass 클래스 입니다.
 * 두번째 줄 부터는 Class 에 나타납니다.
 * 줄을 바꿔도 JavaDoc 에서는 붙어서 보입니다.
 */
public class TestClass {

    /**
     * [Description] TestClass 의 생성자 입니다.
     * 두번째 줄 부터는 Constructor Details 에 나타납니다.
     * 줄을 바꿔도 JavaDoc 에서는 붙어서 보입니다.
     */
    public TestClass() {
    }

    /**
     * [Description] testClassPrintHelloWorld() 메서드 입니다.
     * 두번째 줄 부터는 Method Details 에 나타납니다.
     * 줄을 바꿔도 JavaDoc 에서는 붙어서 보입니다.

     * @param num1
     * num1 파라미터에 대한 설명입니다.
     * Method Details 에 나타납니다.
     * 줄을 바꿔도 JavaDoc 에서는 붙어서 보입니다.

     * @param num2
     * num2 파라미터에 대한 설명입니다.
     * Method Details 에 나타납니다.
     * 줄을 바꿔도 JavaDoc 에서는 붙어서 보입니다.
     *
     * @return
     * 리턴값에 대한 설명입니다.
     * Method Details 에 나타납니다.
     * 줄을 바꿔도 JavaDoc 에서는 붙어서 보입니다.
     */
    public int testClassPrintHelloWorld(int num1, int num2) {
        System.out.println("TestClass : Hello World!");
        return num1+num2;
    }
}
