/*******************************************************************************
 * Copyright (c) 2012 Michael Vorburger (http://www.vorburger.ch).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package ch.vorburger.xtext.databinding;

import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.internal.EMFValuePropertyDecorator;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Like EMFProperties, but using an IXtextResourceReadWriteAccess instead of an EditingDomain.
 *
 * @author Michael Vorburger
 */
@SuppressWarnings("restriction")
public class EMFXtextProperties {

	// TODO Rename *ALL* the classes to drop EMF* prefix, e.g. EMFXtextProperties -> XtextProperties
	
	// TODO It would be better if this class could share some code with EMFProperties..
	// That's not possible today because it's all static - because if I could adapt it...
	
	public static IValueProperty value(EStructuralFeature feature) {
		IValueProperty property = new EMFXtextValueProperty(feature);
	    EMFValuePropertyDecorator featureProperty = new EMFValuePropertyDecorator(property, feature);
	    return featureProperty;
	}

	// TODO all variations just like in EMFProperties / EMFEditProperties, with FeaturePath/multiple/Set/List/resource stuff etc.

	public static EStructuralFeature value(IXtextResourceReadWriteAccess xTextReadWriteAccess, FeaturePath featurePath) {
		throw new UnsupportedOperationException();
	}

	public static EStructuralFeature set(IXtextResourceReadWriteAccess xTextReadWriteAccess, EStructuralFeature feature) {
		throw new UnsupportedOperationException();
	}
	
}