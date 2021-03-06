package nl.kbresearch.europeana_newspapers.NerAnnotator.alto;

import edu.stanford.nlp.ling.CoreAnnotation;

/**
 * Tagger class for a line break. If the value is true, there is a hyphen at the
 * end of the line
 * 
 * @author rene
 * 
 */
public class HyphenatedLineBreak implements CoreAnnotation<Boolean> {

	@Override
	public Class<Boolean> getType() {
		return Boolean.class;
	}

}
