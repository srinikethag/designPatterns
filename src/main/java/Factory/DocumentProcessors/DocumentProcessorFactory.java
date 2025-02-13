package Factory.DocumentProcessors;

public class DocumentProcessorFactory {

    public static DocumentProcessor createProcessor(DocumentType type, String documentName) {
        switch (type) {
            case TEXT:
                return new TextDocumentProcessor(documentName);
            case PRESENTATION:
                return new PresentationDocumentProcessor(documentName);
            case SPREAD_SHEET:
                return new SpreadsheetDocumentProcessor(documentName);
            default:
                throw new IllegalArgumentException("Unsupported document type: " + type);
        }
    }
}
