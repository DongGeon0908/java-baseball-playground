package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // 요구사항 1
    @DisplayName("size() Test")
    @Test
    void size() {
        // Set의 size() 메소드를 활용해 Set의 크기를 확인하는 학습테스트를 구현
        int setSize = 3;
        assertThat(numbers.size()).isEqualTo(setSize);
    }

    // 요구사항 2
    @DisplayName("contains() with @ValueSource")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3}) // 범위!!
    void contains_1(int number) {
        // JUnit의 ParameterizedTest를 활용해 중복 코드를 제거
        assertTrue(numbers.contains(number));
    }

    // 요구사항 3
    @DisplayName("contains() with @CsvSource")
    @ParameterizedTest
    @CsvSource(value = {"1:true","2:true" ,"3:true", "4:false", "5:false"}, delimiter = ':')
    void contains_2(int input, boolean expected) {
        assertEquals(expected, numbers.contains(input));
    }

}