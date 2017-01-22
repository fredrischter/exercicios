package br.com.buscape;

public class Submarino {
	private int x;
	private int y;
	private int z;

	private enum Direcao {
		NORTE, SUL, LESTE, OESTE
	};

	private Direcao direcao = Direcao.NORTE;

	public Submarino() {
	}

	public void executar(char c) {
		switch (c) {
		case 'L':
			L();
			break;
		case 'R':
			R();
			break;
		case 'U':
			U();
			break;
		case 'D':
			D();
			break;
		case 'M':
			M();
			break;
		}
	}

	public void L() {
		switch (direcao) {
		case NORTE:
			direcao = Direcao.OESTE;
			break;
		case OESTE:
			direcao = Direcao.SUL;
			break;
		case SUL:
			direcao = Direcao.LESTE;
			break;
		case LESTE:
			direcao = Direcao.NORTE;
			break;
		}
	}

	public void R() {
		switch (direcao) {
		case NORTE:
			direcao = Direcao.LESTE;
			break;
		case LESTE:
			direcao = Direcao.SUL;
			break;
		case SUL:
			direcao = Direcao.OESTE;
			break;
		case OESTE:
			direcao = Direcao.NORTE;
			break;
		}
	}

	public void M() {
		int nextX = x;
		int nextY = y;
		switch (direcao) {
		case NORTE:
			nextY++;
			break;
		case LESTE:
			nextX++;
			break;
		case SUL:
			nextY--;
			break;
		case OESTE:
			nextX--;
			break;
		}

		x = nextX;
		y = nextY;
	}

	public void U() {
		if (z == 0) {
			return;
		}
		z++;
	}

	public void D() {
		z--;
	}

	public String toString() {
		return "" + x + " " + y + " " + z + " " + direcao;
	}
}
