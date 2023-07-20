package me.kktrkkt.servlet_demo.dispatcher_servlet;

/*
DispatcherServlet
FrontController 패턴을 통해 각 요청을 적절한 컨트롤러에 분배해주는 역할을 한다
특징
- WebApplicationContext 구조를 상속받는 별개의 ApplicationContext를 가지고 있다(만약 다른 dispatcherServlet이 하나 더 등록될 경우 dispatcherServlet간에 데이터를 공유하기 위해서)

동작 과정
1. 요청 분석(로케일, 테마, 멀티파트 등)
2. 적절한 핸들러 매핑
3. 핸들러를 실행할 어댑터 매핑
4. 핸들러를 실행, 핸들러 결과값에 따라 어댑터는 결과를 ViewModel 객체에 담을지, Converter로 변환할지 결정
5. 응답 반환

핸들러, 어댑터, 뷰 리졸버 등의 객체 등록 과정
ApplicationContext에서 해당 타입의 등록된 빈을 가져옴, 만약 없으면 기본 전략 사용(DispatcherServlet.properties에 기술되어있음)

 */