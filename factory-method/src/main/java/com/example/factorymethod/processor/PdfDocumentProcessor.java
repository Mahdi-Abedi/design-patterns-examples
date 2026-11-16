package com.example.factorymethod.processor;

import com.example.factorymethod.documents.Document;
import com.example.factorymethod.documents.PdfDocument;

public final class PdfDocumentProcessor extends DocumentProcessor{
    @Override
    protected Document createDocument(String content) {
        return new PdfDocument(content);
    }
}
