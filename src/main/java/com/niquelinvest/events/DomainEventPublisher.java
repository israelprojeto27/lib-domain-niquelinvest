package com.niquelinvest.events;

@FunctionalInterface
public interface DomainEventPublisher {
    void publishEvent(DomainEvent event);
}
