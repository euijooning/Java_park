package Prac08;

import Prac06.Course;

public class Day08 {
    /*
개념설명
getter/setter
클래스에는 개인정보와 같이 민감하고 중요한 정보가 많이 있기 때문에 함부로 접근하고 값을 변경
하지 않도록 최소한의 허들을 두어야 하는데요.
지난시간에 배웠던 접근제어자 를 통해 해당 클래스의 접근 범위를 설정할 수 있었습니다.
일반적으로 멤버변수는 private로 설정이 되고,
해당 클래스의 인스턴스 생성시 값을 변경하거나 가져올때에는
클래스의 해당메서드를 통해서만 그 기능을 할 수 있도록 하고 있습니다.

따라서 접근제어자가 private 인 경우, 어떻게 다른 클래스에서 인스턴스를 생성하고
객체의 값을 넣고 가져오는지
getter/ setter 문법을 복습해 보도록 하는 시간입니다.

// setter
// 메서드 (public)
public 반환타입 메서드명 (파라미터) {
    예) this.title=title;
}

// setter 는 클래스의 객체를 활용해 값을 저장하는 것이므로
// setter 작성시 따로 반환타입(돌려줄값)은 없습니다.
// 메서드명은 관습적으로 setTitle;과 같은 형식으로 작성하고 있습니다.

예)
public void setTitle(String title) {
    this.title= title;
}


// getter
public String getTitle(String title) {
		return this.title= title;
}
// 값을 반환해 주는 것이므로 반환타입이 있다.
// 값을 반환해 주므로 return이 꼭존재한다.

*/

    public static void main(String[] args) {

        String title = "Spirng";
        String tutor = "남병관";
        int days =35;

// 아래와 같이 값을 넣을때는 setter메서드를 통해 작성
        Course08 course = new Course08();
        course.setTitle(title);
        course.setTutor(tutor);
        course.setDays(days);

        // 인쇄해보기, 값을 가져올때도 아래와 같이 메서드를 가져와서 출력
        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        System.out.println(course.getDays());



    }
}

