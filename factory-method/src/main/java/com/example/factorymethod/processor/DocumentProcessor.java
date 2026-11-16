package com.example.factorymethod.processor;

import com.example.factorymethod.documents.Document;

public sealed abstract class DocumentProcessor permits PdfDocumentProcessor, WordDocumentProcessor, MarkdownDocumentProcessor {
    
    public final void process(String content) {
        Document document = createDocument(content);
        document.render();
        document.save();
    }

    protected abstract Document createDocument(String content);
}
