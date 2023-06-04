// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testmodule.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	/**
	 * @deprecated
	 * The default constructor of the Microflows class should not be used.
	 * Use the static microflow invocation methods instead.
	 */
	@java.lang.Deprecated(since = "9.12", forRemoval = true)
	public Microflows() {}

	// These are the microflows for the TestModule module
	public static void aCT_TestContext_GeneratePDF(IContext context, testmodule.proxies.TestContext _testContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TestContext", _testContext == null ? null : _testContext.getMendixObject());
		Core.microflowCall("TestModule.ACT_TestContext_GeneratePDF").withParams(params).execute(context);
	}
	public static void aCT_TestContext_SaveNew(IContext context, testmodule.proxies.TestContext _testContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TestContext", _testContext == null ? null : _testContext.getMendixObject());
		Core.microflowCall("TestModule.ACT_TestContext_SaveNew").withParams(params).execute(context);
	}
	public static boolean aSu_System(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("TestModule.ASu_System").withParams(params).execute(context);
	}
	public static void dOC_GenerateDocument(IContext context, testmodule.proxies.TestContext _testContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TestContext", _testContext == null ? null : _testContext.getMendixObject());
		Core.microflowCall("TestModule.DOC_GenerateDocument").withParams(params).execute(context);
	}
}
