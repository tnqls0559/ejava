package ch01;

//자바의 클래스는 다중상속을 허룔하지 않음.
//class Child extends Parent{}
public class Child extends Parent1/*,Parent2*/{

}
 
class Child2 extends Parent1{}
class Child3 extends Parent2{}

//
class GrandChild extends Child{}
