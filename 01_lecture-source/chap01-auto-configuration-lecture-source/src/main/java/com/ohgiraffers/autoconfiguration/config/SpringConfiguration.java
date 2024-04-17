package com.ohgiraffers.autoconfiguration.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration   // 설정파일이다 라고 알려줌
@ComponentScan("com.ohgiraffers.autoconfiguration")  // application 은  springConfiguration 을 읽고 springConfiguration 는 autoconfiguration 하위에 있는 모든 파일을 다 읽는다
// 포로퍼티 경로 안적음(PropertyReSource)  -> Application 으로 이름은 시작해야 한다. (경로를 적지 않아도 읽어준다.)
public class SpringConfiguration {

    @Value("${test.value}")
    private String value;

    @Value("${test.list}")
    private String[] list;

    @Value("${test.greeting}")
    private String greeting;

    @Value("${test.array}")
    private String[] array;

    @Value("${username}")
    private String username;

    @Bean
    public Object propertyReadTest(){

//        System.out.println("value = " + value);
////        System.out.println("list = " + list);       // 주소값 출력 -> 값 설정 안함
//
//        // 하나의 값으로 여러개 출력하기
//        Arrays.stream(list).forEach(System.out::println);

//        // 하나 출력
//        System.out.println("greeting = " + greeting);
//        // 여러개 출력
//        Arrays.stream(array).forEach(System.out::println);

        System.out.println("value = " + value);
        System.out.println("username = " + username);

        /* 필기. 시스템환경변수(컴퓨터이름) > properties > yml(=yaml) 더 우선 순위 이다!!!!*/
        /* 필기. 보안!!!
            1. 중요한 문서는 시스템환경변수에 저장
        *   2. 깃허브 시크릿 저장
            3. yml 파일 깃허브에 안올리기
        */



        return new Object();
    }

}
