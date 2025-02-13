package adapter.LanguageTranslation;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

// DO NOT REMOVE THE NO-ARG CONSTRUCTOR ANNOTATION
@NoArgsConstructor
@AllArgsConstructor
public class TranslationRequest {
    public String text;
    public String sourceLanguage;
    public String targetLanguage;
    public Double confidenceThreshold;
}