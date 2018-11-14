package com.licerlee.dp.behavior.strategy.cost;

public class CostContext {

	private CostStrategy cs;

	public CostContext(CostStrategy cs) {
		this.cs = cs;
	}

	public String countCost(float weight) {
		System.out.println(" need to cost:" + cs.cost(weight));
		return " need to cost:" + cs.cost(weight);
	}
	
	
}
