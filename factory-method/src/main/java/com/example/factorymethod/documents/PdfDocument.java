package com.example.factorymethod.documents;

public final class PdfDocument implements Document {
    private final String content;

    public PdfDocument(String content) {
        this.content = content;
    }

    @Override
    public void render() {
        System.out.println(this.getClass().getSimpleName() + " : render()");
    }

    @Override
    public void save() {
        System.out.println(this.getClass().getSimpleName() + " : save()");
    }
}