<?xml version="1.0"?>
<globals>
    <#assign useSupport=(minApiLevel lt 14)>
    <#include "../common/common_globals.xml.ftl" />
    <global id="useSupport" code="boolean" value="${useSupport?string}" />
    <global id="SupportPackage" value="${useSupport?string('.support.v4','')}" />
    <global id="resOut" value="${resDir}" />
    <global id="srcOut" value="${srcDir}/${slashedPackageName(packageName)}" />
    <global id="relativePackage" value="<#if relativePackage?has_content>${relativePackage}<#else>${packageName}</#if>" />
    <global id="realAppPackage" code="string" value="${applicationPackage?replace('.debug','')}"/>

</globals>
