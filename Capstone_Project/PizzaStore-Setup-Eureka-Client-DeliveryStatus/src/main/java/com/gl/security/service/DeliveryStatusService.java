package com.gl.security.service;

import com.gl.security.model.DeliveryStatus;
import java.util.List;

public interface DeliveryStatusService {
    DeliveryStatus saveDeliveryStatus(DeliveryStatus status);
    List<DeliveryStatus> getAllStatuses();
    DeliveryStatus getStatusById(Long id);
}
