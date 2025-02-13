package adapter.LanguageTranslation;

public class TranslationManager {

    private TranslationProviderAdapter translationProviderAdapter;

    public String translate(String text, String sourceLanguage, String targetLanguage) {

        return this.translationProviderAdapter.translate(new TranslationRequest(text, sourceLanguage, targetLanguage, 0.8));
    }

}
