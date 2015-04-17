/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.mymoney.domain;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 *
 * @author Joel
 */
public class ExpenseGroup {

    /**
     * Name of the group.
     */
    private String name;
    /**
     * Period in witch the group can be used.
     */
    private Period period;
    /**
     * This argument is opcional and sets a budget for the current group.
     */
    private BigDecimal estimation;

    /**
     * Creates Expense Group.
     *
     * @param expenseGroupText Expense Group name
     * @param beginPeriod Beginning of period
     * @param endPeriod End of period
     * @param budgetEstimation The value of budget estimation
     */
    public ExpenseGroup(final String expenseGroupText,
            final Calendar beginPeriod,
            final Calendar endPeriod, final BigDecimal budgetEstimation) {
        this.name = expenseGroupText;
        this.period = new Period(beginPeriod, endPeriod);
        this.estimation = budgetEstimation;
    }
}
