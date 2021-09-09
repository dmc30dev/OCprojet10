package com.dmc30.clientui.shared.bean.reservation;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ReservationBean {

    private Long id;
    private Date dateReservation;
    private boolean expiree;
    private Long utilisateurId;
    private Long livreId;
    private Long bibliothequeId;

}