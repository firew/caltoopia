/*
* generated by Xtext
*/
package org.caltoopia.frontend;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class CalUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.caltoopia.frontend.ui.internal.CalActivator.getInstance().getInjector("org.caltoopia.frontend.Cal");
	}
	
}