package br.com.buscape;

public class Cena {

    private final long id;
    private final String content;

    public Cena(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}