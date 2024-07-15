package org.dafe.tripTix.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "trip")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "vehicle_type_id")
    private VehicleType vehicleType;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private TransportRoute route;

    @ManyToOne
    private Terminal from;

    @ManyToOne
    private Terminal to;

    private TripType tripType;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime; // Only for round trips
    private int availableSeats;
    private double price;
}
