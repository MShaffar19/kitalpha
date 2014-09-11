/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.model.common.scrutiny.registry;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.polarsys.kitalpha.model.common.scrutiny.Messages;
import org.polarsys.kitalpha.model.common.scrutiny.constants.Constants;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;

/**
 * @author Faycal Abka
 */

@SuppressWarnings("rawtypes")
public class ModelScrutinyRegistry {
	
	private static Logger LOGGER = Logger.getLogger(ModelScrutinyRegistry.class);

	private Map<String, RegistryElement> registry;
	
	public final static ModelScrutinyRegistry INSTANCE = new ModelScrutinyRegistry();   
	
	private ModelScrutinyRegistry(){
		this.registry = new HashMap<String, RegistryElement>();
	}
	
	
	public Map<String, RegistryElement> initRegistry(){
		
		//Dispose the registry
		dispose();
		
		//Read all extensions
		IExtension [] extensions = RegistryHelper.getAllExtensionsFor(Constants.SCRUTINIZE_EXTENSION_POINT);
		
		if (extensions != null && extensions.length > 0){
			for (IExtension extension : extensions) {
				for(IConfigurationElement config: extension.getConfigurationElements()){
					if (config.getName().equals(Constants.SCRUTINIZE_ANALYSIS)){
						String id 		= config.getAttribute(Constants.GROUP_ID);
						String name 	= config.getAttribute(Constants.GROUP_NAME);
						IConfigurationElement[] classes = config.getChildren(Constants.SCRUTINIZE_CLASS);
						
						RegistryElement re = new RegistryElement(id, name);
						registry.put(id, re);
						
						if (classes != null && classes.length > 0){
							for (IConfigurationElement finderClass : classes) {
								try {
									Object finder = finderClass.createExecutableExtension(Constants.SCRUTINIZE_JAVA_CLASS);
									re.addFinder((IScrutinize)finder);
								} catch (CoreException e) {
									LOGGER.error(e.getMessage(), e);
								}
							}
						} else {
							LOGGER.error(Messages.MODEL_SCRUTINY_NO_SCRUTINIZE_FOUND);
						}
					}
				}
			}
		} else {
			LOGGER.warn(Messages.MODEL_SCRUTINY_NO_EXTENSION_FOUND);
		}
		
		return registry;
	}
	
	
	public RegistryElement getRegistryElement(String id){
		if (this.registry.containsKey(id))
			return this.registry.get(id);
		
		RuntimeException re = new RuntimeException(Messages.NO_SUCH_REGISTRY_ELEMENT);
		LOGGER.error(Messages.NO_SUCH_REGISTRY_ELEMENT, re);
		throw re;
	}
	
	
	private void dispose(){
		registry.clear();
	}
	
	
	public static class RegistryElement {
		
		private String id;
		private String name;
		private Collection<IScrutinize> finders;
		
		public RegistryElement(String id, String name){
			this.id = id;
			this.name = name;
			this.finders = new HashSet<IScrutinize>();
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Collection<IScrutinize> getFinders() {
			return finders;
		}
		
		public void addFinder(IScrutinize finder){
			finders.add(finder);
		}
	}


	public Map<String, RegistryElement> getRegistry() {
		return this.registry;
	}
}