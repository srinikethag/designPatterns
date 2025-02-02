package adapter.LanguageTranslation;

import adapter.LanguageTranslation.external.MicrosoftTranslateApi;

import java.util.List;



public class MicrosoftTranslateAdaptor implements TranslationProviderAdapter {

    MicrosoftTranslateApi microsoftTranslateApi = new MicrosoftTranslateApi();

    public String translate(TranslationRequest translationRequest){
        return this.microsoftTranslateApi.translate(translationRequest.text,
                translationRequest.sourceLanguage, translationRequest.targetLanguage);
    }

    public List<String> getLanguages(){
        return this.microsoftTranslateApi.getSupportedLanguages();
    }
}
