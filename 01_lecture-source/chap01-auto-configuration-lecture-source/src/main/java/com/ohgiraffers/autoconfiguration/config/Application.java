package com.ohgiraffers.autoconfiguration.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        /* 필기. 시스템환경변수(컴퓨터이름) > properties > yml(=yaml) 더 우선 순위 이다!!!!*/
        /* 필기. @ComponentScans 은 config 내에서 만 작동을 하고 있다!! 경로가 바뀌면 찾지 못한다!!!!!*/

        /* 필기. staric : 정적 web          // index.html , xml 등....
        *       templates : 동적 web 보관   // 작업 진행 후 동적인 페이지 넣어둠
        * */
        SpringApplication.run(Application.class, args);
    }

}
