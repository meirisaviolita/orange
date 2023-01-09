<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Tugascobaapi1</name>
   <tag></tag>
   <elementGuidId>dbbf5af2-d71a-457b-9c65-bed13c4e1fca</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;id\&quot;: \&quot;${id}\&quot;,\n  \&quot;petId\&quot;: \&quot;${petId}\&quot;,\n  \&quot;quantity\&quot;: \&quot;${quantity}\&quot;,\n  \&quot;shipDate\&quot;: \&quot;${shipDate}\&quot;,\n  \&quot;status\&quot;: \&quot;${status}\&quot;,\n  \&quot;complete\&quot;: \&quot;${complete}\&quot;\n}&quot;,
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
      <webElementGuid>34b8309e-1c06-4dae-8d9c-07ea508d83a3</webElementGuid>
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
      <id>014c717d-94cc-4a99-801d-52d4e011a1cb</id>
      <masked>false</masked>
      <name>id</name>
   </variables>
   <variables>
      <defaultValue>0</defaultValue>
      <description></description>
      <id>3be3cf19-287a-4907-a7c5-7f48352a0d17</id>
      <masked>false</masked>
      <name>petId</name>
   </variables>
   <variables>
      <defaultValue>0</defaultValue>
      <description></description>
      <id>fd26eac7-7984-43c8-b0dc-3b09289b93b9</id>
      <masked>false</masked>
      <name>quantity</name>
   </variables>
   <variables>
      <defaultValue>'29-12-22'</defaultValue>
      <description></description>
      <id>7473f19f-37e4-40e2-a819-f680c299738a</id>
      <masked>false</masked>
      <name>ShipDate</name>
   </variables>
   <variables>
      <defaultValue>'placed'</defaultValue>
      <description></description>
      <id>f2a6318f-ce6f-472b-948b-ce00b006978a</id>
      <masked>false</masked>
      <name>status</name>
   </variables>
   <variables>
      <defaultValue>true</defaultValue>
      <description></description>
      <id>9105f61a-4ba1-4e7b-bc7c-b9fd1ae7d1b3</id>
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
