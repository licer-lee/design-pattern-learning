package com.licerlee.dp.behavior.strategy.cost;

public class CostPlant implements CostStrategy {

	public float cost(float weight) {
		return weight * 100f;
	}

}
