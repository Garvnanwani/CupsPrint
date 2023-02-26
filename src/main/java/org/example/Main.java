package org.example;

import java.io.FileInputStream;

import org.cups4j.CupsClient;
import org.cups4j.CupsPrinter;
import org.cups4j.PrintJob;
import org.cups4j.PrintRequestResult;

import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Using Cups4j Library

        CupsClient cupsClient = new CupsClient("192.168.1.100", 631);

        List cupsPrinters = cupsClient.getPrinters();

        for(int i = 0; i < cupsPrinters.size(); i++) {
            CupsPrinter cupsPrinter = (CupsPrinter) cupsPrinters.get(i);
            System.out.println(cupsPrinter.getName());
        }

        CupsPrinter printer = (CupsPrinter) cupsPrinters.get(0);

        InputStream inputStream = new FileInputStream("/Users/garv/Desktop/Projects/cups_java/CupsPrint/src/main/resources/meme.jpeg");
        PrintJob printJob = new PrintJob.Builder(inputStream).build();
        PrintRequestResult printRequestResult = printer.print(printJob);

        // Using Jipsi Library

        // URI uri = new URI("http://192.168.1.100:631/printers/Samsung_ML-2160_Series");

        // IppPrintService printService = new IppPrintService(uri);

        // DocFlavor pdfFlavor = DocFlavor.INPUT_STREAM.PDF;

        // File pdfFile = new File("/Users/garv/Desktop/Projects/cups_java/CupsPrint/src/main/resources/myfile.pdf");
        // FileInputStream pdfStream = new FileInputStream(pdfFile);
        // Doc pdfDoc = new SimpleDoc(pdfStream, pdfFlavor, null);

        // PrintRequestAttributeSet attributes = new HashPrintRequestAttributeSet();
        // attributes.add(new Copies(1));
        // attributes.add(PrintQuality.HIGH);
        // attributes.add(Sides.ONE_SIDED);

        // System.out.println("Printing PDF file: " + pdfFile.getName());
        // DocPrintJob printJob = printService.createPrintJob();
        // printJob.print(pdfDoc, attributes);

    }

}




