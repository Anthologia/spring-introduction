# Spring Introduction
[[스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술](https://www.inflearn.com/course/스프링-입문-스프링부트/)]

---
## 1. 프로젝트 환경설정
- Spring project 생성
- 기본 라이브러리 살펴보기
- index 페이지 생성

## 2. 스프링 웹 개발 기초
### 1) 정적 컨텐츠
### 2) MVC와 템플릿 엔진
- @RequestParam을 사용한 Controller 구성
- Controller와 viewResolver, Template engine 간의 기본적인 상호작용 살펴보기
### 3) API
- @ResponseBody를 사용한 Controller 구성
- @ResponseBody를 사용한 Controller와 HttpMessageConveter 간의 기본적인 상호작용 살펴보기
  - 객체를 반환할 경우, MappingJackson2HttpMessageConveter가 호출되어 사용된다  
    이때, 객체의 멤버변수 접근지정자가 private라면 getter가 있어야만 노출된다

## 3. 회원 관리 예제 - 백엔드 개발
### 1) 비즈니스 요구사항 정리
### 2) 회원 도메인과 리포지토리 만들기
- 요구사항에 맞는 객체 domain 구현
- domain 객체를 관리하기 위한 Repository 구성
  - DBMS가 정해지지 않았다는 가정 하에 repository interface 구성  
  - 대안으로 memoryRepository를 구현 
### 2) 회원 리포지토리 테스트 케이스 작성
- @AfterEach를 사용한 테스트 케이스 작성
  - [Tip 1] : 순서에 의존적인 설계는 지양하자
  - [Tip 2] : 테스트 하나가 끝나면 항상 데이터를 클리어 시키자
### 3) 회원 서비스 개발
- domain 객체의 핵심 비즈니스 로직 구현
  - [Tip 3] : Service는 비지니스, Repository는 개발 롤에 맞게록 용어를 설계한다
### 4) 회원 서비스 테스트
- [Tip 4] : production code는 한글명을 지양하지만, test code는 직관성을 위해 한글명을 사용할 수 있다
- @BeforeEach를 사용한 테스트 케이스 작성
  - 테스트가 서로 영향이 없도록 새로운 객체와 의존관계를 맺음
  - 이를 위해, 기존 service 코드를 DI 가능하게 변경

## 4. 스프링 빈과 의존관계
### 1) 컴포넌트 스캔과 자동 의존관계 설정
- @Service, @Repository, @Controller를 통한 컴포넌트 스캔과 Spring Bean 등록
  - Spring Bean은 기본적으로 싱글톤으로 등록된다
- @Autowired를 통한 DI
### 2) 자바 코드로 직접 스프링 빈 등록하기
- @Configuration과 @Bean을 통한 Spring Bean 등록
- 세 가지의 DI 방법
  - Field Injection : Application 조립 전 변경할 방법이 없어 지양한다
  - Setter Injection : public으로 노출이 되면, Application 조립 후, 변경 위험성이 있어 지양한다
  - Constructor Injection : Application이 조립된 이후 변경을 막아주기 때문에 안전하다
- [Tip 5] : @Autowired를 통한 DI는 Spring container에 등록된 객체에서만 동작한다

## 5. 회원 관리 예제 - 웹 MVC 개발
### 1) 회원 웹 기능 - 홈 화면 추가
- Controller를 추가하여 홈 화면이 뜨도록 매핑
### 2) 회원 웹 기능 - 등록
- 데이터를 전달 받을 form 객체 구성
- @PostMapping을 사용한 Controller method 구현
### 3) 회원 웹 기능 - 조회
- thymeleaf를 사용한 HTML 페이지 구성

## 6. 스프링 DB 접근 기술
### 1) H2 데이터베이스 설치
 - H2 Database 설치 및 테이블 생성
