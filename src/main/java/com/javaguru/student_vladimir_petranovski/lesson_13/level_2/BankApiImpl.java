package com.javaguru.student_vladimir_petranovski.lesson_13.level_2;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {
    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
        if (credentials.isExistRole(Role.CAN_SEARCH_CLIENTS)) {
            for (BankClient bankClient : clients) {
                if (bankClient.getUid().equals(uid)) {
                    return Optional.of(bankClient);
                }
            }
        } else {
            throw new AccessDeniedException();
        }
        return Optional.empty();
    }
}
