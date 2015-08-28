package com.nonefly.enumtype;
/**
 * 通过质量半径计算行星质量
 * @author nonefly
 * Aug 2, 2015
 */
public class WeightTable{
	
	public enum Planet{
		MERCURY(3.302e+23, 2.439e6),
		VENUS(4.869e+24, 6.052e6),
		EARTH(5.975e+24, 6.378e6);
		
		private final double mass;
		private final double radius;
		private final double sufaceGravity;
		private static final double G = 6.67300E-11;
		
		Planet(double mass, double radius) {
			this.mass = mass;
			this.radius = radius;
			sufaceGravity = G * mass / (radius * radius);
		}
		
		public double mass(){ return mass; }
		public double radius(){ return radius; }
		public double sufaceGravity(){ return sufaceGravity; }
		public double sufaceGravity(double mass){
			return mass * sufaceGravity; 
		}
		
	}
	
	public static void main(String[] args) {
		double earthWeight = 175;
		double mass = earthWeight / Planet.EARTH.sufaceGravity();
		for (Planet p : Planet.values()) {
			System.out.printf("Weight on %s is %f%n", p, p.sufaceGravity(mass));
		}
		
		Planet p = Planet.EARTH;
		Planet p2 = Planet.EARTH;
		System.out.println(p.ordinal());
	}
}