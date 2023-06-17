package com.atul.atmMachine.service;

public class CashDispenserProcessor {
    CashDispenserProcessor cashDispenserProcessor;

    public CashDispenserProcessor(CashDispenserProcessor cashDispenserProcessor) {
        this.cashDispenserProcessor = cashDispenserProcessor;
    }

    public void withDrawCash(Atm atm, int remainingAmount) {
        if (cashDispenserProcessor != null) {
            cashDispenserProcessor.withDrawCash(atm, remainingAmount);
        }
    }
}
