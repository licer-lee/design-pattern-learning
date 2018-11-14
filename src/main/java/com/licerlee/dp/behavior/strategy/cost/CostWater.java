package com.licerlee.dp.behavior.strategy.cost;

public class CostWater implements CostStrategy {

	public float cost(float weight) {
		return weight * 30f;
	}

}
