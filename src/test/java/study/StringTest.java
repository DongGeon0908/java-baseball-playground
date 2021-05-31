package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    // 요구사항 1
    @Test
    void split() {
        // "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현
        String[] actual_1 = "1,2".split(",");
        assertThat(actual_1).contains("1", "2");
        // assertThat().contains(); --> 순서, 중복을 무시하는 대신 원소값과 개수가 정확하게 일치하는지 검사


        // "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현
        String[] actual_2 = "1".split(",");
        assertThat(actual_2).containsExactly("1");
        // assertThat().containsExactly(); --> 순서와 중복을 포함해서 원소값과 개수가 정확하게 일치하는지 검사

        // contains와 containsExactly는 순서와 중복에서 차이가 존재!!
    }

    // 요구사항 2
    @Test
    void substring() {
        // "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환
        String actual = "(1,2)".substring(1, 4);
        assertThat(actual).isEqualTo("1,2");
    }

    // 요구사항 3
    // @DisplayName을 통해 각각의 Test에 대한 이름을 정의할 수 있음
    @DisplayName("charAt_1() Test")
    @Test
    void charAt_1() {
        String actual = "abc";
        int index = 10;

        assertThatThrownBy(() -> actual.charAt(index))
                .isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("Index: 2, Size: 2");
    }

    // assertThatThrownBy()와 유사하지만, assertThatExceptionOfType()는 Exception의 시작점을 특정할 수 있다!!
    @DisplayName("charAt_2() Test")
    @Test
    void charAt_2() {
        String actual = "abc";
        int index = 10;

        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> actual.charAt(index))
                .withMessageMatching("Index: 2, Size: 2");
    }

}
