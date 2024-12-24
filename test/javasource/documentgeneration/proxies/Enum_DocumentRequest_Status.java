// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package documentgeneration.proxies;

public enum Enum_DocumentRequest_Status
{
	Pending(new java.lang.String[][] { new java.lang.String[] { "en_US", "Pending" } }),
	Completed(new java.lang.String[][] { new java.lang.String[] { "en_US", "Completed" } }),
	Failed(new java.lang.String[][] { new java.lang.String[] { "en_US", "Failed" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private Enum_DocumentRequest_Status(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<>();
		for (java.lang.String[] captionString : captionStrings) {
			captions.put(captionString[0], captionString[1]);
		}
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		return captions.getOrDefault(languageCode, "en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}