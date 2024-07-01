package com.rimi.practice;

public interface ILaptop {
	abstract int turnOn();
	default String startWindows() {
		return "";
	} 
}
