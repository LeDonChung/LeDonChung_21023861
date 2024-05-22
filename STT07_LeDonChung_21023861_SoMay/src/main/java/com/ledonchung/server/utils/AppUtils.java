package com.ledonchung.server.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class AppUtils {
	public static final String PERSISTENCE_UNIT_NAME = "ServerProject MariaDB";
	public static final int PORT = 3861;
	public static EntityManager getEntityManager() {
        return Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
    }
}
