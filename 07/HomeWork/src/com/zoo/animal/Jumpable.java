package com.zoo.animal;

import com.zoo.exceptions.NegativeValueException;

public interface Jumpable {
	public void jump(float meters) throws NegativeValueException;
}
