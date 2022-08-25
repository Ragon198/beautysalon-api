package com.beautysalon.beautysalonapi.data.models

import javax.persistence.*

@Entity
@Table(name = "scheduleservice")
class ScheduleService (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @ManyToOne
    @JoinColumn(name = "schedule_id", foreignKey = ForeignKey(name = "fk_scheduleServiceSchedule_id"), nullable = false)
    val schedule: Schedule,

    @ManyToOne
    @JoinColumn(name = "service_id", foreignKey = ForeignKey(name = "fk_serviceScheduleService_id"), nullable = false)
    val service: Service
)