package nl.kb.europeananewspaper.NerAnnotater.alto;

import edu.stanford.nlp.ling.CoreAnnotation;

/**
 * Tagger class for the original content from the ALTO element, without any
 * cleanup or combination.
 * 
 * The cleaned input that was used for the NER is marked with
 * TextAnnotation.class instead
 * 
 * @author rene
 * 
 */
public class OriginalContent implements CoreAnnotation<String> {

	public Class<String> getType() {
		return String.class;
	}

}