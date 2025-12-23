package org.example.assignment2qday5;


sealed class TxnType permits Credit, Debit, Transfer { }