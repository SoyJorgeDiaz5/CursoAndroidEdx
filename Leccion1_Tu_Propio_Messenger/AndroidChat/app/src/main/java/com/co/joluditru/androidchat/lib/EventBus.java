package com.co.joluditru.androidchat.lib;

/**
 * Created by joluditru on 26/07/2016.
 */
public interface EventBus {
    void register(Object subscriber);
    void unregister(Object subscriber);
    void post(Object event);
}
