package crc64473b366bb1ee0634;


public class StackedPointCustomColorizer
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.devexpress.dxcharts.StackedCustomPointColorizer,
		com.devexpress.dxcharts.StackedPointColorizer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getLegendItemProvider:()Lcom/devexpress/dxcharts/LegendItemProvider;:GetGetLegendItemProviderHandler:DevExpress.Xamarin.Android.Charts.IStackedCustomPointColorizerInvoker, DevExpress.Xamarin.Android.Charts\n" +
			"n_getColor:(Lcom/devexpress/dxcharts/ColoredStackedPointInfo;)I:GetGetColor_Lcom_devexpress_dxcharts_ColoredStackedPointInfo_Handler:DevExpress.Xamarin.Android.Charts.IStackedCustomPointColorizerInvoker, DevExpress.Xamarin.Android.Charts\n" +
			"";
		mono.android.Runtime.register ("DevExpress.Maui.Charts.Android.StackedPointCustomColorizer, DevExpress.Maui.Charts", StackedPointCustomColorizer.class, __md_methods);
	}


	public StackedPointCustomColorizer ()
	{
		super ();
		if (getClass () == StackedPointCustomColorizer.class)
			mono.android.TypeManager.Activate ("DevExpress.Maui.Charts.Android.StackedPointCustomColorizer, DevExpress.Maui.Charts", "", this, new java.lang.Object[] {  });
	}


	public com.devexpress.dxcharts.LegendItemProvider getLegendItemProvider ()
	{
		return n_getLegendItemProvider ();
	}

	private native com.devexpress.dxcharts.LegendItemProvider n_getLegendItemProvider ();


	public int getColor (com.devexpress.dxcharts.ColoredStackedPointInfo p0)
	{
		return n_getColor (p0);
	}

	private native int n_getColor (com.devexpress.dxcharts.ColoredStackedPointInfo p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
