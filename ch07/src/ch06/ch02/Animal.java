package ch06.ch02;

//추상 클래스
public abstract class Animal {
	//추상 메소드-상속받은 클래스에서 반드시 재정의 해야하는 메소드
	abstract void fly();
	//일반 메소드-자식 클래스에서 상속받은 그대로 사용하는 경우
	void stop() {
		System.out.println("쉬다");
	}
}
class Bird extends Animal{
	@Override
	void fly() {
		System.out.println("날다");
	}}
class Insect extends Animal{
	@Override
	void fly() {
		System.out.println("폴짝 뛰다");
	}}
class Fish extends Animal{
	@Override
	void fly() {
		System.out.println("헤엄치다");
	}}