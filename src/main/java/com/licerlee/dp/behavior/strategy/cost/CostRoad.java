package com.licerlee.dp.behavior.strategy.cost;

public class CostRoad implements CostStrategy {

	public float cost(float weight) {
		return weight * 50f;
	}

}
