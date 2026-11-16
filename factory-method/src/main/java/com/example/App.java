package com.example;

import com.example.factorymethod.processor.DocumentProcessor;
import com.example.factorymethod.processor.PdfDocumentProcessor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DocumentProcessor processor = new PdfDocumentProcessor();
        processor.process("some content");
    }
}
