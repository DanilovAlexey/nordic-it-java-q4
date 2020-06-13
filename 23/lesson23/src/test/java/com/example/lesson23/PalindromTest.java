package com.example.lesson23;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static com.example.lesson23.Palindrom.*;

@ExtendWith(SpringExtension.class)
public class PalindromTest {

	@Test
	@DisplayName("Проверка нечетной строки на палиндром")
	public void testErrorString() throws Exception {
		var result = isPalindrom("батон");
		
		assertThat(result).isFalse();
	}
}
