package br.com.buscape;

import java.util.concurrent.atomic.AtomicLong;

public class Cena {

    private static final AtomicLong counter = new AtomicLong();
    
	private final long id = counter.incrementAndGet();
	private final String content;
	private final Submarino submarino = new Submarino();

	public Cena(String content) {
		this.content = content;

		for (int i = 0; i < content.length(); i++) {
			submarino.executar(content.charAt(i));
		}
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public String toString() {
		return submarino.toString();
	}
}
