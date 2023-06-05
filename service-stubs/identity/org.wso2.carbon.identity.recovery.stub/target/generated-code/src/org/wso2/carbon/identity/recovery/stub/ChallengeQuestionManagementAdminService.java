

/**
 * ChallengeQuestionManagementAdminService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:11 UTC)
 */

    package org.wso2.carbon.identity.recovery.stub;

    /*
     *  ChallengeQuestionManagementAdminService java interface
     */

    public interface ChallengeQuestionManagementAdminService {
          

        /**
          * Auto generated method signature
          * 
                    * @param setChallengeQuestionsOfTenant12
                
             * @throws org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException : 
         */

         
                     public void setChallengeQuestionsOfTenant(

                        org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] challengeQuestions13,java.lang.String tenantDomain14)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param setChallengeQuestionsOfTenant12
            
          */
        public void startsetChallengeQuestionsOfTenant(

            org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] challengeQuestions13,java.lang.String tenantDomain14,

            final org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param deleteChallengeQuestionsOfTenant16
                
             * @throws org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException : 
         */

         
                     public void deleteChallengeQuestionsOfTenant(

                        org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] challengeQuestions17,java.lang.String tenantDomain18)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param deleteChallengeQuestionsOfTenant16
            
          */
        public void startdeleteChallengeQuestionsOfTenant(

            org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] challengeQuestions17,java.lang.String tenantDomain18,

            final org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param setUserChallengeAnswers20
                
             * @throws org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException : 
         */

         
                     public void setUserChallengeAnswers(

                        org.wso2.carbon.identity.application.common.model.xsd.User user21,org.wso2.carbon.identity.recovery.stub.model.UserChallengeAnswer[] userChallengeAnswers22)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param setUserChallengeAnswers20
            
          */
        public void startsetUserChallengeAnswers(

            org.wso2.carbon.identity.application.common.model.xsd.User user21,org.wso2.carbon.identity.recovery.stub.model.UserChallengeAnswer[] userChallengeAnswers22,

            final org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getChallengeQuestionsForUser24
                
             * @throws org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException : 
         */

         
                     public org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] getChallengeQuestionsForUser(

                        org.wso2.carbon.identity.application.common.model.xsd.User user25)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getChallengeQuestionsForUser24
            
          */
        public void startgetChallengeQuestionsForUser(

            org.wso2.carbon.identity.application.common.model.xsd.User user25,

            final org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getChallengeQuestionsForLocale28
                
             * @throws org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException : 
         */

         
                     public org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] getChallengeQuestionsForLocale(

                        java.lang.String tenantDomain29,java.lang.String locale30)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getChallengeQuestionsForLocale28
            
          */
        public void startgetChallengeQuestionsForLocale(

            java.lang.String tenantDomain29,java.lang.String locale30,

            final org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getUserChallengeAnswers33
                
             * @throws org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException : 
         */

         
                     public org.wso2.carbon.identity.recovery.stub.model.UserChallengeAnswer[] getUserChallengeAnswers(

                        org.wso2.carbon.identity.application.common.model.xsd.User user34)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getUserChallengeAnswers33
            
          */
        public void startgetUserChallengeAnswers(

            org.wso2.carbon.identity.application.common.model.xsd.User user34,

            final org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getChallengeQuestionsOfTenant37
                
             * @throws org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException : 
         */

         
                     public org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] getChallengeQuestionsOfTenant(

                        java.lang.String tenantDomain38)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getChallengeQuestionsOfTenant37
            
          */
        public void startgetChallengeQuestionsOfTenant(

            java.lang.String tenantDomain38,

            final org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    