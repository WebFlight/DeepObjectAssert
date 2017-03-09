// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package deepobjectassert.actions;

import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import deepobjectassert.helpers.Comparator;
import deepobjectassert.repositories.MendixObjectRepository;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class DeepObjectAssert extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject ExpectedObject;
	private IMendixObject ActualObject;

	public DeepObjectAssert(IContext context, IMendixObject ExpectedObject, IMendixObject ActualObject)
	{
		super(context);
		this.ExpectedObject = ExpectedObject;
		this.ActualObject = ActualObject;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		ILogNode logger = Core.getLogger("DeepObjectAssert");
		MendixObjectRepository mendixObjectRepository = new MendixObjectRepository(getContext());
		Comparator comparator = new Comparator(ExpectedObject, ActualObject, logger, mendixObjectRepository);
		return comparator.CompareLists();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "DeepObjectAssert";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
