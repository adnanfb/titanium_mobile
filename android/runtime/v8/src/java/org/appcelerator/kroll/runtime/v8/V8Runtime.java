package org.appcelerator.kroll.runtime.v8;

public class V8Runtime
{
	public static final Object UNDEFINED = new Object();

	public static void init()
	{
		System.loadLibrary("kroll-v8");
		nativeInit(UNDEFINED);
	}

	public static void initModuleTemplate(Class<?> moduleClass)
	{
		nativeInitModuleTemplate(moduleClass);
	}

	private static native void nativeInit(Object undefined);
	private static native void nativeInitModuleTemplate(Class<?> moduleClass);
}
