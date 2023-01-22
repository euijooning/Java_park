package Prac10;

public class Day10_Explain {
    /*
    추상클래스, 추상메서드
	추상클래스는 미완성 설계도를 가진 클래스라고 생각하면 된다
	추상클래스란 추상 메서드를 선언할 수 있는 클래스. 불완전 형태
(설계만 되어있고, 구현체가 없는 것)
접근제어자, 리턴타입, 메소드명(파라메터)는 있지만 중괄호 블록 없음.
예) public int sum(int a, int b);
	추상: 여러 가지 사물이나 개념에서 공통되는 특성이나 속성 따위를 추출하여 파악하는 작용.
	예 ) 정녕 해가 있다면 그것은 당신들이 지금 알고 있는 것이 아니라 그 이름이 가진 어떤 추상일 뿐이오.  (출처: 네이버 지식사전)

	컴퓨터 과학에서의 추상화는 복잡한 자료, 모듈, 시스템 등으로부터 핵심적인 개념 또는 기능을 간추려 내는 것을 말한다.
	객체 지향 관점에서의 추상화는 클래스를 정의할 때, 불필요한 부분들을 생략하고 객체의 속성 중 중요한 것에만 중점을 두어 개략화 하는 것, 즉 클래스들의 중요하고 공통된 성질들을 추출하여 슈퍼 클래스를 선정하는 개념이다.
	추상클래스는 불완전한 형태를 가진 클래스의 형태로, 미완성된 부분을 가지고 있다.
	추상클래스 자체로는 인스턴스를 생성할 수 없다.(상속받는 자식 클래스 없이는 그 자체로 불가능)
- 추상화를 통해 잘 설계했다면 여러개의 클래스를 정의했을 때, 중복 코드가 현저히 줄어들 것 이다.
-> 코드가 간결해지기 때문에 생산성 증가, 가독성 증가, 에러 감소, 유지 보수시 시간 단축 등의 효과!
-> 잘 만들어진 슈퍼 클래스 덕분에 코드의 재사용성이 증가한다.

	인터페이스는 하나도 만들어 지지않은 “기본 설계도”로 볼 수 있다.
	추상클래스와 마찬가지로 객체의 인스턴스를 생성할 수 없다.
- 추상 클래스는 추상 메소드뿐만 아니라 생성자, 필드, 일반 메소드도 포함할 수 있지만 인터페이스는 오로지 추상 메소드와 상수만을 포함할 수 있다.
- 그럼 추상클래스만 쓰지 인터페이스를 왜 써? 왜? why? -> 자바는 클래스를 통한 다중 상속은 지원하지 않지만 클래스와 인터페이스를 통한 다중 상속은 지원하기 때문!
- 추상클래스나 인터페이스에 구현한 추상메소드들은 상속받는 클래스들에게 강제성을 부여! -> 꼭 오버라이딩 해서 사용해야만 함.

----------------------------------------------------------------------------------------------

	인터페이스 vs 추상클래스
    - 인터페이스
    1. 구현하려는 객체의 동작의 명세
    2. 다중 상속 가능
    3. implements를 이용하여 구현(키워드)
    4. 메소드 시그니처(이름, 파라미터, 리턴 타입)에 대한 선언만 가능

    - 추상클래스
    1. 클래스를 상속받아 이용 및 확장을 위함
    2. 다중 상속 불가능 , 단일 상속
    3. extends를 이용하여 구현(키워드)
    4. 추상메소드에 대한 구현 가능
    5. 추상클래스 자체로는 객체 생성이 불가능


인터페이스와 추상 클래스의 차이
추상클래스(Abstract Class)는 인터페이스의 역할도 하면서 클래스의 기능도 가지고 있는 자바의 돌연변이 같은 클래스이다. 혹자는 추상클래스는 인터페이스로 대체하는것이 좋은 디자인이라고도 얘기한다. 추상 클래스는 인터페이스와는 달리 일반 클래스처럼 객체변수, 생성자, private 메서드 등을 가질 수 있다.

private 메서드는 클래스 내에서만 사용되는 메서드로 다른 클래스에서 호출이 불가능하다.

     */
}
