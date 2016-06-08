package com.verifone.thr;

public class SharedObj {
	private int lastPrinted;
	private boolean who; // true odd false even
	public int getLastPrinted() {
		return lastPrinted;
	}

	public void setLastPrinted(int lastPrinted) {
		this.lastPrinted = lastPrinted;
	}

	public boolean isWho() {
		return who;
	}

	public void setWho(boolean who) {
		this.who = who;
	}
	
	
	
}
