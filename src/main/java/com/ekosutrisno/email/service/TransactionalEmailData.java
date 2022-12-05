package com.ekosutrisno.email.service;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Eko Sutrisno
 * Senin, 05/12/2022 13.01
 */
@Builder
@Getter
@Setter
public class TransactionalEmailData implements Serializable {
    private final String firstName;
    private final String pin;
}
