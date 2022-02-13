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
  - 객체를 반환할 경우, MappingJackson2HttpMessageConveter가 호출되어 사용된다.  
    이때, 객체의 멤버변수 접근지정자가 private라면 getter가 있어야만 노출된다.

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