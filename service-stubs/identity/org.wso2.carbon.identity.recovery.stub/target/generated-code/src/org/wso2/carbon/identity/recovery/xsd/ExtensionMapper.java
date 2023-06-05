
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:19 UTC)
 */

        
            package org.wso2.carbon.identity.recovery.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://model.common.application.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "User".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.application.common.model.xsd.User.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://model.recovery.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ChallengeQuestion".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://recovery.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "IdentityRecoveryException".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.recovery.xsd.IdentityRecoveryException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://model.recovery.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "UserChallengeAnswer".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.recovery.stub.model.UserChallengeAnswer.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://base.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "IdentityException".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.base.xsd.IdentityException.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    