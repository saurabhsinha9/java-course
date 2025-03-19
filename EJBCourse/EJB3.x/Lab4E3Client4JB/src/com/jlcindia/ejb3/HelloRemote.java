package com.jlcindia.ejb3;

import javax.ejb.Remote;

@Remote
public interface HelloRemote {
public String getMessage(String name);
}
