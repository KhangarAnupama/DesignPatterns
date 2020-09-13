package com.design.patterns.structural.bridge;

public class TestBridge {
	
	public static void main(String[] args) {
		BridgeImpl bridgeImpl = new BridgeImpl(10, 100, 1000, new GreenCircle());
		bridgeImpl.draw();
		
		bridgeImpl = new BridgeImpl(10, 100, 1000, new OrangeCircle());
		bridgeImpl.draw();
		
		bridgeImpl = new BridgeImpl(10, 100, 1000, new RedCircle());
		bridgeImpl.draw();
	}

}
