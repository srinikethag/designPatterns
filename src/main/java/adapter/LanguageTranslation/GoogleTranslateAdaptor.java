package adapter.LanguageTranslation;

import adapter.LanguageTranslation.external.GoogleTranslateApi;
import adapter.LanguageTranslation.external.GoogleTranslationRequest;

import java.util.List;



public class GoogleTranslateAdaptor implements TranslationProviderAdapter{

    GoogleTranslateApi googleTranslateApi = new GoogleTranslateApi();
    GoogleTranslationRequest googleTranslationRequest;

    public String translate(TranslationRequest translationRequest){
        this.googleTranslationRequest = new GoogleTranslationRequest(translationRequest.text,
                translationRequest.sourceLanguage, translationRequest.targetLanguage,
                translationRequest.confidenceThreshold);
        return googleTranslateApi.convert(this.googleTranslationRequest);
    }

    public List<String> getLanguages(){
        return this.googleTranslateApi.getLanguages();
    }
}

