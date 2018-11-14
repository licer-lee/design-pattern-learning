package com.licerlee.dp.behavior.strategy.cost;

public class Test {

	public static void main(String[] args) {

		// 运费计算，飞机1kg=100￥，公路1kg=50￥，水路1kg=30￥
		CostContext cc = new CostContext(new CostPlant());
		float weight = 10f;
		cc.countCost(weight);

	}
}
