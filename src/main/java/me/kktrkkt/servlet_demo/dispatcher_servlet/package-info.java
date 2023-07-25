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

구성요소

- MultipartResolver
파일 업로드 요청 처리에 필요한 인터페이스
HttpServletRequest -> MultipartHttpServletRequest 변환
기본 설정 객체 없음(단 스프링 부트는 존재)

- LocaleResolver
사용자 위치를 파악하는데 필요한 인터페이스
기본은 AcceptHeaderLocaleResolver 사용

- ThemeResolver
애플리케이션 테마를 파악하고 설정할 수 있는 인터페이스
기본은 FixedThemeResolver를 사용한다(테마 하나만 사용)

- HandlerMapping
요청을 처리할 핸들러를 찾는 인터페이스로 여러 빈들을 사용한다
기본은 BeanNameUrlHandlerMapping 사용

- HandlerAdapter
핸들러를 실행할 인터페이스
기본은 SimpleControllerHandlerAdapter 사용

- HandlerExceptionResolver
핸들러에서 발생한 예외를 처리하는 인터페이스
기본적으로 사용하지 않음

- RequestToViewNameTranslator
뷰이름이 없을경우에 들어온 요청을 기반으로 뷰 이름을 대체해주는 인터페이스
(e.g /simple -> "simple.jsp" 이름의 뷰를 찾아줌)
기본은 DefaultRequestToViewNameTranslator 사용

- viewResolver
뷰 이름에 해당하는 뷰를 찾아내는 인터페이스
기본은 InternalResourceViewResolver 사용

- FlashMapManager
FlashMap 인스턴스를 가져오고 저장하는 인터페이스
FlashMap은 주로 리다이렉션시 요청 매개변수 대신 데이터를 전달하는데 사용
기본은 org.springframework.web.servlet.support.DefaultFlashMapManager 사용


 */