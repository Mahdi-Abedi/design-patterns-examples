package com.example.factorymethod.processor;

import com.example.factorymethod.documents.Document;
import com.example.factorymethod.documents.MarkdownDocument;
import com.example.factorymethod.documents.WordDocument;

public final class WordDocumentProcessor extends DocumentProcessor {
    @Override
    protected Document createDocument(String content) {
        return new WordDocument(content);
    }
}
