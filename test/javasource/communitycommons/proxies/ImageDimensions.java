// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package communitycommons.proxies;

public class ImageDimensions implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject imageDimensionsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CommunityCommons.ImageDimensions";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Height("Height"),
		Width("Width");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ImageDimensions(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected ImageDimensions(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject imageDimensionsMendixObject)
	{
		if (imageDimensionsMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, imageDimensionsMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.imageDimensionsMendixObject = imageDimensionsMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static communitycommons.proxies.ImageDimensions initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new communitycommons.proxies.ImageDimensions(context, mendixObject);
	}

	public static communitycommons.proxies.ImageDimensions load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return communitycommons.proxies.ImageDimensions.initialize(context, mendixObject);
	}

	/**
	 * @return value of Height
	 */
	public final java.lang.Integer getHeight()
	{
		return getHeight(getContext());
	}

	/**
	 * @param context
	 * @return value of Height
	 */
	public final java.lang.Integer getHeight(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Height.toString());
	}

	/**
	 * Set value of Height
	 * @param height
	 */
	public final void setHeight(java.lang.Integer height)
	{
		setHeight(getContext(), height);
	}

	/**
	 * Set value of Height
	 * @param context
	 * @param height
	 */
	public final void setHeight(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer height)
	{
		getMendixObject().setValue(context, MemberNames.Height.toString(), height);
	}

	/**
	 * @return value of Width
	 */
	public final java.lang.Integer getWidth()
	{
		return getWidth(getContext());
	}

	/**
	 * @param context
	 * @return value of Width
	 */
	public final java.lang.Integer getWidth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Width.toString());
	}

	/**
	 * Set value of Width
	 * @param width
	 */
	public final void setWidth(java.lang.Integer width)
	{
		setWidth(getContext(), width);
	}

	/**
	 * Set value of Width
	 * @param context
	 * @param width
	 */
	public final void setWidth(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer width)
	{
		getMendixObject().setValue(context, MemberNames.Width.toString(), width);
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return imageDimensionsMendixObject;
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final communitycommons.proxies.ImageDimensions that = (communitycommons.proxies.ImageDimensions) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

  /**
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}
