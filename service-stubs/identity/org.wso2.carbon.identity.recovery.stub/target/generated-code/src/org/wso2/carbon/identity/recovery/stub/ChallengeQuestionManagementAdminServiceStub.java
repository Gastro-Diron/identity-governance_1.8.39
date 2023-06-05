
/**
 * ChallengeQuestionManagementAdminServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:11 UTC)
 */
        package org.wso2.carbon.identity.recovery.stub;

        

        /*
        *  ChallengeQuestionManagementAdminServiceStub java implementation
        */

        
        public class ChallengeQuestionManagementAdminServiceStub extends org.apache.axis2.client.Stub
        implements ChallengeQuestionManagementAdminService{
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("ChallengeQuestionManagementAdminService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[7];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org", "setChallengeQuestionsOfTenant"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org", "deleteChallengeQuestionsOfTenant"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org", "setUserChallengeAnswers"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org", "getChallengeQuestionsForUser"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org", "getChallengeQuestionsForLocale"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org", "getUserChallengeAnswers"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org", "getChallengeQuestionsOfTenant"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org","ChallengeQuestionManagementAdminServiceIdentityRecoveryException"), "setChallengeQuestionsOfTenant"),"org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org","ChallengeQuestionManagementAdminServiceIdentityRecoveryException"), "setChallengeQuestionsOfTenant"),"org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org","ChallengeQuestionManagementAdminServiceIdentityRecoveryException"), "setChallengeQuestionsOfTenant"),"org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org","ChallengeQuestionManagementAdminServiceIdentityRecoveryException"), "deleteChallengeQuestionsOfTenant"),"org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org","ChallengeQuestionManagementAdminServiceIdentityRecoveryException"), "deleteChallengeQuestionsOfTenant"),"org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org","ChallengeQuestionManagementAdminServiceIdentityRecoveryException"), "deleteChallengeQuestionsOfTenant"),"org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org","ChallengeQuestionManagementAdminServiceIdentityRecoveryException"), "setUserChallengeAnswers"),"org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org","ChallengeQuestionManagementAdminServiceIdentityRecoveryException"), "setUserChallengeAnswers"),"org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org","ChallengeQuestionManagementAdminServiceIdentityRecoveryException"), "setUserChallengeAnswers"),"org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org","ChallengeQuestionManagementAdminServiceIdentityRecoveryException"), "getChallengeQuestionsForUser"),"org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org","ChallengeQuestionManagementAdminServiceIdentityRecoveryException"), "getChallengeQuestionsForUser"),"org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org","ChallengeQuestionManagementAdminServiceIdentityRecoveryException"), "getChallengeQuestionsForUser"),"org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org","ChallengeQuestionManagementAdminServiceIdentityRecoveryException"), "getChallengeQuestionsForLocale"),"org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org","ChallengeQuestionManagementAdminServiceIdentityRecoveryException"), "getChallengeQuestionsForLocale"),"org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org","ChallengeQuestionManagementAdminServiceIdentityRecoveryException"), "getChallengeQuestionsForLocale"),"org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org","ChallengeQuestionManagementAdminServiceIdentityRecoveryException"), "getUserChallengeAnswers"),"org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org","ChallengeQuestionManagementAdminServiceIdentityRecoveryException"), "getUserChallengeAnswers"),"org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org","ChallengeQuestionManagementAdminServiceIdentityRecoveryException"), "getUserChallengeAnswers"),"org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org","ChallengeQuestionManagementAdminServiceIdentityRecoveryException"), "getChallengeQuestionsOfTenant"),"org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org","ChallengeQuestionManagementAdminServiceIdentityRecoveryException"), "getChallengeQuestionsOfTenant"),"org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org","ChallengeQuestionManagementAdminServiceIdentityRecoveryException"), "getChallengeQuestionsOfTenant"),"org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public ChallengeQuestionManagementAdminServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public ChallengeQuestionManagementAdminServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
            //Set the soap version
            _serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
        
    
    }

    /**
     * Default Constructor
     */
    public ChallengeQuestionManagementAdminServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"https://localhost:9443/services/ChallengeQuestionManagementAdminService.ChallengeQuestionManagementAdminServiceHttpsSoap12Endpoint/" );
                
    }

    /**
     * Default Constructor
     */
    public ChallengeQuestionManagementAdminServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("https://localhost:9443/services/ChallengeQuestionManagementAdminService.ChallengeQuestionManagementAdminServiceHttpsSoap12Endpoint/" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public ChallengeQuestionManagementAdminServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminService#setChallengeQuestionsOfTenant
                     * @param setChallengeQuestionsOfTenant41
                    
                     * @throws org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException : 
                     */

                    

                            public  void setChallengeQuestionsOfTenant(

                            org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] challengeQuestions42,java.lang.String tenantDomain43)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("urn:setChallengeQuestionsOfTenant");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.identity.recovery.stub.SetChallengeQuestionsOfTenant dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    challengeQuestions42,
                                                    tenantDomain43,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org",
                                                    "setChallengeQuestionsOfTenant")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setChallengeQuestionsOfTenant"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setChallengeQuestionsOfTenant"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setChallengeQuestionsOfTenant"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException){
                          throw (org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminService#startsetChallengeQuestionsOfTenant
                    * @param setChallengeQuestionsOfTenant41
                
                */
                public  void startsetChallengeQuestionsOfTenant(

                 org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] challengeQuestions42,java.lang.String tenantDomain43,

                  final org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("urn:setChallengeQuestionsOfTenant");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.identity.recovery.stub.SetChallengeQuestionsOfTenant dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    challengeQuestions42,
                                                    tenantDomain43,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org",
                                                    "setChallengeQuestionsOfTenant")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminService#deleteChallengeQuestionsOfTenant
                     * @param deleteChallengeQuestionsOfTenant45
                    
                     * @throws org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException : 
                     */

                    

                            public  void deleteChallengeQuestionsOfTenant(

                            org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] challengeQuestions46,java.lang.String tenantDomain47)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("urn:deleteChallengeQuestionsOfTenant");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.identity.recovery.stub.DeleteChallengeQuestionsOfTenant dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    challengeQuestions46,
                                                    tenantDomain47,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org",
                                                    "deleteChallengeQuestionsOfTenant")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"deleteChallengeQuestionsOfTenant"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"deleteChallengeQuestionsOfTenant"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"deleteChallengeQuestionsOfTenant"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException){
                          throw (org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminService#startdeleteChallengeQuestionsOfTenant
                    * @param deleteChallengeQuestionsOfTenant45
                
                */
                public  void startdeleteChallengeQuestionsOfTenant(

                 org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] challengeQuestions46,java.lang.String tenantDomain47,

                  final org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
             _operationClient.getOptions().setAction("urn:deleteChallengeQuestionsOfTenant");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.identity.recovery.stub.DeleteChallengeQuestionsOfTenant dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    challengeQuestions46,
                                                    tenantDomain47,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org",
                                                    "deleteChallengeQuestionsOfTenant")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[1].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[1].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminService#setUserChallengeAnswers
                     * @param setUserChallengeAnswers49
                    
                     * @throws org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException : 
                     */

                    

                            public  void setUserChallengeAnswers(

                            org.wso2.carbon.identity.application.common.model.xsd.User user50,org.wso2.carbon.identity.recovery.stub.model.UserChallengeAnswer[] userChallengeAnswers51)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("urn:setUserChallengeAnswers");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.identity.recovery.stub.SetUserChallengeAnswers dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    user50,
                                                    userChallengeAnswers51,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org",
                                                    "setUserChallengeAnswers")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setUserChallengeAnswers"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setUserChallengeAnswers"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setUserChallengeAnswers"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException){
                          throw (org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminService#startsetUserChallengeAnswers
                    * @param setUserChallengeAnswers49
                
                */
                public  void startsetUserChallengeAnswers(

                 org.wso2.carbon.identity.application.common.model.xsd.User user50,org.wso2.carbon.identity.recovery.stub.model.UserChallengeAnswer[] userChallengeAnswers51,

                  final org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
             _operationClient.getOptions().setAction("urn:setUserChallengeAnswers");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.identity.recovery.stub.SetUserChallengeAnswers dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    user50,
                                                    userChallengeAnswers51,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org",
                                                    "setUserChallengeAnswers")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[2].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[2].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminService#getChallengeQuestionsForUser
                     * @param getChallengeQuestionsForUser53
                    
                     * @throws org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException : 
                     */

                    

                            public  org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] getChallengeQuestionsForUser(

                            org.wso2.carbon.identity.application.common.model.xsd.User user54)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("urn:getChallengeQuestionsForUser");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForUser dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    user54,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org",
                                                    "getChallengeQuestionsForUser")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForUserResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetChallengeQuestionsForUserResponse_return((org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForUserResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getChallengeQuestionsForUser"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getChallengeQuestionsForUser"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getChallengeQuestionsForUser"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException){
                          throw (org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminService#startgetChallengeQuestionsForUser
                    * @param getChallengeQuestionsForUser53
                
                */
                public  void startgetChallengeQuestionsForUser(

                 org.wso2.carbon.identity.application.common.model.xsd.User user54,

                  final org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
             _operationClient.getOptions().setAction("urn:getChallengeQuestionsForUser");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForUser dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    user54,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org",
                                                    "getChallengeQuestionsForUser")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForUserResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetChallengeQuestionsForUser(
                                            getGetChallengeQuestionsForUserResponse_return((org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForUserResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetChallengeQuestionsForUser(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getChallengeQuestionsForUser"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getChallengeQuestionsForUser"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getChallengeQuestionsForUser"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException){
														callback.receiveErrorgetChallengeQuestionsForUser((org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetChallengeQuestionsForUser(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetChallengeQuestionsForUser(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetChallengeQuestionsForUser(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetChallengeQuestionsForUser(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetChallengeQuestionsForUser(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetChallengeQuestionsForUser(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetChallengeQuestionsForUser(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetChallengeQuestionsForUser(f);
                                            }
									    } else {
										    callback.receiveErrorgetChallengeQuestionsForUser(f);
									    }
									} else {
									    callback.receiveErrorgetChallengeQuestionsForUser(f);
									}
								} else {
								    callback.receiveErrorgetChallengeQuestionsForUser(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetChallengeQuestionsForUser(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[3].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[3].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminService#getChallengeQuestionsForLocale
                     * @param getChallengeQuestionsForLocale57
                    
                     * @throws org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException : 
                     */

                    

                            public  org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] getChallengeQuestionsForLocale(

                            java.lang.String tenantDomain58,java.lang.String locale59)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("urn:getChallengeQuestionsForLocale");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForLocale dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    tenantDomain58,
                                                    locale59,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org",
                                                    "getChallengeQuestionsForLocale")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForLocaleResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetChallengeQuestionsForLocaleResponse_return((org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForLocaleResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getChallengeQuestionsForLocale"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getChallengeQuestionsForLocale"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getChallengeQuestionsForLocale"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException){
                          throw (org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminService#startgetChallengeQuestionsForLocale
                    * @param getChallengeQuestionsForLocale57
                
                */
                public  void startgetChallengeQuestionsForLocale(

                 java.lang.String tenantDomain58,java.lang.String locale59,

                  final org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
             _operationClient.getOptions().setAction("urn:getChallengeQuestionsForLocale");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForLocale dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    tenantDomain58,
                                                    locale59,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org",
                                                    "getChallengeQuestionsForLocale")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForLocaleResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetChallengeQuestionsForLocale(
                                            getGetChallengeQuestionsForLocaleResponse_return((org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForLocaleResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetChallengeQuestionsForLocale(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getChallengeQuestionsForLocale"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getChallengeQuestionsForLocale"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getChallengeQuestionsForLocale"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException){
														callback.receiveErrorgetChallengeQuestionsForLocale((org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetChallengeQuestionsForLocale(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetChallengeQuestionsForLocale(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetChallengeQuestionsForLocale(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetChallengeQuestionsForLocale(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetChallengeQuestionsForLocale(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetChallengeQuestionsForLocale(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetChallengeQuestionsForLocale(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetChallengeQuestionsForLocale(f);
                                            }
									    } else {
										    callback.receiveErrorgetChallengeQuestionsForLocale(f);
									    }
									} else {
									    callback.receiveErrorgetChallengeQuestionsForLocale(f);
									}
								} else {
								    callback.receiveErrorgetChallengeQuestionsForLocale(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetChallengeQuestionsForLocale(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[4].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[4].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminService#getUserChallengeAnswers
                     * @param getUserChallengeAnswers62
                    
                     * @throws org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException : 
                     */

                    

                            public  org.wso2.carbon.identity.recovery.stub.model.UserChallengeAnswer[] getUserChallengeAnswers(

                            org.wso2.carbon.identity.application.common.model.xsd.User user63)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("urn:getUserChallengeAnswers");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.identity.recovery.stub.GetUserChallengeAnswers dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    user63,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org",
                                                    "getUserChallengeAnswers")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.identity.recovery.stub.GetUserChallengeAnswersResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetUserChallengeAnswersResponse_return((org.wso2.carbon.identity.recovery.stub.GetUserChallengeAnswersResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUserChallengeAnswers"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUserChallengeAnswers"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUserChallengeAnswers"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException){
                          throw (org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminService#startgetUserChallengeAnswers
                    * @param getUserChallengeAnswers62
                
                */
                public  void startgetUserChallengeAnswers(

                 org.wso2.carbon.identity.application.common.model.xsd.User user63,

                  final org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
             _operationClient.getOptions().setAction("urn:getUserChallengeAnswers");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.identity.recovery.stub.GetUserChallengeAnswers dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    user63,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org",
                                                    "getUserChallengeAnswers")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.identity.recovery.stub.GetUserChallengeAnswersResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetUserChallengeAnswers(
                                            getGetUserChallengeAnswersResponse_return((org.wso2.carbon.identity.recovery.stub.GetUserChallengeAnswersResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetUserChallengeAnswers(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUserChallengeAnswers"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUserChallengeAnswers"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUserChallengeAnswers"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException){
														callback.receiveErrorgetUserChallengeAnswers((org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetUserChallengeAnswers(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUserChallengeAnswers(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUserChallengeAnswers(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUserChallengeAnswers(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUserChallengeAnswers(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUserChallengeAnswers(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUserChallengeAnswers(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUserChallengeAnswers(f);
                                            }
									    } else {
										    callback.receiveErrorgetUserChallengeAnswers(f);
									    }
									} else {
									    callback.receiveErrorgetUserChallengeAnswers(f);
									}
								} else {
								    callback.receiveErrorgetUserChallengeAnswers(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetUserChallengeAnswers(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[5].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[5].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminService#getChallengeQuestionsOfTenant
                     * @param getChallengeQuestionsOfTenant66
                    
                     * @throws org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException : 
                     */

                    

                            public  org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] getChallengeQuestionsOfTenant(

                            java.lang.String tenantDomain67)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("urn:getChallengeQuestionsOfTenant");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsOfTenant dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    tenantDomain67,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org",
                                                    "getChallengeQuestionsOfTenant")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsOfTenantResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetChallengeQuestionsOfTenantResponse_return((org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsOfTenantResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getChallengeQuestionsOfTenant"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getChallengeQuestionsOfTenant"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getChallengeQuestionsOfTenant"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException){
                          throw (org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminService#startgetChallengeQuestionsOfTenant
                    * @param getChallengeQuestionsOfTenant66
                
                */
                public  void startgetChallengeQuestionsOfTenant(

                 java.lang.String tenantDomain67,

                  final org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
             _operationClient.getOptions().setAction("urn:getChallengeQuestionsOfTenant");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsOfTenant dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    tenantDomain67,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://services.recovery.identity.carbon.wso2.org",
                                                    "getChallengeQuestionsOfTenant")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsOfTenantResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetChallengeQuestionsOfTenant(
                                            getGetChallengeQuestionsOfTenantResponse_return((org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsOfTenantResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetChallengeQuestionsOfTenant(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getChallengeQuestionsOfTenant"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getChallengeQuestionsOfTenant"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getChallengeQuestionsOfTenant"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException){
														callback.receiveErrorgetChallengeQuestionsOfTenant((org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetChallengeQuestionsOfTenant(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetChallengeQuestionsOfTenant(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetChallengeQuestionsOfTenant(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetChallengeQuestionsOfTenant(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetChallengeQuestionsOfTenant(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetChallengeQuestionsOfTenant(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetChallengeQuestionsOfTenant(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetChallengeQuestionsOfTenant(f);
                                            }
									    } else {
										    callback.receiveErrorgetChallengeQuestionsOfTenant(f);
									    }
									} else {
									    callback.receiveErrorgetChallengeQuestionsOfTenant(f);
									}
								} else {
								    callback.receiveErrorgetChallengeQuestionsOfTenant(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetChallengeQuestionsOfTenant(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[6].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[6].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //https://localhost:9443/services/ChallengeQuestionManagementAdminService.ChallengeQuestionManagementAdminServiceHttpsSoap12Endpoint/
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.recovery.stub.SetChallengeQuestionsOfTenant param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.recovery.stub.SetChallengeQuestionsOfTenant.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.recovery.stub.DeleteChallengeQuestionsOfTenant param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.recovery.stub.DeleteChallengeQuestionsOfTenant.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.recovery.stub.SetUserChallengeAnswers param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.recovery.stub.SetUserChallengeAnswers.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForLocale param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForLocale.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForLocaleResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForLocaleResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.recovery.stub.GetUserChallengeAnswers param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.recovery.stub.GetUserChallengeAnswers.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.recovery.stub.GetUserChallengeAnswersResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.recovery.stub.GetUserChallengeAnswersResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsOfTenant param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsOfTenant.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsOfTenantResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsOfTenantResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] param1,
                                    java.lang.String param2,
                                    org.wso2.carbon.identity.recovery.stub.SetChallengeQuestionsOfTenant dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.identity.recovery.stub.SetChallengeQuestionsOfTenant wrappedType = new org.wso2.carbon.identity.recovery.stub.SetChallengeQuestionsOfTenant();

                                 
                                              wrappedType.setChallengeQuestions(param1);
                                         
                                              wrappedType.setTenantDomain(param2);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.recovery.stub.SetChallengeQuestionsOfTenant.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] param1,
                                    java.lang.String param2,
                                    org.wso2.carbon.identity.recovery.stub.DeleteChallengeQuestionsOfTenant dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.identity.recovery.stub.DeleteChallengeQuestionsOfTenant wrappedType = new org.wso2.carbon.identity.recovery.stub.DeleteChallengeQuestionsOfTenant();

                                 
                                              wrappedType.setChallengeQuestions(param1);
                                         
                                              wrappedType.setTenantDomain(param2);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.recovery.stub.DeleteChallengeQuestionsOfTenant.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    org.wso2.carbon.identity.application.common.model.xsd.User param1,
                                    org.wso2.carbon.identity.recovery.stub.model.UserChallengeAnswer[] param2,
                                    org.wso2.carbon.identity.recovery.stub.SetUserChallengeAnswers dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.identity.recovery.stub.SetUserChallengeAnswers wrappedType = new org.wso2.carbon.identity.recovery.stub.SetUserChallengeAnswers();

                                 
                                              wrappedType.setUser(param1);
                                         
                                              wrappedType.setUserChallengeAnswers(param2);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.recovery.stub.SetUserChallengeAnswers.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    org.wso2.carbon.identity.application.common.model.xsd.User param1,
                                    org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForUser dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForUser wrappedType = new org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForUser();

                                 
                                              wrappedType.setUser(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForUser.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] getGetChallengeQuestionsForUserResponse_return(
                                org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForUserResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    java.lang.String param2,
                                    org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForLocale dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForLocale wrappedType = new org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForLocale();

                                 
                                              wrappedType.setTenantDomain(param1);
                                         
                                              wrappedType.setLocale(param2);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForLocale.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] getGetChallengeQuestionsForLocaleResponse_return(
                                org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForLocaleResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    org.wso2.carbon.identity.application.common.model.xsd.User param1,
                                    org.wso2.carbon.identity.recovery.stub.GetUserChallengeAnswers dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.identity.recovery.stub.GetUserChallengeAnswers wrappedType = new org.wso2.carbon.identity.recovery.stub.GetUserChallengeAnswers();

                                 
                                              wrappedType.setUser(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.recovery.stub.GetUserChallengeAnswers.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private org.wso2.carbon.identity.recovery.stub.model.UserChallengeAnswer[] getGetUserChallengeAnswersResponse_return(
                                org.wso2.carbon.identity.recovery.stub.GetUserChallengeAnswersResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsOfTenant dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsOfTenant wrappedType = new org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsOfTenant();

                                 
                                              wrappedType.setTenantDomain(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsOfTenant.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] getGetChallengeQuestionsOfTenantResponse_return(
                                org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsOfTenantResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.wso2.carbon.identity.recovery.stub.SetChallengeQuestionsOfTenant.class.equals(type)){
                
                           return org.wso2.carbon.identity.recovery.stub.SetChallengeQuestionsOfTenant.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException.class.equals(type)){
                
                           return org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.recovery.stub.DeleteChallengeQuestionsOfTenant.class.equals(type)){
                
                           return org.wso2.carbon.identity.recovery.stub.DeleteChallengeQuestionsOfTenant.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException.class.equals(type)){
                
                           return org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.recovery.stub.SetUserChallengeAnswers.class.equals(type)){
                
                           return org.wso2.carbon.identity.recovery.stub.SetUserChallengeAnswers.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException.class.equals(type)){
                
                           return org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForUser.class.equals(type)){
                
                           return org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForUserResponse.class.equals(type)){
                
                           return org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException.class.equals(type)){
                
                           return org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForLocale.class.equals(type)){
                
                           return org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForLocale.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForLocaleResponse.class.equals(type)){
                
                           return org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsForLocaleResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException.class.equals(type)){
                
                           return org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.recovery.stub.GetUserChallengeAnswers.class.equals(type)){
                
                           return org.wso2.carbon.identity.recovery.stub.GetUserChallengeAnswers.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.recovery.stub.GetUserChallengeAnswersResponse.class.equals(type)){
                
                           return org.wso2.carbon.identity.recovery.stub.GetUserChallengeAnswersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException.class.equals(type)){
                
                           return org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsOfTenant.class.equals(type)){
                
                           return org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsOfTenant.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsOfTenantResponse.class.equals(type)){
                
                           return org.wso2.carbon.identity.recovery.stub.GetChallengeQuestionsOfTenantResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException.class.equals(type)){
                
                           return org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   