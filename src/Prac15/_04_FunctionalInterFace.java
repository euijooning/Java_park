package Prac15;

import Prac15.converter.Convertible16;
import Prac15.converter.ConvertibleWithNoParams;
import Prac15.converter.ConvertibleWithReturn;
import Prac15.converter.ConvertibleWithTwoParams;
import Prac15.converter.KRWConverter16;

public class _04_FunctionalInterFace {
// 달러 금액을 입력하면, 우리 돈으로 얼마인지를 알려주는(변환해주는) 프로그램 만들기

  public static void main(String[] args) {
    // KRWConverter 객체 만들어서 실행해보기
    KRWConverter16 converter = new KRWConverter16();
    //converter.convert(1); // 1 달러 = 1200 원 출력

    convertUSD(converter, 2); // 2 달러 = 2400 원 출력.
    /*
    첫 번째와 똑같은 결과가 나왔는데, 왜 그럴까?
    => 너무 당연하다. 우리는 converter.convert(1);에서 하는 동작을 아래의 convertUSD() 메서드로 옮긴 것일 뿐이다.

    그런데 코드를 잘 뜯어보면,
    convertUSD() 메소드를 호출하면, converter를 전달을 하는데, 아래에 있는 메서드 내에서 동작은,
    converter 내의 convert 메서드를 호출하는 것일 뿐.
    그래서 이 동작하는 convert(2) 부분은,
    우리가 Convertible16 인터페이스를 통해 구현한 KWRConverter의 convert(1) 메서드를 호출하는 것과 똑같다.
    (괄호안은 헷갈리지 말라고 위해 일부러 전달값을 넣어놓은 것임)


     */

  }
  // 아래에 메서드 분리해서 converter.convert()가 하는 내용을 출력해보자

  // 우리가 지금 환율을 변환하는 메서드를 만드는 것이므로,
  // 괄호 안에 인터페이스를 넣어주고(KRWConverter을 사용할 수도 있지만 다형성에 의해서 가능),
  // 얼마의 달러를 어떻게 변환해줄거냐를 계산 시켜야 하므로 int로 USD 달러를 받는다.
  public static void convertUSD(Convertible16 converter, int USD) { //원래는 convertiber16이어야 하지만 편의상  converter라고 썼음
   converter.convert(USD);

  }

}
