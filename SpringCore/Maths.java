package org.padmini.springcore;

import org.springframework.stereotype.Service;

@Service("ms")
public class Maths {
	public int add(int x,int y) {
		return x+y;
	}
	public int sub(int x,int y) {
		return x-y;
	}
}
