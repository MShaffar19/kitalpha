/*******************************************************************************
 * Copyright (c) 2014, 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.validation;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorer;

public class VpActivityExplorerContextSelector extends AbstractContextSelector {

	@Override
	public boolean selects(Object arg0) {
		return validateAndGetAspect(arg0) instanceof ViewpointActivityExplorer;
	}

}
