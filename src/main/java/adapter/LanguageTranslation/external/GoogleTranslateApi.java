package adapter.LanguageTranslation.external;

import java.util.List;

import static adapter.LanguageTranslation.external.ApiUtils.logGoogleGetSupportedLanguages;
import static adapter.LanguageTranslation.external.ApiUtils.logGoogleTranslate;


public class GoogleTranslateApi {

    public String convert(GoogleTranslationRequest request) {
        // Implementation for translating text using Google Translate API
        logGoogleTranslate();
        return "Translated text";
    }

    public List<String> getLanguages() {
        // Implementation for fetching supported languages from Google Translate
        logGoogleGetSupportedLanguages();
        return List.of("hindi", "marathi", "kannada");
    }
}
