/*
상속이란?
이미 개발된 클래스를 재사용하셔 새로운 클래스를 만들기에 중복되는 코드를 줄인다.

    객체 지향 프로그램에서 부모 클래스의 멤버(클래스의 필드와 메소드) 자식 클래스에게 물려줄 수 있다

    부모 클래스의 한번의 수정으로 모든 자식 클래스까지 수정되는 효과가 있다.
    - 요지보수의 시간이 줄어든다.
*/

public class A{
    int field1;
    void method() {
        return;
    }
}

public class B extends A{ // 상속하는 법
    String field2;
    void method2(){
        return;
    }
}

/*
자식 클래스가 어떤 부모클래스를 상속받을 지 선택한다.
상속받으면 부모가 가지고 이쓴 필드나 메소드를 물려받게 되고, 
추가적으로 자식만이 갖고 있는 필드, 메소드를 선언할 수 있다.


주의:
여러 부모 클래스를 상속할 수는 없다.
부모클래스에서 private 멤버는 상속 대상에서 제외된다.
부모 자식이 다른 패키지일 경우 default 멤버들은 상속 대상에서 제외된다.
default는 같은 패키지에서만 사용할 수 있도록 하므로.


정리: 상속은
멤버가 private 가 아니고, 
같은 패키지여야만 default 가져올 수 있다.

자식 객체 생설할 때, 부모 객체가 먼저 생성되고 그 다음 자식 객체가 생성된다.

부모의 생성자는
선언 다음줄에 바로 super(); 넣어서, 자식 생성자의 맨 첫줄에서 부모 생성자가 호출된다.
(); 매개값이 있으면 명시적으로 넣어줘야한다.

*/