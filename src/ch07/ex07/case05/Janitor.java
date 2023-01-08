package ch07.ex07.case05;

@FunctionalInterface
public interface Janitor<T> { //청소부를 람다로 만들기
	void clean(T t); //청소부보다 클린에(서술어) 관심이 있기 때문에 람다로 만든것!
}
