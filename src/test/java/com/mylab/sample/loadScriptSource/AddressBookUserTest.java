package com.mylab.sample.loadScriptSource;

import org.junit.Test;

import javax.persistence.*;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class AddressBookUserTest {

    // ======================================
    // =              Unit tests            =
    // ======================================

    @SuppressWarnings("deprecation")
	@Test
    public void shouldFindAUser() throws Exception {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sampleJPALoadScriptSourcePU");
        EntityManager em = emf.createEntityManager();

        AddressBookUser addressbookuser = em.find(AddressBookUser.class, 1L);
        assertNotNull(addressbookuser);
        assertEquals("jan", addressbookuser.getUsername());
        assertEquals("ADMIN", addressbookuser.getRole());
    }
}
