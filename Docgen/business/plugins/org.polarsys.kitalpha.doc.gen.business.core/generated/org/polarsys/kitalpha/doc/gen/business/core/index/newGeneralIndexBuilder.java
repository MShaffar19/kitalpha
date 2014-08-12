/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
//Generated on Tue Aug 12 15:01:03 CEST 2014 with EGF 1.2.0.v20140721-0706
package org.polarsys.kitalpha.doc.gen.business.core.index;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

public class newGeneralIndexBuilder
		extends
		org.polarsys.kitalpha.doc.gen.business.core.doccontent.ElementDocContent {
	protected static String nl;

	public static synchronized newGeneralIndexBuilder create(
			String lineSeparator) {
		nl = lineSeparator;
		newGeneralIndexBuilder result = new newGeneralIndexBuilder();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties()
			.getProperty("line.separator")) : nl;
	protected final String TEXT_1 = " <!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\""
			+ NL
			+ "   \"http://www.w3.org/TR/html4/frameset.dtd\">"
			+ NL
			+ "<html>" + NL + "<head>" + NL + "<title>";
	protected final String TEXT_2 = "</title>" + NL + "</head>";
	protected final String TEXT_3 = " </html>";
	protected final String TEXT_4 = "<frameset rows=\"63,*,40\" frameborder=\"0\" framespacing=\"0\" border=\"0\">"
			+ NL
			+ "  <frame src=\"header.html\" name=\"header\" marginheight=\"0\" marginwidth=\"0\" scrolling=\"no\" noresize=\"0\"/>"
			+ NL
			+ "  <frameset cols=\"22%,*\" border=\"5\" frameborder=\"1\" framespacing=\"1\">"
			+ NL
			+ "  <frame src=\"modelindex.html\" name=\"modelsIndex\"/>"
			+ NL
			+ "  <frame name=\"content\"/>"
			+ NL
			+ "  <noframes>"
			+ NL
			+ "    Oops ! Your browser cannot display this page !"
			+ NL
			+ "  </noframes>"
			+ NL
			+ "  </frameset>"
			+ NL
			+ "  <frame src=\"footer.html\" name=\"footer\" scrolling=\"no\" frameborder=\"0\" noresize=\"noresize\"/>"
			+ NL
			+ "  <noframes>"
			+ NL
			+ "    Oops ! Your browser cannot display this page !"
			+ NL
			+ "  </noframes>" + NL + "</frameset>";
	protected final String TEXT_5 = NL;
	protected final String TEXT_6 = NL;

	public newGeneralIndexBuilder() {
		//Here is the constructor
		StringBuffer stringBuffer = new StringBuffer();

		// add initialisation of the pattern variables (declaration has been already done).

	}

	public String generate(Object argument) throws Exception {
		final StringBuffer stringBuffer = new StringBuffer();

		InternalPatternContext ctx = (InternalPatternContext) argument;
		Map<String, String> queryCtx = null;
		IQuery.ParameterDescription paramDesc = null;
		Node.Container currentNode = ctx.getNode();

		if (preCondition(ctx)) {
			ctx.setNode(new Node.Container(currentNode, getClass()));
			orchestration(ctx);
		}

		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(
					OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_5);
		stringBuffer.append(TEXT_6);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		super.orchestration(new SuperOrchestrationContext(ictx));

		return null;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		return parameters;
	}

	protected void method_setContext(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		title = "Index";
		fileName = "index";

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setContext",
				stringBuffer.toString());
	}

	protected void method_docHeader(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_1);
		stringBuffer.append(title);
		stringBuffer.append(TEXT_2);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "docHeader",
				stringBuffer.toString());
	}

	protected void method_docFooter(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_3);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "docFooter",
				stringBuffer.toString());
	}

	protected void method_content(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_4);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content",
				stringBuffer.toString());
	}

	protected void method_startContent(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "startContent",
				stringBuffer.toString());
	}

	protected void method_endContent(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "endContent",
				stringBuffer.toString());
	}
}
