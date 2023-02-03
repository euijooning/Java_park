package Prac12;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        // 여러명이 앉을 의자가 있다고 가정한 설명
        /*
        먼저 어레이리스트는, 여러명이 앉을 의자가 연달아 있으면, 중간에 누가 앉으려고 한다면 그 사람의 위치로부터
        그 사람 뒤에 있는 사람들이 모두 일어나서 한 칸씩 이동해야 하는 번거로움이 있다.

        링크드 리스트는 의자 없이 사람들이 나란히 손을 잡고 있는 상황이다.
        중간에 한 명이 2-3번 사이로 들어간다고 하면, 잡았던 손을 놓고, 그 사이에 들어가고 나서 기존에 2-3번에 있는 사람과 손을 잡으면서
        쉽게 여러 사람들 사이로 들어갈 수 있다. 그냥 손을 놨다가 새로 들어온 사람과 손을 잡는..

        쓰는 방법은 두 가지가 거의 비슷하다.
         */

        // 선착순으로 수업 진행
        LinkedList<String> list = new LinkedList<>();
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회
        System.out.println(list.get(0)); // 유재석 출력
        System.out.println(list.get(1)); // 조세호 출력
        System.out.println(list.getFirst()); // 편리하게 가장 첫번째 데이터 뽑을 수 있음 // 유재석 출력
        System.out.println(list.getLast()); // 마지막 데이터를 뽑을 수 있음 // 강호동 출력

        System.out.println("-----------");

        // 데이터 추가
        list.addFirst("서장훈"); // 처음으로 데이터가 들어가게 만든다.
        for(String s : list) {
            System.out.println(s);
        }

        System.out.println("--------");

        list.addLast("김희철");
        for(String s : list) {
            System.out.println(s);
        } // 7명이 됨

        System.out.println("-----");

        // 중간에 데이터를 추가하는 경우
        System.out.println("학생 추가 전: " + list.get(1)); // 유재석 출력
        list.add(1, "김영철"); // 유재석 씨 앞에 김영철 씨 추가됨
        System.out.println("학생 추가 후: " + list.get(1)); // 김영철 출력

        // 진짜 추가되었는지 확인해보기
        System.out.println("학생 추가 후: " + list.get(2)); // 유재석 출력 <== 이동한 위치

        //Day14
        System.out.println("----------------");
        // 삭제 : list.remove()
        System.out.println("남은 학생 수(제외 전) : " + list.size());
        list.remove(list.size()-1); // 마지막 데이터 삭제
        System.out.println("남은 학생 수(제외 후) : " + list.size());

        System.out.println("-------------");

        // 처음 학생과 마지막 학생이 전학갔다.
        System.out.println("남은 학생 수(전학 전) : " + list.size());
        list.removeFirst(); // 첫 데이터가 삭제
        list.removeLast(); // 마지막 데이터가 삭제
        System.out.println("남은 학생 수(전학 후) : " + list.size());

        for(String s : list) {
            System.out.println(s);
        }

        System.out.println("---------------");

        // 변경 : list.set(변경위치, 변경값)
        //ListSet 함수로
        list.set(0, "이수근"); //김영철->이수근
        System.out.println(list.get(0)); // 첫번째에 이수근 출력

        // 데이터 확인 list.contains()
        System.out.println(list.indexOf("김종국"));
        if(list.contains("김종국")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }
        System.out.println("----------------");

        // 전체삭제 : 내장함수 clear
        list.clear();

        //isEmpty() 진짜 비어있는지 확인
        if(list.isEmpty()) {
            System.out.println("학생 수: " + list.size());
            System.out.println("리스트가 비어있습니다.");
        }
        System.out.println("---------------------");

        // 정렬

        // 다시 다섯 명 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");
        // 강호동 중복추가
        list.add("강호동");
        list.add("강호동");
        list.add("강호동");

        // 출석부 일단 만들기
        Collections.sort(list); // 정렬할 것의 이름을 넣어주기만 하면, 데이터를 가나다순으로 정렬

        // 정렬이 잘 되었는지 for-each문으로 순회
        for(String s : list) {
            System.out.println(s);
        }

        // 링크드리스트는 중복 데이터 허용한다.
        // 강호동씨를 여러번 넣어볼게요. 여러번 넣어진다.
    }
}

// 어떤 상황에서 쓰는게 유리한지 비교해서 정리해두면 면접에 많은 도움이 될 거야.
