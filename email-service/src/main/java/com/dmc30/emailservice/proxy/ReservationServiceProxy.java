package com.dmc30.emailservice.proxy;

import com.dmc30.emailservice.service.bean.ReservationBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "reservation-service", url = "localhost:9004")
public interface ReservationServiceProxy {

    @GetMapping("/reservations/expiree/{userId}")
    List<ReservationBean> getReservationsExpireesByUserId(@PathVariable(name = "userId") Long userId);
}
