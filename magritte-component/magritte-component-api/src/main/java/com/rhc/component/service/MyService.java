package com.rhc.component.service;

import com.rhc.component.model.MyModel;
import org.jboss.errai.bus.server.annotations.Remote;

@Remote
public interface MyService {

    MyModel execute( final String param );

}
