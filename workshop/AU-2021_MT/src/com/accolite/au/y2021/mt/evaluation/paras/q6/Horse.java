package com.accolite.au.y2021.mt.evaluation.paras.q6;


class Horse {
	int speed = 0;
	int speeds = 0;
	int distanceCovered = 0;
	float averageSpeed;
	int timeTaken = 0;
	int totallSpeedChanges = 0;
	int topSpeed = Integer.MIN_VALUE;
	int lowSpeed = Integer.MAX_VALUE;
	String speedHistory = "";
	String name;

	public Horse(String name) {
		this.name = name;

	}
}
