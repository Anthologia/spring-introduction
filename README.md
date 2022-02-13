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

