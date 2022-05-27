package com.arquitecturajava.ejemplo004;

public class RobotPro extends Robot {

	private Rotable brazoPro;
	
	public void rotarBrazoPro() {
		brazoPro.rotar();
	}

	public Rotable getBrazoPro() {
		return brazoPro;
	}

	public void setBrazoPro(Rotable brazoPro) {
		this.brazoPro = brazoPro;
	}

	
}
