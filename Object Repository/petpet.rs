<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>petpet</name>
   <tag></tag>
   <elementGuidId>adbc0cad-8943-4bcb-b0ca-6234da18777d</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;id\&quot;: ${id},\n  \&quot;petId\&quot;: ${petId},\n  \&quot;quantity\&quot;: ${quantity},\n  \&quot;shipDate\&quot;: \&quot;${shipDate}\&quot;,\n  \&quot;status\&quot;: \&quot;${status}\&quot;,\n  \&quot;complete\&quot;: ${true}\n}&quot;,
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
      <webElementGuid>a3095233-2f88-4891-be82-a7d99d344208</webElementGuid>
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
      <defaultValue>''</defaultValue>
      <description></description>
      <id>e86fce3d-a45a-4570-b96e-0c0de84fd669</id>
      <masked>false</masked>
      <name>id</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>b31689c6-c43c-4159-a931-79256df5b046</id>
      <masked>false</masked>
      <name>petId</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>41345672-573c-4279-8d91-a832b37192d7</id>
      <masked>false</masked>
      <name>quantity</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>a76da681-7ec9-4ba0-b8e6-c2dd7ba389dd</id>
      <masked>false</masked>
      <name>shipDate</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>feaebb4a-1fbc-48a0-a848-eb71026c71f2</id>
      <masked>false</masked>
      <name>status</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>31a35b04-0e55-4c8b-8050-00fb812381af</id>
      <masked>false</masked>
      <name>complete</name>
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
