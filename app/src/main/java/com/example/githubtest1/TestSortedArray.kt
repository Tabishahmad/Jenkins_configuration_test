package com.example.githubtest1

class TestSortedArray {
    //To Be Enter
    val coinA_want = 1
    val coinB_want = 2
    val amount_for_coinB = 3

    //Initial Status
    val initialCoinA = 1
    val intialCointB = 0

    fun getCointA_After_SpendCointA():Int{
        return 3;
    }
    fun fullFillHerWish(){
        val loopReq = (requiredCoinA_For_CoinB()/getCointA_After_SpendCointA())+1


    }
    fun requiredCoinA_For_CoinB():Int{
        return coinB_want*amount_for_coinB
    }
    fun getCointA(paidCointA:Int):Int {
        return paidCointA*3
    }

}