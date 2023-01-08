package ch08.ex01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE) 
public @interface Type { //어노테이션
	String name();
	int value();
}

@Retention(RetentionPolicy.CLASS) //기본 리텐션 CLASS.
@Target(ElementType.FIELD)
@interface Field{ //필드라는 어노테이션
	int value(); //value는 기본 속성명.
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
@interface Constructor { //생성자 어노테이션
	int value() default 0; //기본값 지정하지 않으면 0값.
}

//리센션은 클래스(기본값)
@Target(ElementType.METHOD)
@interface Method{//메소드 어노테이션
	
}

@Target(ElementType.PARAMETER)
@interface Param{
	
}

@Target(ElementType.LOCAL_VARIABLE)
@Annotation //어노테이션이라는 이름의 어노테이션을 로컬어노테이션에서 사용한다.
@interface Local{
	
}

@Target(ElementType.ANNOTATION_TYPE)
@interface Annotation {
	
}

@Target({ElementType.TYPE, ElementType.FIELD}) //target n개 지정가능
@interface Universal {
	
}
