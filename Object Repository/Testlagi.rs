<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Testlagi</name>
   <tag></tag>
   <elementGuidId>5d4a56f9-df4b-47f6-9fec-f780434d51fd</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;[\n  {\n    \&quot;id\&quot;: 0,\n    \&quot;username\&quot;: \&quot;user\&quot;,\n    \&quot;firstName\&quot;: \&quot;first\&quot;,\n    \&quot;lastName\&quot;: \&quot;last\&quot;,\n    \&quot;email\&quot;: \&quot;email\&quot;,\n    \&quot;password\&quot;: \&quot;password\&quot;,\n    \&quot;phone\&quot;: \&quot;phone\&quot;,\n    \&quot;userStatus\&quot;: 0\n  }\n]&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>bc4cf379-311f-47a8-a352-28eb3aec8f96</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://petstore.swagger.io/v2/pet</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>0</defaultValue>
      <description></description>
      <id>1667be8c-8622-487a-b634-87a7eea89024</id>
      <masked>false</masked>
      <name>id</name>
   </variables>
   <variables>
      <defaultValue>'user'</defaultValue>
      <description></description>
      <id>d95d4632-5aed-469f-b1c5-be80a0643f34</id>
      <masked>false</masked>
      <name>username</name>
   </variables>
   <variables>
      <defaultValue>'first'</defaultValue>
      <description></description>
      <id>444480b4-5ea7-4975-8ea2-59aa7f837ed9</id>
      <masked>false</masked>
      <name>firstname</name>
   </variables>
   <variables>
      <defaultValue>'last'</defaultValue>
      <description></description>
      <id>e1ef9c6a-8756-4676-b0aa-90948cc88f6e</id>
      <masked>false</masked>
      <name>lastname</name>
   </variables>
   <variables>
      <defaultValue>'email'</defaultValue>
      <description></description>
      <id>1b704f13-c816-41dc-8e9b-70db72887bc0</id>
      <masked>false</masked>
      <name>email</name>
   </variables>
   <variables>
      <defaultValue>'password'</defaultValue>
      <description></description>
      <id>db02b478-6299-466c-a4f7-8965b3b43d6e</id>
      <masked>false</masked>
      <name>password</name>
   </variables>
   <variables>
      <defaultValue>'phone'</defaultValue>
      <description></description>
      <id>42a2b0cd-1a2e-4bb7-8400-0cf365bb5a3c</id>
      <masked>false</masked>
      <name>phone</name>
   </variables>
   <variables>
      <defaultValue>0</defaultValue>
      <description></description>
      <id>657f64da-f39f-4341-b5ec-783f2f5b8858</id>
      <masked>false</masked>
      <name>userStatus</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
