package com.babursomer.lesson_022;

public interface Accountable {
	public abstract double getSalary();
	
	void setWorkingHours(int hours);
	
	int getWorkingHours();
	
	double getHourlyRate();
}
