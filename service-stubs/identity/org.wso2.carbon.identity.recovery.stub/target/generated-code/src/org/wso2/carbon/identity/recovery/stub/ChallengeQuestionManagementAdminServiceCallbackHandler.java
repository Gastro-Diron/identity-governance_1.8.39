
/**
 * ChallengeQuestionManagementAdminServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:11 UTC)
 */

    package org.wso2.carbon.identity.recovery.stub;

    /**
     *  ChallengeQuestionManagementAdminServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ChallengeQuestionManagementAdminServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ChallengeQuestionManagementAdminServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ChallengeQuestionManagementAdminServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for setChallengeQuestionsOfTenant method
            * override this method for handling normal response from setChallengeQuestionsOfTenant operation
            */
           public void receiveResultsetChallengeQuestionsOfTenant(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from setChallengeQuestionsOfTenant operation
           */
            public void receiveErrorsetChallengeQuestionsOfTenant(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteChallengeQuestionsOfTenant method
            * override this method for handling normal response from deleteChallengeQuestionsOfTenant operation
            */
           public void receiveResultdeleteChallengeQuestionsOfTenant(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteChallengeQuestionsOfTenant operation
           */
            public void receiveErrordeleteChallengeQuestionsOfTenant(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for setUserChallengeAnswers method
            * override this method for handling normal response from setUserChallengeAnswers operation
            */
           public void receiveResultsetUserChallengeAnswers(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from setUserChallengeAnswers operation
           */
            public void receiveErrorsetUserChallengeAnswers(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getChallengeQuestionsForUser method
            * override this method for handling normal response from getChallengeQuestionsForUser operation
            */
           public void receiveResultgetChallengeQuestionsForUser(
                    org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getChallengeQuestionsForUser operation
           */
            public void receiveErrorgetChallengeQuestionsForUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getChallengeQuestionsForLocale method
            * override this method for handling normal response from getChallengeQuestionsForLocale operation
            */
           public void receiveResultgetChallengeQuestionsForLocale(
                    org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getChallengeQuestionsForLocale operation
           */
            public void receiveErrorgetChallengeQuestionsForLocale(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getUserChallengeAnswers method
            * override this method for handling normal response from getUserChallengeAnswers operation
            */
           public void receiveResultgetUserChallengeAnswers(
                    org.wso2.carbon.identity.recovery.stub.model.UserChallengeAnswer[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUserChallengeAnswers operation
           */
            public void receiveErrorgetUserChallengeAnswers(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getChallengeQuestionsOfTenant method
            * override this method for handling normal response from getChallengeQuestionsOfTenant operation
            */
           public void receiveResultgetChallengeQuestionsOfTenant(
                    org.wso2.carbon.identity.recovery.stub.model.ChallengeQuestion[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getChallengeQuestionsOfTenant operation
           */
            public void receiveErrorgetChallengeQuestionsOfTenant(java.lang.Exception e) {
            }
                


    }
    