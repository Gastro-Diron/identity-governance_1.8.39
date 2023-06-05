
/**
 * ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:11 UTC)
 */

package org.wso2.carbon.identity.recovery.stub;

public class ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1685960050126L;
    
    private org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException faultMessage;

    
        public ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException() {
            super("ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException");
        }

        public ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException(java.lang.String s) {
           super(s);
        }

        public ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ChallengeQuestionManagementAdminServiceIdentityRecoveryExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.identity.recovery.stub.ChallengeQuestionManagementAdminServiceIdentityRecoveryException getFaultMessage(){
       return faultMessage;
    }
}
    