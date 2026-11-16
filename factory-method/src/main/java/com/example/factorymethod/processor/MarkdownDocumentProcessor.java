package com.example.factorymethod.processor;

import com.example.factorymethod.documents.Document;
import com.example.factorymethod.documents.MarkdownDocument;

public final class MarkdownDocumentProcessor extends DocumentProcessor{
    @Override
    protected Document createDocument(String content) {
        return new MarkdownDocument(content);
    }
}
