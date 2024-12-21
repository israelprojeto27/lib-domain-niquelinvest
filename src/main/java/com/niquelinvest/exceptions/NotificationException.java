package com.niquelinvest.exceptions;

import com.niquelinvest.validation.handler.Notification;

public class NotificationException extends DomainException  {

    public NotificationException(final String aMessage, final Notification notification) {
        super(aMessage, notification.getErrors());
    }
}
