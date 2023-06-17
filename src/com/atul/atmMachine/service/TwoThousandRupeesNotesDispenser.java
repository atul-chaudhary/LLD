package com.atul.atmMachine.service;

public class TwoThousandRupeesNotesDispenser extends CashDispenserProcessor {
    public TwoThousandRupeesNotesDispenser(CashDispenserProcessor cashDispenserProcessor) {
        super(cashDispenserProcessor);
    }

    @Override
    public void withDrawCash(Atm atm, int remainingAmount) {
        int currentAtmBalance = atm.getBalance();
        int required = remainingAmount / 2000;
        int remaining = remainingAmount % 2000;


        if(required <= atm.getNumberOf2kNotes()){
            atm.setNumberOf2kNotes(atm.getNumberOf2kNotes() - required);
        }else if(required > atm.getNumberOf2kNotes()){
            remaining = remaining + (required - atm.getNumberOf2kNotes())*2000;
            atm.setNumberOf2kNotes(0);
        }

        if(remaining != 0){
            super.withDrawCash(atm, remaining);
        }
    }
}
