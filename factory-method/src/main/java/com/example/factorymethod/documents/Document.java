package com.example.factorymethod.documents;

public sealed interface Document permits PdfDocument, WordDocument, MarkdownDocument{
    void render();
    void save();
}
