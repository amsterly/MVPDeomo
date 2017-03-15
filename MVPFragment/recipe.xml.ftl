<?xml version="1.0"?>
<recipe>

	<instantiate from="root/src/app_package/SampleFragment.java.ftl"
     	to="${escapeXmlAttribute(srcOut)}/${fragmentName}.java" />
		
	<instantiate from="root/res/layout/fragment_sample.xml.ftl"
		to="${escapeXmlAttribute(resOut)}/layout/${layoutName}.xml" />
		
	<instantiate from="root/src/app_package/INone.java.ftl"
     	to="${escapeXmlAttribute(manifestOut)}/java/${slashedPackageName(applicationPackage)}/view/${modular}/I${pageName}.java" />
		
	<instantiate from="root/src/app_package/NonePresenter.java.ftl"
     	to="${escapeXmlAttribute(manifestOut)}/java/${slashedPackageName(applicationPackage)}/presenter/${modular}/${pageName}Presenter.java" />

	<open file="${escapeXmlAttribute(resOut)}/layout/${layoutName}.xml"/>        

 	<open file="${escapeXmlAttribute(srcOut)}/${fragmentName}.java" />

</recipe>
