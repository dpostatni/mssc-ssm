package guru.springframework.msscssm.domain;

/**
 * @author Danillo Postatni Moreno on 13/03/2023
 */
public enum PaymentEvent {
    PRE_AUTHORIZE, PRE_AUTH_APPROVED, PRE_AUTH_DECLINED, AUTHORIZE, AUTH_APPROVED, AUTH_DECLINED
}
