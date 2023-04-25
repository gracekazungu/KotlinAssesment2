import java.util.jar.Attributes

fun main(){

Multiply()

    println(Password("P6YN89RGBD"))
    var account=CurrentAccount("34567tr8","agarre",45.0)
    account.deposit(678.0)
    account.withdraw(34.0)
    account.details()

    var saving=SavingAccount("34567tr8","agarre",45.0,4)
    println(saving.withdraw())
}




//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.
class Name(var firstChar:Char,var lastChar:Char,var length:Int,var vowel:String){
    fun stringName(num:String):Name{
var firstChar=num.get(0)
        var length=num.length
        var lastChar=num.get(-1)
        var vowels= arrayOf("a","e","i","o","u")
        for(v in vowels)
        if(num.startsWith(v)) {
            true
        }else{
            false
        }

        var both=Name(firstChar,lastChar, length,vowel)
        return both
    }
}

//2. Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false
fun Password(pass:String):Boolean{
    if(pass.length>=8 && pass.length<=16&&pass.contains("digit")&&pass!="password"){
return true
    }else{
        return false
    }
}
//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun Multiply(){
  for( num in 1..1000){
      if(num%8==0 && num%8==0){
          println("Bingo")
      }
      else if(num%6==0){
          println("$num is a multiple of 6")
      }else if(num%8==0){
          println("$num is a multiple of 8")
      }
  }
}
//4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)

 open class CurrentAccount(var accountnumber:String,var accountname:String,var balance:Double){
  fun deposit(amount:Double){
      var sum=amount+balance
      println(sum)
  }
    fun withdraw(amount: Double){
        var decrement=balance-amount
        println(decrement)
    }
    fun details(){
        println("Account number $accountnumber with balance $balance is operated by $accountname")
    }
}
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
class SavingAccount(accountnumber:String,accountname:String, balance:Double,var withdrawals:Int):CurrentAccount(accountnumber,accountname,balance){
    fun withdraw(){
     if (withdrawals<4) {
         withdrawals++
     }
    }
}