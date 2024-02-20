package com.ohgiraffers.section05.parameter;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 메소드의 파라미터에 대해 이해하고 사용할 수 있다. */
        /* 필기.
        *   매개변수(parameter)로 사용 가능한 자료형
        *   1. 기본자료형(int, String, char, boolean, double)
        *   2. 기본자료형 배열(int[], String[], char[])
        *   3. 클래스자료형
        *   4. 클래스자료형 배열
        *   5. 가변인자
        *  */

        ParameterTest pt = new ParameterTest();

        /* 목차. 1. 기본자료형을 매개변수로 전달 받는 메소드 호출 확인 */
        int num = 20;

        pt.testParameterPrimaryType(num);

        /* 목차. 2. 기본자료형 배열을 매개변수로 전달 받는 메소드 호출 확인 */
        int[] iarr = new int[] {1, 2, 3, 4, 5};

        System.out.println("인자로 전달하는 값 : " + iarr);
        pt.testParameterPrimaryTypeArray(iarr);

        System.out.print("변경 후 원본 배열의 값 출력 : ");

        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        /* 목차. 3. 클래스 자료형을 매개변수로 전달 받는 메소드 호출 확인 */

        RectAngle r1 = new RectAngle(12.5, 22.5);

        System.out.println("인자로 전달하는 값 : " + r1);
        pt.testParameterClassType(r1);

    }

}
