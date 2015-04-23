/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.mymoney.persistence.inmemory;

import eapli.mymoney.persistence.BudgetRepository;
import eapli.mymoney.persistence.ExpenseGroupRepository;
import eapli.mymoney.persistence.ExpenseRepository;
import eapli.mymoney.persistence.ExpenseTypeRepository;
import eapli.mymoney.persistence.PaymentMethodsRepository;
import eapli.mymoney.persistence.RepositoryFactory;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class InMemoryRepositoryFactory implements RepositoryFactory {

    @Override
    public ExpenseTypeRepository getExpenseTypeRepository() {
        return new eapli.mymoney.persistence.inmemory.ExpenseTypeRepositoryImpl();
    }

    @Override
    public PaymentMethodsRepository getPaymentMethodsRepository() {
        return new eapli.mymoney.persistence.inmemory.PaymentMethodRepositoryImpl();

    }

    @Override
    public ExpenseGroupRepository getExpenseGroupRepository() {
        return new eapli.mymoney.persistence.inmemory.ExpenseGroupRepositoryImpl();
    }

    @Override
    public BudgetRepository getBudgetRepository() {
        return new eapli.mymoney.persistence.inmemory.BudgetRepositoryImpl();
    }

    @Override
    public ExpenseRepository getExpenseRepository() {
        return new eapli.mymoney.persistence.inmemory.ExpenseClassRepositoryImpl();
    }
}
