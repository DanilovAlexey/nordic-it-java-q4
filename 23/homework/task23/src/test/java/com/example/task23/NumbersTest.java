package com.example.task23;

import static org.assertj.core.api.Assertions.assertThat;
import static com.example.task23.Task23Application.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class NumbersTest {

	@Test
	@DisplayName("Проверка подсчета последовательности единиц")
	public void testErrorNumber() throws Exception {
		var result = countNumbers("001111001");
		assertThat(result).isEqualTo(4);

		var result1 = countNumbers("00011010");
		assertThat(result1).isEqualTo(2);

		var result2 = countNumbers("1110110001");
		assertThat(result2).isEqualTo(3);

		var result3 = countNumbers("00000");
		assertThat(result3).isEqualTo(0);

		var result4 = countNumbers("11111");
		assertThat(result4).isEqualTo(5);

		var result5 = countNumbers("");
		assertThat(result5).isEqualTo(0);

		var result6 = countNumbers("sfefef");
		assertThat(result6).isEqualTo(0);

		var result7 = countNumbers("sf11efef");
		assertThat(result7).isEqualTo(2);

		var result8 = countNumbers("sf1ef0ef");
		assertThat(result8).isEqualTo(1);

	}

}
