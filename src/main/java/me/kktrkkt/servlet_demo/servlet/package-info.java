package me.kktrkkt.servlet_demo.servlet;

/*
서블릿
서버 +애플릿의 약자
요청 당 쓰레드 사용
자바에서 가장 중요한 서블릿 클래스는 HttpServlet

서블릿 이전 기술 Common Gateway Interface
요청 당 프로세스 사용

서블릿 장점
CGI보다 빠르고 보안, 이식성이 낫다

서블릿을 실행하기 위해서는 서블릿 엔진이 필요하다

서블릿 엔진, 서블릿 컨테이너(톰캣, 제티, 언더토)
- 세션관리
- 서블릿 생명주기 관리

서블릿 생명주기
- init() 메소드를 통해 초기화한다, 초기화 이후부터 사용가능
- 요청이 오면 별도의 쓰레드로 처리하고 service() 메소드를 호출한다.
  service() 메소드에서 HTTP 요청을 받고 http method에 따라 doGet, doPost 등에
  메소드로 처리를 위임해 응답을 생성한다
- 서블릿이 메모리에서 제거되는 시점에 destroy() 메소드 호출

 */