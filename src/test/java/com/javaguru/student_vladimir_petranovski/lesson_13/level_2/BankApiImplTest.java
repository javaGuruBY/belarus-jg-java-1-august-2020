package com.javaguru.student_vladimir_petranovski.lesson_13.level_2;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankApiImplTest extends TestCase {

    private final List<BankClient> clients = new ArrayList<>();
    private BankApiImpl test;
    private BankClient bankClient;

    private UserCredentials userCredentials;
    private UserCredentials userCredentials1;
    private final List<Role> roles = new ArrayList<>();
    private final List<Role> roles1 = new ArrayList<>();

    @Before
    public void setUp() {
        test = new BankApiImpl(clients);
        roles1.add(Role.CAN_SEARCH_NOT_CLIENTS);
        roles.add(Role.CAN_SEARCH_CLIENTS);
        userCredentials = new UserCredentials(roles);
        userCredentials1 = new UserCredentials(roles1);
        bankClient = new BankClient("3", "Vladimir");
        clients.add(bankClient);
    }

    public void testFindByUidThrow() {
        try {
            test.findByUid(userCredentials1, "1");
            Assert.fail("Expected AccessDeniedException");
        } catch (AccessDeniedException e) {
            Assert.assertNotEquals("", e.getMessage());
        }
    }

    public void testFindByUidUid() throws AccessDeniedException {
        assertEquals(Optional.of(bankClient), test.findByUid(userCredentials, "3"));
    }

    public void testFindByUidEmpty() throws AccessDeniedException {
        assertEquals(Optional.empty(), test.findByUid(userCredentials, "2"));
    }


}