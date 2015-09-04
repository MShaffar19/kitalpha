/*
* generated by Xtext
*/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ActivityexplorerGrammarAccess;

public class ActivityexplorerParser extends AbstractContentAssistParser {
	
	@Inject
	private ActivityexplorerGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalActivityexplorerParser createParser() {
		org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalActivityexplorerParser result = new org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalActivityexplorerParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractPageAccess().getAlternatives(), "rule__AbstractPage__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getViewpointActivityExplorerAccess().getGroup(), "rule__ViewpointActivityExplorer__Group__0");
					put(grammarAccess.getViewpointActivityExplorerAccess().getGroup_5(), "rule__ViewpointActivityExplorer__Group_5__0");
					put(grammarAccess.getPageAccess().getGroup(), "rule__Page__Group__0");
					put(grammarAccess.getPageAccess().getGroup_4(), "rule__Page__Group_4__0");
					put(grammarAccess.getPageAccess().getGroup_5(), "rule__Page__Group_5__0");
					put(grammarAccess.getPageAccess().getGroup_6(), "rule__Page__Group_6__0");
					put(grammarAccess.getPageAccess().getGroup_10(), "rule__Page__Group_10__0");
					put(grammarAccess.getPageAccess().getGroup_10_2(), "rule__Page__Group_10_2__0");
					put(grammarAccess.getPageAccess().getGroup_10_3(), "rule__Page__Group_10_3__0");
					put(grammarAccess.getPageAccess().getGroup_11(), "rule__Page__Group_11__0");
					put(grammarAccess.getPageAccess().getGroup_12(), "rule__Page__Group_12__0");
					put(grammarAccess.getPageAccess().getGroup_13(), "rule__Page__Group_13__0");
					put(grammarAccess.getPageAccess().getGroup_14(), "rule__Page__Group_14__0");
					put(grammarAccess.getSectionAccess().getGroup(), "rule__Section__Group__0");
					put(grammarAccess.getSectionAccess().getGroup_4(), "rule__Section__Group_4__0");
					put(grammarAccess.getSectionAccess().getGroup_5(), "rule__Section__Group_5__0");
					put(grammarAccess.getSectionAccess().getGroup_8(), "rule__Section__Group_8__0");
					put(grammarAccess.getSectionAccess().getGroup_9(), "rule__Section__Group_9__0");
					put(grammarAccess.getSectionAccess().getGroup_10(), "rule__Section__Group_10__0");
					put(grammarAccess.getActivityAccess().getGroup(), "rule__Activity__Group__0");
					put(grammarAccess.getActivityAccess().getGroup_4(), "rule__Activity__Group_4__0");
					put(grammarAccess.getActivityAccess().getGroup_5(), "rule__Activity__Group_5__0");
					put(grammarAccess.getActivityAccess().getGroup_8(), "rule__Activity__Group_8__0");
					put(grammarAccess.getActivityAccess().getGroup_9(), "rule__Activity__Group_9__0");
					put(grammarAccess.getPageExtensionAccess().getGroup(), "rule__PageExtension__Group__0");
					put(grammarAccess.getSectionExtensionAccess().getGroup(), "rule__SectionExtension__Group__0");
					put(grammarAccess.getOverviewAccess().getGroup(), "rule__Overview__Group__0");
					put(grammarAccess.getOverviewAccess().getGroup_3(), "rule__Overview__Group_3__0");
					put(grammarAccess.getOverviewAccess().getGroup_4(), "rule__Overview__Group_4__0");
					put(grammarAccess.getOverviewAccess().getGroup_5(), "rule__Overview__Group_5__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getViewpointActivityExplorerAccess().getNameAssignment_3(), "rule__ViewpointActivityExplorer__NameAssignment_3");
					put(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesAssignment_5_2(), "rule__ViewpointActivityExplorer__OwnedPagesAssignment_5_2");
					put(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesAssignment_6(), "rule__ViewpointActivityExplorer__OwnedPagesAssignment_6");
					put(grammarAccess.getViewpointActivityExplorerAccess().getOwnedSectionExtensionsAssignment_7(), "rule__ViewpointActivityExplorer__OwnedSectionExtensionsAssignment_7");
					put(grammarAccess.getPageAccess().getNameAssignment_2(), "rule__Page__NameAssignment_2");
					put(grammarAccess.getPageAccess().getDescriptionAssignment_4_1(), "rule__Page__DescriptionAssignment_4_1");
					put(grammarAccess.getPageAccess().getFileExtensionsAssignment_5_2(), "rule__Page__FileExtensionsAssignment_5_2");
					put(grammarAccess.getPageAccess().getActivityExplorerItemIDAssignment_6_1(), "rule__Page__ActivityExplorerItemIDAssignment_6_1");
					put(grammarAccess.getPageAccess().getIndexAssignment_8(), "rule__Page__IndexAssignment_8");
					put(grammarAccess.getPageAccess().getOwnedOverviewAssignment_9(), "rule__Page__OwnedOverviewAssignment_9");
					put(grammarAccess.getPageAccess().getImagePathOnAssignment_10_2_3(), "rule__Page__ImagePathOnAssignment_10_2_3");
					put(grammarAccess.getPageAccess().getImagePathOffAssignment_10_3_3(), "rule__Page__ImagePathOffAssignment_10_3_3");
					put(grammarAccess.getPageAccess().getTabNameAssignment_11_2(), "rule__Page__TabNameAssignment_11_2");
					put(grammarAccess.getPageAccess().getHasPredicateAssignment_12_2(), "rule__Page__HasPredicateAssignment_12_2");
					put(grammarAccess.getPageAccess().getShowViewerAssignment_13_3(), "rule__Page__ShowViewerAssignment_13_3");
					put(grammarAccess.getPageAccess().getOwnedSectionsAssignment_14_2(), "rule__Page__OwnedSectionsAssignment_14_2");
					put(grammarAccess.getSectionAccess().getNameAssignment_2(), "rule__Section__NameAssignment_2");
					put(grammarAccess.getSectionAccess().getDescriptionAssignment_4_1(), "rule__Section__DescriptionAssignment_4_1");
					put(grammarAccess.getSectionAccess().getActivityExplorerItemIDAssignment_5_1(), "rule__Section__ActivityExplorerItemIDAssignment_5_1");
					put(grammarAccess.getSectionAccess().getIndexAssignment_7(), "rule__Section__IndexAssignment_7");
					put(grammarAccess.getSectionAccess().getFilteringAssignment_8_2(), "rule__Section__FilteringAssignment_8_2");
					put(grammarAccess.getSectionAccess().getExpandedAssignment_9_2(), "rule__Section__ExpandedAssignment_9_2");
					put(grammarAccess.getSectionAccess().getOwnedActivitiesAssignment_10_2(), "rule__Section__OwnedActivitiesAssignment_10_2");
					put(grammarAccess.getActivityAccess().getNameAssignment_2(), "rule__Activity__NameAssignment_2");
					put(grammarAccess.getActivityAccess().getDescriptionAssignment_4_1(), "rule__Activity__DescriptionAssignment_4_1");
					put(grammarAccess.getActivityAccess().getActivityExplorerItemIDAssignment_5_1(), "rule__Activity__ActivityExplorerItemIDAssignment_5_1");
					put(grammarAccess.getActivityAccess().getIndexAssignment_7(), "rule__Activity__IndexAssignment_7");
					put(grammarAccess.getActivityAccess().getHasPredicateAssignment_8_2(), "rule__Activity__HasPredicateAssignment_8_2");
					put(grammarAccess.getActivityAccess().getImagePathOffAssignment_9_2(), "rule__Activity__ImagePathOffAssignment_9_2");
					put(grammarAccess.getPageExtensionAccess().getExtendedPageIDAssignment_6(), "rule__PageExtension__ExtendedPageIDAssignment_6");
					put(grammarAccess.getPageExtensionAccess().getOwnedSectionsAssignment_7(), "rule__PageExtension__OwnedSectionsAssignment_7");
					put(grammarAccess.getSectionExtensionAccess().getExtendedSectionIDAssignment_6(), "rule__SectionExtension__ExtendedSectionIDAssignment_6");
					put(grammarAccess.getSectionExtensionAccess().getOwnedActivitiesAssignment_7(), "rule__SectionExtension__OwnedActivitiesAssignment_7");
					put(grammarAccess.getOverviewAccess().getDescriptionAssignment_3_1(), "rule__Overview__DescriptionAssignment_3_1");
					put(grammarAccess.getOverviewAccess().getImagePathOnAssignment_4_3(), "rule__Overview__ImagePathOnAssignment_4_3");
					put(grammarAccess.getOverviewAccess().getImagePathOffAssignment_5_3(), "rule__Overview__ImagePathOffAssignment_5_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalActivityexplorerParser typedParser = (org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalActivityexplorerParser) parser;
			typedParser.entryRuleViewpointActivityExplorer();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ActivityexplorerGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ActivityexplorerGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}